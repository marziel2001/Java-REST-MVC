package JavaLabREST.camera.controller.impl;

import JavaLabREST.camera.controller.api.BrandController;
import JavaLabREST.camera.dto.GetBrandsResponse;
import JavaLabREST.camera.dto.PatchBrandRequest;
import JavaLabREST.camera.dto.PutBrandRequest;
import JavaLabREST.camera.service.api.BrandService;
import JavaLabREST.camera.service.api.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class BrandDefaultController implements BrandController {

    private final BrandService service;

//    private final ModelsToResponseFunction modelsToResponse;

    @Autowired
    public BrandDefaultController(BrandService service) {
        this.service = service;
    }

    @Override
    public GetBrandsResponse getBrands() {
        return null;
    }

    @Override
    public GetBrandsResponse getBrand(UUID id) {
        return null;
    }

    @Override
    public void deleteBrand(UUID id) {

    }

    @Override
    public void putBrand(UUID id, PutBrandRequest request) {

    }

    @Override
    public void patchBrand(UUID id, PatchBrandRequest request) {

    }
}
