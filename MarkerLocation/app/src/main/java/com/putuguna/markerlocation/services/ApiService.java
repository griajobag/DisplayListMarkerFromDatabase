package com.putuguna.markerlocation.services;

import com.putuguna.markerlocation.models.ListLocationModel;
import com.putuguna.markerlocation.models.LocationModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by putuguna on 30/09/17.
 */

public interface ApiService {
    @GET("JsonDisplayMarker.php")
    Call<ListLocationModel> getAllLocation();
}
