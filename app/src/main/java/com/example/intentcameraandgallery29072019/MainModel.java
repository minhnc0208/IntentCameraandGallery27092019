package com.example.intentcameraandgallery29072019;

import android.graphics.Bitmap;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainModel extends ViewModel implements LifecycleObserver {

    public MainModel() {
    }

    MutableLiveData<Bitmap> mimgHinh = new MutableLiveData<>();

    public void setImageBitmap(Bitmap imageBitmap) {
        mimgHinh.setValue(imageBitmap);
    }

}
