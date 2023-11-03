package JavaLabREST.camera.service.impl;

import JavaLabREST.camera.entity.Brand;
import JavaLabREST.camera.repository.BrandRepository;
import JavaLabREST.camera.repository.ModelRepository;
import JavaLabREST.camera.service.api.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BrandDefaultService implements BrandService {

    private final BrandRepository repository;

    private final ModelRepository modelRepository;

    @Autowired
    public BrandDefaultService(BrandRepository repository, ModelRepository modelRepository) {
        this.repository = repository;
        this.modelRepository = modelRepository;
    }


    @Override
    public List<Brand> listAll() {
        return repository.findAll();
    }


    @Override
    public void create(Brand brand) {
        repository.save(brand);
    }
}
