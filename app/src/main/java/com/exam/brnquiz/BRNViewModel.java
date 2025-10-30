package com.exam.brnquiz;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BRNViewModel extends ViewModel {
    private MutableLiveData<Question> quest = new MutableLiveData<>();
    public LiveData<Question> getQuest(){return quest;}

    public void setQuest(Question q){
        quest.setValue(q);
    }


}
