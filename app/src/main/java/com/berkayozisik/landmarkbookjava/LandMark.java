package com.berkayozisik.landmarkbookjava;

import android.graphics.drawable.Drawable;
import android.media.Image;

import java.io.Serializable;

public class LandMark implements Serializable {

    public LandMark(int image, String name, String country) {
        this.image = image;
        this.name = name;
        this.country = country;
    }
    int image;
    String name;
    String country;
}
