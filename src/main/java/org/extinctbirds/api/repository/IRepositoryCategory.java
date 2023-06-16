package org.extinctbirds.api.repository;

import org.extinctbirds.api.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryCategory extends JpaRepository<Category, Integer> {
    Category findByName(String name);
}
