package com.example.androidlistprogmobile.Retrofit;

import com.example.androidlistprogmobile.Model.Pokedex;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IPokemonDex {
    @GET("pokedex.json")
    Observable <Pokedex> getListPokemon();
}
