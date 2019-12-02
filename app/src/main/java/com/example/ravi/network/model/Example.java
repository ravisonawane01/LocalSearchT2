
package com.example.ravi.network.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

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

}
