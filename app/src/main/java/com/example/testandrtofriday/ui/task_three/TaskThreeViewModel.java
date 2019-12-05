package com.example.testandrtofriday.ui.task_three;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TaskThreeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TaskThreeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is task three fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}