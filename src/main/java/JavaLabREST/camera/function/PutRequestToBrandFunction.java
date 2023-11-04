package JavaLabREST.camera.function;

import JavaLabREST.camera.dto.PutBrandRequest;
import JavaLabREST.camera.entity.Brand;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.function.BiFunction;

@Component
public class PutRequestToBrandFunction implements BiFunction<UUID, PutBrandRequest, Brand> {

    public Brand apply(UUID id, PutBrandRequest request) {
        return Brand.builder()
            .uuid(id)
            .name(request.getName())
            .brandValueDollars(request.getBrandValueDollars())
            .country(request.getCountry())
            .yearOfEst(request.getYearOfEst())
            .build();
    }

}
