package com.exam.brnquiz;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuestionFragment extends Fragment {

    public QuestionFragment() {
        // Required empty public constructor
    }

    Button submitButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        submitButton = getActivity().findViewById(R.id.questionSubmitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isQuestionRight(new Question(null,null,1))) {//question is right
                    Toast.makeText(getActivity(), "Yay! +1 Point", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getActivity(), "Wrong! Use your BRN(AI)", Toast.LENGTH_SHORT).show();
                }
            }
        });


        BRNViewModel vm = new ViewModelProvider(this).get(BRNViewModel.class);
        vm.getQuest().observe(this, new Observer<Question>(){
            @Override
            public void onChanged(Question question) {

                //question updated whenever question in view model changes. p
            }



        });

    }

    public boolean isQuestionRight(Question q){

        //question logic
        return false;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false);
    }
}
