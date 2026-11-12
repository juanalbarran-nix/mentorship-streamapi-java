package com.ctwo.mentorship.streamapi.exercises;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;

public class ExerciseOne {

  /* Exercise One: filter, map, sorted, toList
   * Titles of all books published after 2000, sorted alphabetically.
   * Expected: [Death's End, Night Watch, The Dark Forest, The Three-Body Problem]
   */
  public static String one(Catalog catalog) {
    System.out.println("Exercise one");
    return catalog.getBooks().stream()
        .filter(book -> book.year() > 2000)
        .map(book -> book.title())
        .sorted()
        .toList()
        .toString();
  }
}
