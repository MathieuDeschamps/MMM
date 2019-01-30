package com.example.boby.mmm.com.example.boby.mmm.services;

import com.example.boby.mmm.com.example.boby.mmm.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductService {

    public static final String END_POINT = "https://datagram-products-v1.p.mashape.com/storeproduct";

    @GET("/ean/{upc}/")
    Call<List<Product>> listProduct(@Path("upc") String upc);

    }
