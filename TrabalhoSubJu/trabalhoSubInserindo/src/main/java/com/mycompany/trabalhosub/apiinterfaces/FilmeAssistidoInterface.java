package com.mycompany.trabalhosub.apiinterfaces;

import com.mycompany.trabalhosub.models.FilmeAssistido;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface FilmeAssistidoInterface {
    
    @POST("/") 
    Call<Void> insert(@Body FilmeAssistido filmeAss);
    
}
