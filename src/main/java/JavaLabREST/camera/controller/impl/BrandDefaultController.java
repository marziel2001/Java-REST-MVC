package JavaLabREST.camera.controller.impl;

import JavaLabREST.camera.controller.api.BrandController;
import JavaLabREST.camera.dto.GetBrandResponse;
import JavaLabREST.camera.dto.GetBrandsResponse;
import JavaLabREST.camera.dto.PatchBrandRequest;
import JavaLabREST.camera.dto.PutBrandRequest;
import JavaLabREST.camera.function.BrandToResponseFunction;
import JavaLabREST.camera.function.BrandsToResponseFunction;
import JavaLabREST.camera.function.PutRequestToBrandFunction;
import JavaLabREST.camera.function.UpdateBrandWithRequestFunction;
import JavaLabREST.camera.service.api.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
        return brandsToResponse.apply(service.listAll());
    }

    @Override
    public GetBrandResponse getBrand(UUID id) {
        return service.find(id)
            .map(brandToResponse)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void putBrand(UUID id, PutBrandRequest request) {
        service.create(putRequestToBrand.apply(id, request));
    }

    @Override
    public void patchBrand(UUID id, PatchBrandRequest request) {
        service.find(id)
            .ifPresentOrElse(
                brand -> service.updateBrand(updateBrandWithRequest.apply(brand, request)),
                () -> {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND);
                }
            );
    }

    @Override
    public void deleteBrand(UUID id) {
        service.find(id)
            .ifPresentOrElse(
                brand -> service.delete(id),
                () -> {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND);
                }
            );
    }
}
