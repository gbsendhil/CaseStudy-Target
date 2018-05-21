package com.target.dealbrowserpoc.dealbrowser.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.math.BigDecimal;


public class Product implements Parcelable{

    private static final String TAG = "Product";

    private int index;
    private int id;
    private String title;
    private String description;
    private int image;
    private BigDecimal originalPrice;
    private BigDecimal salePrice;
    private String aisle;


    public Product(int index,int id, String title, String description, BigDecimal originalPrice, BigDecimal salePrice,int image,String aisle) {
        this.index = index;
        this.id = id;
        this.title = title;
        this.description = description;
        this.originalPrice = originalPrice;
        this.salePrice = salePrice;
        this.image = image;
        this.aisle = aisle;
    }

    public Product() {

    }

    protected Product(Parcel in) {
        title = in.readString();
        description = in.readString();
        image = in.readInt();
        id = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(description);
        dest.writeInt(image);
        dest.writeInt(id);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };


    public boolean hasSalePrice(){
        double salePrice = this.salePrice.doubleValue();
        if(salePrice > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String getTAG() {
        return TAG;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }



}
