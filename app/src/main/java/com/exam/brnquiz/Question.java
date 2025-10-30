package com.exam.brnquiz;

public class Question {

    String question;
    String[] multipleAnswer;

    int correctIndex;

    public Question(String question1, String[] multipleAnswer1, int correctIndex1){
        question = question1;
        multipleAnswer = multipleAnswer1;
        correctIndex = correctIndex1;

    }



    public String getQuestion() {
        return question;
    }

    public String[] getMultipleAnswer(){
        return multipleAnswer;
    }

    public int getCorrectIndex(){
        return correctIndex;
    }

    public void setQuestion(String s){
        question = s;
    }

    public void setMultipleAnswer(String[] s){
        multipleAnswer = s;
    }

    public void setCorrectIndex(int i){
        correctIndex = i;
    }

}
