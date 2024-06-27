package com.mycompany.trabalhosub.dto;

import com.mycompany.trabalhosub.models.Filme;
import java.util.List;

public class FilmeSearchResponse {
    private List<Filme> Search;

    public List<Filme> getSearch() {
        return Search;
    }

    public void setSearch(List<Filme> search) {
        this.Search = search;
    }
}
