package com.ctwo.mentorship.streamapi.exercises;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import java.time.LocalDate;

public class ExerciseSeven {

  /* Exercise Seven: partitioningBy, ChronoUnit, injected "today"
   * Given LocalDate today and a 14 day limit, split the ACTIVE loans into
   * overdue and not overdue. Take today as a method parameter, never call LocalDate.now()
   * inside the stream.
   * With today = 2025-11-10 every active loan is overdue except none; try 2025-10-30 too.
   *
   * A loan is overdue when more than 14 days passed between borrowedOn and today.
   * Return one line per active loan separated by "\n", in any order:
   *   "overdue: <member name> - <title>" or "not overdue: <member name> - <title>"
   */
  public static String seven(Catalog catalog, LocalDate today) {
    System.out.println("Exercise Seven.");
    return null;
  }
}
