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
@Table(name="DIFFICULTY")
public class Difficulty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column ( name = "value",nullable = false, length = 100)
    private String value;

    @OneToMany(mappedBy = "difficulty")
    private List<Quizz> quizzs = new ArrayList<>();

    @OneToMany(mappedBy = "difficulty")
    private List<Question> questions = new ArrayList<>();


}
