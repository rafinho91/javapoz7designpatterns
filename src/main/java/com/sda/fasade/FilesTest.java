package com.sda.fasade;

import java.io.FileNotFoundException;
import java.util.List;

public class FilesTest {

    public static void main(String[] args) throws Exception {
        QuizFileRepository quizFileRepository = new QuizFileRepository("test.txt");
        List<QuizQuestion> questions = quizFileRepository.readAll();
        questions.forEach(e -> System.out.println(e));

        QuizRepositoryFactory quizRepositoryFactory = new QuizRepositoryFactory();
        QuizRepository production = quizRepositoryFactory.createRepostiory("test");
        List<QuizQuestion> questionsProduction = production.readAll();
        questionsProduction.forEach(e -> System.out.println(e));
    }
}
