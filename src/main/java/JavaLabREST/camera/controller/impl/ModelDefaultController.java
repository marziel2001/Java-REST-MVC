package JavaLabREST.camera.controller.impl;

import JavaLabREST.camera.controller.api.ModelController;
import JavaLabREST.camera.dto.GetModelResponse;
import JavaLabREST.camera.dto.GetModelsResponse;
import JavaLabREST.camera.dto.PatchModelRequest;
import JavaLabREST.camera.dto.PutModelRequest;
import JavaLabREST.camera.function.ModelToResponseFunction;
import JavaLabREST.camera.function.ModelsToResponseFunction;
import JavaLabREST.camera.function.PutRequestToModelFunction;
import JavaLabREST.camera.function.UpdateModelWithRequestFunction;
import JavaLabREST.camera.service.api.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@RestController
public class ModelDefaultController implements ModelController {

    private final ModelService service;

    private final ModelsToResponseFunction modelsToResponse;

    private final ModelToResponseFunction modelToResponse;

    private final PutRequestToModelFunction putRequestToModel;

    private final UpdateModelWithRequestFunction updateModelWithRequest;

    @Autowired
    public ModelDefaultController(
        ModelService service,
        ModelsToResponseFunction modelsToResponse,
        ModelToResponseFunction modelToResponse,
        PutRequestToModelFunction putRequestToModel,
        UpdateModelWithRequestFunction updateModelWithRequest
    ) {
        this.service = service;
        this.modelsToResponse = modelsToResponse;
        this.modelToResponse = modelToResponse;
        this.putRequestToModel = putRequestToModel;
        this.updateModelWithRequest = updateModelWithRequest;
    }

    @Override
    public GetModelsResponse getModels() {
        return modelsToResponse.apply(service.listAll());
    }

    @Override
    public GetModelResponse getModel(UUID id) {
        return service.findById(id)
            .map(modelToResponse)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public GetModelsResponse getBrandsModels(UUID id) {
        return service.findAllByBrand(id)
            .map(modelsToResponse)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void putModel(UUID id, PutModelRequest request) {
        service.create(putRequestToModel.apply(id, request));
    }

    @Override
    public void patchModel(UUID id, PatchModelRequest request) {
        service.find(id)
            .ifPresentOrElse(
                model -> service.updateModel(updateModelWithRequest.apply(model, request)),
                () -> {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND);
                });
    }

    @Override
    public void deleteModel(UUID id) {
        service.find(id)
            .ifPresentOrElse(
                model -> service.deleteModel(id),
                () -> {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND);
                }
            );
    }
}
