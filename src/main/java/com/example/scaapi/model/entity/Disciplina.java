package com.example.scaapi.model.entity;

import com.example.scaapi.model.entity.interf.IDisciplina;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disciplina implements IDisciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String ementa;
    private String bibliografia;
    private Integer cargaHoraria;

    @ManyToOne
    private Curso curso;
}
