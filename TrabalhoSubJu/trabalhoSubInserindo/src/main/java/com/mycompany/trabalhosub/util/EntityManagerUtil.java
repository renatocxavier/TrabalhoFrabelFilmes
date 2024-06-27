/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhosub.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import java.sql.Connection;
//import java.sql.DriverManager;
/**
 *
 * @author elias
 */
public class EntityManagerUtil {
       private static final EntityManagerFactory emf;
//    private static EntityManager em;
//    
//    private static Connection conn = null;
//    private static String USUARIO = "postgres";
//    private static String SENHA = "admin";
//    
    
     static {
        emf = Persistence.createEntityManagerFactory("Persistence");
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
//    public static EntityManagerFactory getEntityManagerFactory(){
//        if(emf == null){
//            emf = Persistence
//                    .createEntityManagerFactory("postgres");      
//            System.out.println("Conexão aberta");
//        }
//        return emf;
//    }
//    public static EntityManager getManager(){
//        if(em == null || !em.isOpen()){
//            em = getEntityManagerFactory().createEntityManager();
//            System.out.println("Conexão aberta");
//        }
//        return em;
//    }
//    public static void closeEntityManagerFactory(){
//        if(emf != null && emf.isOpen()){
//            emf.close();
//            System.out.println("Conexão Fechada!");
//        }
//    }
//    
//    public static Connection getConexao() {
//        try{
//            if(conn == null || conn.isClosed()) {
//                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", USUARIO, SENHA);
//                return conn;
//            }
//            
//            return conn;
//        } catch(Exception ex) {
//            conn = null;
//            System.out.println("Erro ao abrir conexão");
//        }
//        
//        return null;
//    }
//
//    public static EntityManager getEntityManager() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
    
}
