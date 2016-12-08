package com.deceax.masterdetail;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by deceax on 12/6/2016.
 */

public interface RecipeAPI {
    @GET("/api")
    Call<RecipeList> getRecipes();
}
