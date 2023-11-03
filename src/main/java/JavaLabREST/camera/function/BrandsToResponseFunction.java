package JavaLabREST.camera.function;

import JavaLabREST.camera.dto.GetBrandsResponse;
import JavaLabREST.camera.entity.Brand;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BrandsToResponseFunction {

    public GetBrandsResponse apply(List<Brand> entities) {
        return GetBrandsResponse.builder()
            .brands(entities.stream()
                .map(brand -> GetBrandsResponse.Brand.builder()
                    .id(brand.getUuid())
                    .name(brand.getName())
                    .build())
                .toList())
            .build();
    }
}
