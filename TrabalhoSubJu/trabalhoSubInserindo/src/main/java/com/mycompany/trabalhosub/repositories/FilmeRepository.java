/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhosub.repositories;

import com.mycompany.trabalhosub.models.Filme;
import java.util.List;

/**
 *
 * @author elias
 */
public interface FilmeRepository {
    Filme insert(FilmeRepository filme);
    Filme update(Filme filme);
    Boolean delete(Filme filme);
    
    Filme findById(Integer id); 
    List<Filme> findAll();
}
