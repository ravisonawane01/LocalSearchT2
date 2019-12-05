package com.example.ravi.network.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity(tableName = "tips_table")
public class Example {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @SerializedName("success")
    private Integer success;
    @SerializedName("resultarray")

    private List<Resultarray> resultarray;

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public List<Resultarray> getResultarray() {
        return resultarray;
    }

    public void setResultarray(List<Resultarray> resultarray) {
        this.resultarray = resultarray;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
