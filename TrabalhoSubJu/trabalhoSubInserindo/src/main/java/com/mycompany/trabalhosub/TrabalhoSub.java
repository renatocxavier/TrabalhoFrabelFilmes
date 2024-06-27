/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhosub;

import com.mycompany.trabalhosub.models.FilmeAssistido;
import com.mycompany.trabalhosub.panel.Inicial;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TrabalhoSub {

    public static void main(String[] args) {
     
        new Inicial().setVisible(true);
//        
//         JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
//        fileChooser.setFileFilter(new FileNameExtensionFilter("CSV Files", "csv"));
//
//        int returnValue = fileChooser.showOpenDialog(null);
//
//        File selectedFile = null;
//        if (returnValue == JFileChooser.APPROVE_OPTION) {
//            selectedFile = fileChooser.getSelectedFile();
//          
//        } 
//        
//        //try (BufferedReader br = 
//        //        new BufferedReader(new FileReader(selectedFile.getAbsolutePath()))) {
//        try (BufferedReader br = 
//                new BufferedReader(new InputStreamReader(
//                        new FileInputStream(selectedFile.getAbsolutePath()), "UTF-8"))) {
//
//        
//        
//            String linha;
//            Integer id = 0;
//            List<FilmeAssistido> filmeList = new ArrayList<>();
//          
//            br.readLine();
//            while ((linha = br.readLine()) != null) {
//                String[] campos = linha.split(";");
//                
//                FilmeAssistido filmeAss = new FilmeAssistido();
//              
//                filmeAss.setId(id++);
//                filmeAss.setNome(campos[0]);
//             
//                filmeList.add(filmeAss);
//                
//            }
//            
//             
//            for (FilmeAssistido filme : filmeList) {
//                System.out.println(filme.toString());
//            }
//            
//        } catch (IOException ex) {
//            System.err.println("Algo deu errado..." + ex.getMessage());
//        }
//       
//        
    }
    
    
    
    
}
    
    

