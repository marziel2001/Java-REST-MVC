package JavaLabREST.camera.dto;

import JavaLabREST.camera.entity.Brand;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class PutModelRequest {

    private UUID brand;

    private String name;

    private Double price;

    private Integer announceYear;
}
