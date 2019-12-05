package com.example.testandrtofriday.ui.task_four;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TaskFourViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TaskFourViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is task four fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}