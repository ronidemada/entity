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
@Table(name="CATEGORY")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column ( name = "value",nullable = false, length = 100)
    private String value;

    @OneToMany(mappedBy = "category")
    private List<Quizz> quizzs = new ArrayList<>();

    @ManyToMany
    private List<Question> questions = new ArrayList<>();
}
