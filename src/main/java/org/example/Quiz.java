package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz {
    private String studentName;
    private ArrayList<Question> questions;
    private double totalNumQuestions;
    private double numCorrectAnswers;



    public Quiz(String studentName, ArrayList<Question> questions){
        this.studentName = studentName;
        this.questions = questions;
        if(questions.size() > 0){
            this.totalNumQuestions = questions.size();
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public double getTotalNumQuestions() {
        return totalNumQuestions;
    }

    public void setTotalNumQuestions(double totalNumQuestions) {
        this.totalNumQuestions = totalNumQuestions;
    }

    public double getNumCorrectAnswers() {
        return numCorrectAnswers;
    }

    public void setNumCorrectAnswers(double numCorrectAnswers) {
        this.numCorrectAnswers = numCorrectAnswers;
    }

    //TODO special tostring to display quick info

    public double gradeQuiz(){
        Scanner getAnsFromUser = new Scanner(System.in);
        ArrayList<String> userAns = new ArrayList<>();
        for(int i = 0; i < questions.size();i++){
            System.out.println(questions.get(i).toString());
            userAns.add(getAnsFromUser.next());
        }

        for (int i = 0 ; i < questions.size(); i++){
            if(userAns.get(i).equals(questions.get(i).getCorrectAnswer())){
                this.numCorrectAnswers ++;
            }
        }
        //write if statement to determine if the answer given by the user is the same as the correct answer and if so increase score
        //use loop

        // the divide the number of correct answers by the total number of questions
        double GPA = numCorrectAnswers / questions.size();
        return GPA;
    }

    @Override
    public String toString() {
        return "Quiz \n" +
                "Student Name:'" + studentName + '\n' +
                "Number of Correct Answers: " + numCorrectAnswers;
    }
}
