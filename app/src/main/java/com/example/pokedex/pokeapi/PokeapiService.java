package com.example.pokedex.pokeapi;

import retrofit2.Call;
import retrofit2.http.GET;

import com.example.pokedex.models.PokemonRespuesta;

public interface PokeapiService {


    @GET("pokemon")
    Call<PokemonRespuesta> GetPokemonList();

}
