package com.ctwo.mentorship.streamapi;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import com.ctwo.mentorship.streamapi.exercises.ExerciseOne;

public class App {
  public static void main(String[] args) {
    System.out.println("-----------------------------------------------------------");
    System.out.println("Welcome to the Stream API Exercises");
    Catalog catalog = Catalog.getInstance();
    System.out.println(ExerciseOne.one(catalog));
    // ExerciseTwo.two(catalog);
    // ExerciseThree.three(catalog);
    // ExerciseFour.four(catalog);
    // ExerciseFive.five(catalog);
    // ExerciseSix.six(catalog);
    // ExerciseSeven.seven(catalog, LocalDate.of(2025, 11, 10));
    // ExerciseEight.eight(catalog);
    // ExerciseNine.nine(catalog);
    // ExerciseTen.ten(catalog);
    System.out.println("-----------------------------------------------------------");
  }
}
