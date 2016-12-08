package com.deceax.masterdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by deceax on 12/7/2016.
 */

public class RecipeList {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("version")
    @Expose
    private Double version;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("results")
    @Expose
    private List<Recipe> results = null;

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The version
     */
    public Double getVersion() {
        return version;
    }

    /**
     *
     * @param version
     * The version
     */
    public void setVersion(Double version) {
        this.version = version;
    }

    /**
     *
     * @return
     * The href
     */
    public String getHref() {
        return href;
    }

    /**
     *
     * @param href
     * The href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     *
     * @return
     * The results
     */
    public List<Recipe> getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    public void setResults(List<Recipe> results) {
        this.results = results;
    }
}
