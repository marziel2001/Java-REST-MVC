package JavaLabREST.camera.function;

import JavaLabREST.camera.dto.GetBrandResponse;
import JavaLabREST.camera.entity.Brand;
import org.springframework.stereotype.Component;

@Component
public class BrandToResponseFunction {

    public GetBrandResponse apply(Brand entity) {
        return GetBrandResponse.builder()
            .uuid(entity.getUuid())
            .name(entity.getName())
            .brandValueDollars(entity.getBrandValueDollars())
            .country(entity.getCountry())
            .yearOfEst(entity.getYearOfEst())
            .build();
    }
}
