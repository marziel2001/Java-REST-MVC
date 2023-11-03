package JavaLabREST.camera.controller.api;

import JavaLabREST.camera.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

public interface ModelController {

    @GetMapping("api/models")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    GetModelsResponse getModels();

    @GetMapping("/api/models/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    GetModelResponse getModel();

    @GetMapping("api/brands/{brandId}/models")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    GetModelsResponse getBrandsModels(
        @PathVariable("brandId")
        UUID id
    );

    @PutMapping("/api/models/{id}")
    @ResponseStatus(HttpStatus.CREATED)
        void putModel(
            @PathVariable("id")
            UUID id,
            @RequestBody
            PutModelRequest request
    );

    @PatchMapping("/api/models/{id}")
    @ResponseStatus(HttpStatus.OK)
        void patchModel(
            @PathVariable("Id")
            UUID id,
            @RequestBody
            PatchModelRequest request
    );

    @DeleteMapping("/api/models/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteBrand(
        @PathVariable("id")
        UUID id
    );

}
