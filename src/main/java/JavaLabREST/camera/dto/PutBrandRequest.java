package JavaLabREST.camera.dto;

import JavaLabREST.camera.entity.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PutBrandRequest {

    private String name;

    private Integer yearOfEst;

    private String country;

    private Double brandValueDollars;

}
