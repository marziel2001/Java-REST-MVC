package JavaLabREST.camera.function;

import JavaLabREST.camera.dto.PatchBrandRequest;
import JavaLabREST.camera.entity.Brand;
import org.springframework.stereotype.Component;

import java.util.function.BiFunction;

@Component
public class UpdateBrandWithRequestFunction implements BiFunction<Brand, PatchBrandRequest, Brand> {

    public Brand apply(Brand entity, PatchBrandRequest request) {
        return Brand.builder()
            .uuid(entity.getUuid())
            .name(request.getName())
            .yearOfEst(request.getYearOfEst())
            .country(request.getCountry())
            .brandValueDollars(request.getBrandValueDollars())
            .build();
    }
}
