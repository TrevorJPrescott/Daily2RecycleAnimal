package com.trevorpc.daily2_recycleanimal;

import android.graphics.drawable.Drawable;
import android.net.Uri;

import java.net.URI;
import java.net.URL;

public class Animal
{

    String name;
    String picture;
    String desc;


    public Animal(String name, String picture,String desc) {
        this.name = name;
        this.picture = picture;
        this.desc=desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
