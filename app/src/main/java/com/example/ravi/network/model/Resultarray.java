package com.example.ravi.network.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "tips_table")
public class Resultarray {

    @PrimaryKey(autoGenerate = true)
    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("date")
    private String date;
    @SerializedName("image")
    private String image;
    @SerializedName("description")
    private String description;
    @SerializedName("summary")
    private String summary;
    @SerializedName("pagelink")
    private String pagelink;
    @SerializedName("status")
    private int status;
    @SerializedName("totalViews")
    private int totalViews;
    @SerializedName("totalLikes")
    private int totalLikes;
    @SerializedName("likestatus")
    private int likestatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPagelink() {
        return pagelink;
    }

    public void setPagelink(String pagelink) {
        this.pagelink = pagelink;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getLikestatus() {
        return likestatus;
    }

    public void setLikestatus(int likestatus) {
        this.likestatus = likestatus;
    }

}
