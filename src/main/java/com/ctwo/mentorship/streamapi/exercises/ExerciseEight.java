package com.ctwo.mentorship.streamapi.exercises;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;

public class ExerciseEight {

  /* Exercise Eight: groupingBy + counting, sorted on entries, limit
   * a) The three most borrowed book titles.                            -> The Three-Body Problem (4), then two with 2
   * b) The member with the most loans.                                 -> Ana, Bence, Carla or Dávid all have 3, pick a tie rule
   * Hint: stream the entrySet(), sort by Map.Entry.comparingByValue().reversed().
   *
   * Return four lines separated by "\n":
   *   a) three lines "<title> (<loans>)", most borrowed first
   *   b) one line "<member name> (<loans>)"
   */
  public static String eight(Catalog catalog) {
    System.out.println("Exercise Eight.");
    return null;
  }
}
