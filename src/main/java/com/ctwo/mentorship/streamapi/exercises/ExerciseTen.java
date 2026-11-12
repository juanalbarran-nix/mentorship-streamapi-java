package com.ctwo.mentorship.streamapi.exercises;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;

public class ExerciseTen {

  /* Exercise Ten: putting it together
   * For each book, how many copies are currently out (active loans).
   * Return Map<String, Long> title -> active loans, only for books with at least one.
   * Expected: One Hundred Years of Solitude=2, The Three-Body Problem=1, Death's End=1,
   *           Night Watch=1, The Left Hand of Darkness=1
   * Then: which books have never been borrowed? Use the loan bookIds as a Set and filter.
   *
   * Return these lines separated by "\n", in any order:
   *   "<title>=<active loans>"                       one line per book with at least one
   *   "never borrowed: <titles joined with ", ">"    one line, titles in catalog order
   */
  public static String ten(Catalog catalog) {
    System.out.println("Exercise Ten.");
    return null;
  }
}
