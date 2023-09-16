package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class QuizRunner {

    public static void main(String[] args) {
        String question = "What color is the grass?";
        HashMap<String, String> answers1 = new HashMap<>();
        answers1.put("A", "Green");
        answers1.put("B", "Red");
        answers1.put("C", "Yellow");
        String correctAnswer1 = "A";
        String question2 = "Select all that apply. \n Which numbers are odd?";
        HashMap<String, String> answers2 = new HashMap<>();
        answers2.put("A", "34");
        answers2.put("B", "33");
        answers2.put("C", "12");
        answers2.put("D", "32");
        String correctAnswer2 = "B";
        String question3 = "The Grass is green.";
        HashMap<String, String> answers3 = new HashMap<>();
        answers3.put("A", "True");
        answers3.put("B", "False");
        String correctAnswer3 = "A";
        MultipleChoice m1 = new MultipleChoice(question,answers1,correctAnswer1, "multiple choice");
        Checkbox c1 = new Checkbox(question2, answers2, correctAnswer2, "Checkbox");
        TrueFalse t1 = new TrueFalse(question3, answers3, correctAnswer3, "True or False");
        ArrayList<Question> test = new ArrayList<>();
        test.add(m1);
        test.add(c1);
        test.add(t1);

//        System.out.println(m1);

        Quiz myQuiz = new Quiz("CP",test);

        System.out.println(myQuiz.gradeQuiz());
        System.out.println(myQuiz);
    }
}
