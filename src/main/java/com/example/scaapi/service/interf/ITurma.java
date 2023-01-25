package com.example.scaapi.service.interf;

import com.example.scaapi.model.entity.Aluno;
import com.example.scaapi.model.entity.Disciplina;

import java.util.List;

public interface ITurma {
    public List<Aluno> getAlunos();
    public Integer getAno();
    public Integer getSemestre();
    public String getNome();
    public Disciplina getDisciplina();
}
