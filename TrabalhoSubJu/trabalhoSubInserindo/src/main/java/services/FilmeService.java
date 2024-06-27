/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import com.mycompany.trabalhosub.apiinterfaces.FilmeInterface;
import com.mycompany.trabalhosub.models.Filme;
import com.mycompany.trabalhosub.repositories.FilmeRepository;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author renat
 */
public class FilmeService {
        private EntityManager entityManager;
        private FilmeInterface filmeApi;
    private FilmeRepository filme1;

    public FilmeService(FilmeInterface filmeApi, FilmeRepository filme1) {
        this.filmeApi = filmeApi;
        this.filme1 = filme1;
    }

    public Filme insertFilme(Filme filmess) {
  
        return filme1.insert(filme1);
    
  
    
    }
    public void Gravar( Filme filme) {
        try (FileWriter writer = new FileWriter("filmes_assistidos.csv", true)) {
            writer.append(escapeCsvField(filme.getTitle())).append(',')
                    .append(escapeCsvField(filme.getYear())).append(',')
                    .append(escapeCsvField(filme.getRated())).append(',')
                    .append(escapeCsvField(filme.getReleased())).append(',')
                    .append(escapeCsvField(filme.getRuntime())).append(',')
                    .append(escapeCsvField(filme.getGenre())).append(',')
                    .append(escapeCsvField(filme.getDirector())).append(',')
                    .append(escapeCsvField(filme.getWriter())).append(',')
                    .append(escapeCsvField(filme.getActors())).append(',')
                    .append(escapeCsvField(filme.getPlot())).append(',')
                    .append(escapeCsvField(filme.getLanguage())).append(',')
                    .append(escapeCsvField(filme.getCountry())).append(',')
                    .append(escapeCsvField(filme.getAwards())).append(',')
                    .append(escapeCsvField(filme.getPoster())).append(',')
                    .append(escapeCsvField(filme.getRatings().toString())).append(',')
                    .append(escapeCsvField(filme.getMetascore())).append(',')
                    .append(escapeCsvField(filme.getImdbRating())).append(',')
                    .append(escapeCsvField(filme.getImdbVotes())).append(',')
                    .append(escapeCsvField(filme.getImdbID())).append(',')
                    .append(escapeCsvField(filme.getType())).append(',')
                    .append(escapeCsvField(filme.getDVD())).append(',')
                    .append(escapeCsvField(filme.getBoxOffice())).append(',')
                    .append(escapeCsvField(filme.getProduction())).append(',')
                    .append(escapeCsvField(filme.getWebsite())).append(',')
                    .append(escapeCsvField(filme.getResponse()))
                    .append('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }

 
        }


    private String escapeCsvField(String field) {
        if (field == null || field.isEmpty()) {
            return "";
        }
        if (field.contains(",")) {
            field = "\"" + field + "\"";
        }
        return field;
    }
}
