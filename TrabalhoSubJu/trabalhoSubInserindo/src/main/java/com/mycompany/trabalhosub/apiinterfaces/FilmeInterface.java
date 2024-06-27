package com.mycompany.trabalhosub.apiinterfaces;

import com.mycompany.trabalhosub.dto.FilmeSearchResponse;
import com.mycompany.trabalhosub.models.FilmeAssistido;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface FilmeInterface {
   @GET("/")
    Call<FilmeSearchResponse> findByNome(@Query("s") String nome, @Query("apikey") String apiKey);
    
   @POST("/")
    Call<Void> insertFilme(@Body FilmeAssistido filme);
    
}

