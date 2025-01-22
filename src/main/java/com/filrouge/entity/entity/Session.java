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
@Table(name="SESSION")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column ( name = "mode_de_jeu",nullable = false, length = 100)
    private String mode_de_jeu;
    @ManyToMany(mappedBy = "sessions")
    private List<Player> players = new ArrayList<>();
    @ManyToOne
    private Quizz quizz;
}
