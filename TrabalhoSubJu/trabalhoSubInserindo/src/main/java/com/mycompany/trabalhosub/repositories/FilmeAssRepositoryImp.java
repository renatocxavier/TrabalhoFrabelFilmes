/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhosub.repositories;

import com.mycompany.trabalhosub.models.Filme;
import com.mycompany.trabalhosub.models.FilmeAssistido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author elias
 */
public class FilmeAssRepositoryImp implements FilmeAssRepository {

    private EntityManager entityManager;

    public FilmeAssRepositoryImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public FilmeAssistido insert(FilmeAssistido filmeAssistido) {
     EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(filmeAssistido);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Filme salvo com sucesso!");
        return filmeAssistido;

    }

    /*
    public PessoaEntity insert(PessoaEntity pessoa) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(pessoa);
        transaction.commit();
        
        System.out.println("Pessoa salva com sucesso!");
        return pessoa;
    }
    */
    @Override
    public FilmeAssistido update(FilmeAssistido filmeAssistido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delete(FilmeAssistido filmeAssistido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public FilmeAssistido findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<FilmeAssistido> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Filme insertFilme(FilmeAssistido filmeAssistido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
