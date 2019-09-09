package com.example.intentcameraandgallery29072019;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainModel extends ViewModel implements LifecycleObserver {
    public MainModel(){

    }
//    LiveData<String> stringLiveData;
    MutableLiveData<String> imgHinh = new MutableLiveData<>();
}
