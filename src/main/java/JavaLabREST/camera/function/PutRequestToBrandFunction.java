package JavaLabREST.camera.function;

import JavaLabREST.camera.dto.PutBrandRequest;
import JavaLabREST.camera.entity.Brand;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PutRequestToBrandFunction {

    public Brand apply(UUID id, PutBrandRequest request) {
        return Brand.builder()
            .uuid(id)
            .brandValueDollars(request.getBrandValueDollars())
            .country(request.getCountry())
            .yearOfEst(request.getYearOfEst())
            .build();
    }

}
