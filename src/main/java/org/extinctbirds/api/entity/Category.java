package org.extinctbirds.api.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Integer idCategory;
    private String name;
    private String image;
    @OneToMany(mappedBy = "idBird")
    @JsonBackReference
    private List<Bird> birds;

    public void addBird(Bird bird) {
        birds.add(bird);
        bird.setCategory(this);
    }

    public void removeBird(Bird bird) {
        birds.remove(bird);
        bird.setCategory(null);
    }

}
