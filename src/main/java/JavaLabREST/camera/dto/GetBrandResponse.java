package JavaLabREST.camera.dto;

import JavaLabREST.camera.entity.Model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class GetBrandResponse {
    //szczegoly na temat jednej firmy
    private UUID uuid;

    private String name;

    private Integer yearOfEst;

    private String country;

    private Double brandValueDollars;

    private List<Model> models;
}
