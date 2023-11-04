package JavaLabREST.camera.controller.impl;

import JavaLabREST.camera.controller.api.BrandController;
import JavaLabREST.camera.dto.GetBrandsResponse;
import JavaLabREST.camera.dto.PatchBrandRequest;
import JavaLabREST.camera.dto.PutBrandRequest;
import JavaLabREST.camera.function.BrandToResponseFunction;
import JavaLabREST.camera.function.BrandsToResponseFunction;
import JavaLabREST.camera.function.PutRequestToBrandFunction;
import JavaLabREST.camera.function.UpdateBrandWithRequestFunction;
import JavaLabREST.camera.service.api.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class BrandDefaultController implements BrandController {

    private final BrandService service;

    private final BrandToResponseFunction brandToResponse;

    private final BrandsToResponseFunction brandsToResponse;

    private final PutRequestToBrandFunction putRequestToBrand;

    private final UpdateBrandWithRequestFunction updateBrandWithRequest;

    @Autowired
    public BrandDefaultController(
        BrandService service,
        BrandToResponseFunction brandToResponse,
        BrandsToResponseFunction brandsToResponse,
        PutRequestToBrandFunction putRequestToBrand,
        UpdateBrandWithRequestFunction updateBrandWithRequest
    ) {
        this.service = service;
        this.brandToResponse = brandToResponse;
        this.brandsToResponse = brandsToResponse;
        this.putRequestToBrand = putRequestToBrand;
        this.updateBrandWithRequest = updateBrandWithRequest;
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
