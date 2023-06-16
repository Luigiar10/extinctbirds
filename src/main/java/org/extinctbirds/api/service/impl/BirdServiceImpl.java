package org.extinctbirds.api.service.impl;

import org.extinctbirds.api.entity.Bird;
import org.extinctbirds.api.entity.Category;
import org.extinctbirds.api.repository.IRepositoryBird;
import org.extinctbirds.api.repository.IRepositoryCategory;
import org.extinctbirds.api.service.IBirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BirdServiceImpl implements IBirdService {

    @Autowired
    private IRepositoryBird repositoryBird;
    @Autowired
    private IRepositoryCategory repositoryCategory;

    @Override
    public List<Bird> getBirds() {
        return repositoryBird.findAll();
    }

    public List<Bird> getBirdsByCategory(String nameCategory) {
        Category category = repositoryCategory.findByName(nameCategory);
        return repositoryBird.findByCategory(category);
    }

    public Bird getBirdById(String name) {
        return repositoryBird.findByName(name);
    }

}
