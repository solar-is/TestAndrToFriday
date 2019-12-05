package com.example.testandrtofriday.ui.task_two;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TaskTwoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TaskTwoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is task two fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}