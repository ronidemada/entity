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
@Table(name="QUESTION")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column( name = "value",nullable = false, length = 100)
    private String value;

    @ManyToOne
    private Difficulty difficulty;

    @ManyToMany
    private List<Quizz> quizzs = new ArrayList<>();

    @ManyToMany(mappedBy = "questions")
    private List<Category> categories = new ArrayList<>();

    @ManyToMany(mappedBy = "questions")
    private List<Answer> answers = new ArrayList<>();
}
