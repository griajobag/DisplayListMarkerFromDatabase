package com.putuguna.markerlocation.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by putuguna on 9/30/2017.
 */

public class ListLocationModel {
    @SerializedName("data")
    private List<LocationModel> mData;

    public ListLocationModel(List<LocationModel> mData) {
        this.mData = mData;
    }

    public ListLocationModel() {
    }

    public List<LocationModel> getmData() {
        return mData;
    }

    public void setmData(List<LocationModel> mData) {
        this.mData = mData;
    }
}
