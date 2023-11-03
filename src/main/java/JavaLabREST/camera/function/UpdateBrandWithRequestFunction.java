package JavaLabREST.camera.function;

import JavaLabREST.camera.dto.PatchBrandRequest;
import JavaLabREST.camera.entity.Brand;
import org.springframework.stereotype.Component;

@Component
public class UpdateBrandWithRequestFunction {

    public Brand apply(Brand entity, PatchBrandRequest request) {
        return Brand.builder()
            .uuid(entity.getUuid())
            .name(request.getName())
            .yearOfEst(request.getYearOfEst())
            .country(request.getCountry())
            .build();
    }
}