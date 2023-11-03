package JavaLabREST.camera.function;

import JavaLabREST.camera.dto.GetModelResponse;
import JavaLabREST.camera.entity.Model;
import org.springframework.stereotype.Component;

@Component
public class ModelToResponseFunction {

    public GetModelResponse apply(Model entity) {
        return GetModelResponse.builder()
            .uuid(entity.getUuid())
            .name(entity.getName())
            .price(entity.getPrice())
            .announceDate(entity.getAnnounceYear())
            .build();
    }
}
