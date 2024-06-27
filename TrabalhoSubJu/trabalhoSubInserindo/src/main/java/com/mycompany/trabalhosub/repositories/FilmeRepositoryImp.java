/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhosub.repositories;

import com.mycompany.trabalhosub.models.Filme;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author elias
 */
public class FilmeRepositoryImp implements FilmeRepository {

    private EntityManager entityManager;

    public FilmeRepositoryImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Filme insert(FilmeRepository filme) {
        
//           try (FileWriter writer = new FileWriter("filmes_assistidos.csv", true)) {
//                     writer.append(escapeCsvField(filme.getTitle())).append(',')
//                    .append(escapeCsvField(filme.getYear())).append(',')
//                    .append(escapeCsvField(filme.getRated())).append(',')
//                    .append(escapeCsvField(filme.getReleased())).append(',')
//                    .append(escapeCsvField(filme.getRuntime())).append(',')
//                    .append(escapeCsvField(filme.getGenre())).append(',')
//                    .append(escapeCsvField(filme.getDirector())).append(',')
//                    .append(escapeCsvField(filme.getWriter())).append(',')
//                    .append(escapeCsvField(filme.getActors())).append(',')
//                    .append(escapeCsvField(filme.getPlot())).append(',')
//                    .append(escapeCsvField(filme.getLanguage())).append(',')
//                    .append(escapeCsvField(filme.getCountry())).append(',')
//                    .append(escapeCsvField(filme.getAwards())).append(',')
//                    .append(escapeCsvField(filme.getPoster())).append(',')
//                    .append(escapeCsvField(filme.getRatings().toString())).append(',')
//                    .append(escapeCsvField(filme.getMetascore())).append(',')
//                    .append(escapeCsvField(filme.getImdbRating())).append(',')
//                    .append(escapeCsvField(filme.getImdbVotes())).append(',')
//                    .append(escapeCsvField(filme.getImdbID())).append(',')
//                    .append(escapeCsvField(filme.getType())).append(',')
//                    .append(escapeCsvField(filme.getDVD())).append(',')
//                    .append(escapeCsvField(filme.getBoxOffice())).append(',')
//                    .append(escapeCsvField(filme.getProduction())).append(',')
//                    .append(escapeCsvField(filme.getWebsite())).append(',')
//                    .append(escapeCsvField(filme.getResponse()))
//                    .append('\n');
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(filme);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Filme salvo com sucesso!");
        return (Filme) filme;
    }

    @Override
    public Filme update(Filme filme) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(filme);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Cliente atualizado com sucesso!");
        return filme;
    }

    @Override
    public Boolean delete(Filme filme) {        
        EntityTransaction transaction = entityManager.getTransaction();
        
        try {
            transaction.begin();
            entityManager.remove(filme);
            transaction.commit();
            entityManager.close();

            System.out.println("Cliente removido com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Cliente atualizado com sucesso!");
            return false;
        }
       
    }

    @Override
    public Filme findById(Integer id) {
        return entityManager.find(Filme.class, id);
    }

    @Override
    public List<Filme> findAll() {
//        return entityManager.createQuery("SELECT c FROM Cliente c"
//                + "WHERE c.nome = :nome").setParameter("cpf", "")
//                .getSingleResult();

        return entityManager.createQuery("SELECT c FROM tb_filmes c",
                Filme.class).getResultList();
                
    }

 
    
}
