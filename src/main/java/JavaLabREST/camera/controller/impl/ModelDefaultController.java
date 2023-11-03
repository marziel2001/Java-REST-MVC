package JavaLabREST.camera.controller.impl;

import JavaLabREST.camera.controller.api.ModelController;
import JavaLabREST.camera.dto.GetModelResponse;
import JavaLabREST.camera.dto.GetModelsResponse;
import JavaLabREST.camera.dto.PatchModelRequest;
import JavaLabREST.camera.dto.PutModelRequest;
import JavaLabREST.camera.service.api.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ModelDefaultController implements ModelController {

    private final BrandService service;

    @Autowired
    public ModelDefaultController(BrandService service) {
        this.service = service;
    }

    @Override
    public GetModelsResponse getModels() {
        return null;
    }

    @Override
    public GetModelResponse getModel() {
        return null;
    }

    @Override
    public GetModelsResponse getBrandsModels(UUID id) {
        return null;
    }

    @Override
    public void putModel(UUID id, PutModelRequest request) {

    }

    @Override
    public void patchModel(UUID id, PatchModelRequest request) {

    }

    @Override
    public void deleteBrand(UUID id) {

    }
}
