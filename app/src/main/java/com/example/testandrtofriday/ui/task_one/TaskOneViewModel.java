package com.example.testandrtofriday.ui.task_one;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TaskOneViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TaskOneViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is task one fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}