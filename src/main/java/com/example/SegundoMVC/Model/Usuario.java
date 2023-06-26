package com.example.SegundoMVC.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Usuario {

    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Id
    private Long Id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "idade")
    private int idade;

    @Column(name = "senha",nullable = false)
    private String senha;


}
