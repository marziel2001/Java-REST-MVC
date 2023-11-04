package JavaLabREST.camera.function;

import JavaLabREST.camera.dto.GetBrandResponse;
import JavaLabREST.camera.entity.Brand;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class BrandToResponseFunction implements Function<Brand, GetBrandResponse> {

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
