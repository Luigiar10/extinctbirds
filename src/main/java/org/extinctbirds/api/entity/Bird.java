package org.extinctbirds.api.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "birds")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bird {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bird")
    private Integer idBird;
    private String name;
    private String status;
    private String birthplace;
    private String sound;
    private String image;
    @Column(name = "intro_info")
    private String introInfo;
    @Column(name = "habitat_info")
    private String habitatInfo;
    @Column(name = "diet_info")
    private String dietInfo;
    @Column(name = "extinction_info")
    private String extinctionInfo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category", nullable = false)
    @JsonBackReference
    private Category category;
}
