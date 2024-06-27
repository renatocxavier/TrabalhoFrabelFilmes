/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhosub.repositories;

import com.mycompany.trabalhosub.models.Filme;
import com.mycompany.trabalhosub.models.FilmeAssistido;
import java.util.List;

/**
 *
 * @author elias
 */
public interface FilmeAssRepository {
    Filme insertFilme(FilmeAssistido filmeAssistido);
    FilmeAssistido update(FilmeAssistido filmeAssistido);
    Boolean delete(FilmeAssistido filmeAssistido);
    FilmeAssistido findById(Integer id); 
    List<FilmeAssistido> findAll();
}
