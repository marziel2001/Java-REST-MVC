package JavaLabREST.camera.service.api;

import JavaLabREST.camera.entity.Brand;
import JavaLabREST.camera.entity.Model;

import java.util.List;

public interface BrandService {

    List<Brand> listAll();

    void create(Brand brand);
}
