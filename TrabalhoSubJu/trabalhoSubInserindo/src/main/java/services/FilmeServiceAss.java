/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;


import com.mycompany.trabalhosub.apiinterfaces.FilmeAssistidoInterface;
import com.mycompany.trabalhosub.models.Filme;
import com.mycompany.trabalhosub.repositories.FilmeAssRepositoryImp;
import com.mycompany.trabalhosub.models.FilmeAssistido;
import com.mycompany.trabalhosub.util.EntityManagerUtil;
import com.mycompany.trabalhosub.repositories.FilmeAssRepository;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 *
 * @author elias
 */
public class FilmeServiceAss {

    private FilmeAssistidoInterface filmeAssistidoInterface;
    private FilmeAssRepository filmeAssDao;

    
    
    
       public FilmeServiceAss(FilmeAssRepository filmeAssDao) {
        this.filmeAssDao = filmeAssDao;
    }

    public Filme insertFilme(FilmeAssistido filmess) {
        return filmeAssDao.insertFilme(filmess);
    }
//    public FilmeServiceAss(FilmeAssRepository filmeAss) {
//        this.filmeAssDao = filmeAssDao;
//        
//         Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://seu-endereco-da-api.com/")  // Substitua pelo URL base da sua API
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        filmeAssistidoInterface = retrofit.create(FilmeAssistidoInterface.class);
//    }
//
//    public FilmeServiceAss() {
//    }
//
// 
//
//    
//    
//
//
//    public FilmeAssistido insertFilme(FilmeAssistido filmeAss) {
//     filmeAssDao.insert(filmeAss);
//        
//        // Chamando a API para inserir o filme
//      
//      return (FilmeAssistido) filmeAssistidoInterface.insert(filmeAss);
//    }
    
}
//public PessoaEntity insert(PessoaEntity pessoa){
//        return pessoaRepository.insert(pessoa);
    