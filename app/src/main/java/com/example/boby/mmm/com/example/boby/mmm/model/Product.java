package com.example.boby.mmm.com.example.boby.mmm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author DESCHAMPS Mathieu && MouiMouiMuiMoui && Jammal Mahmoud
 *
 * Product
 */
public class Product {

    @SerializedName("available")
    @Expose
    private boolean available;

    @SerializedName("store_name")
    @Expose
    private String storeName;

    @SerializedName("rpc")
    @Expose
    private String rpc;

    @SerializedName("store_lon")
    @Expose
    private  double longitude;

    @SerializedName("store_lat")
    @Expose
    private double lattitude;

    @SerializedName("store_id")
    @Expose
    private String storeId;

    @SerializedName("ponderation")
    @Expose
    private int ponderation;

    @SerializedName("price")
    @Expose
    private double price;

    @SerializedName("retailer_name")
    @Expose
    private String retailerName;

}
