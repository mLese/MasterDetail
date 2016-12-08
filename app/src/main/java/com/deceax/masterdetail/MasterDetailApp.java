package com.deceax.masterdetail;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by deceax on 12/6/2016.
 */

public class MasterDetailApp extends Application implements RecipeCache {

    Retrofit retrofit;
    RecipeList cachedList;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofit = new Retrofit.Builder()
                .baseUrl("http://www.recipepuppy.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    @Override
    public RecipeList getRecipeList() {
        //TODO: return new list or error response when cache empty??
        if (cachedList == null) {
            return new RecipeList();
        } else {
            return cachedList;
        }
    }

    @Override
    public void setRecipeList(RecipeList list) {
        this.cachedList = list;
    }
}
