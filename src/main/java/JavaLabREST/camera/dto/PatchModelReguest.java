package JavaLabREST.camera.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PatchModelReguest {

    private String name;

    private Double price;

    private Integer announceYear;

}

//TODO: napisac dodawanie kategorii do wczesniejszego kodu i zobaczyc czy dziala