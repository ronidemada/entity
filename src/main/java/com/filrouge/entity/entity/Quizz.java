package com.filrouge.entity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="QUIZZ")
public class Quizz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column ( name = "title",nullable = false, length = 100)
    private String title;

    @Column ( name = "description",nullable = false, length = 100)
    private String description;

    @OneToMany(mappedBy = "quizz")
    private List<Session> sessions = new ArrayList<>();

    @ManyToMany(mappedBy = "quizzs")
    private List<Question> questions = new ArrayList<>();

    @ManyToOne
    private Difficulty difficulty;

    @ManyToOne
    private Category category;


}
