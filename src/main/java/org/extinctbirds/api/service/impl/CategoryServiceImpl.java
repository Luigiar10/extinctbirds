package org.extinctbirds.api.service.impl;

import org.extinctbirds.api.entity.Category;
import org.extinctbirds.api.repository.IRepositoryCategory;
import org.extinctbirds.api.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private IRepositoryCategory categoryRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }
}
