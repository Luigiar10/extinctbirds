package org.extinctbirds.api.repository;

import org.extinctbirds.api.entity.Bird;
import org.extinctbirds.api.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepositoryBird extends JpaRepository<Bird, Integer> {
    List<Bird> findByCategory(Category category);
    Bird findByName(String name);
}
