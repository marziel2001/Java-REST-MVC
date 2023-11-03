package JavaLabREST.camera.function;

import JavaLabREST.camera.dto.PatchModelRequest;

import JavaLabREST.camera.entity.Model;
import org.springframework.stereotype.Component;

@Component
public class UpdateModelWithRequestFunction {

    public Model apply(Model entity, PatchModelRequest request) {
        return Model.builder()
            .uuid(entity.getUuid())
            .name(request.getName())
            .announceYear(request.getAnnounceYear())
            .price(request.getPrice())
            .build();
    }
}
