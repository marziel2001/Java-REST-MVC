package JavaLabREST.camera.service.api;

import JavaLabREST.camera.entity.Brand;
import JavaLabREST.camera.entity.Model;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BrandService {

    List<Brand> listAll();

    Optional<Brand> find(UUID id);

    void create(Brand brand);

    void delete(UUID id);
    void delete(String name);

    void updateBrand(Brand newBrand);
}
