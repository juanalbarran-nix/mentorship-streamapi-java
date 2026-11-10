package com.ctwo.mentorship.streamapi;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import java.util.List;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to the Stream API Excercises");
    Catalog catalog = new Catalog();
    exerciseOne(catalog);
    exerciseTwo(catalog);
    exerciseThree(catalog);
    exerciseFour(catalog);
    exerciseFive(catalog);
    exerciseSix(catalog);
    exerciseSeven(catalog);
    exerciseEight(catalog);
    exerciseNine(catalog);
    exerciseTen(catalog);
  }

  /* Exercise One: filter, map, sorted, toList
   * Titles of all books published after 2000, sorted alphabetically.
   * Expected: [Death's End, Night Watch, The Dark Forest, The Three-Body Problem]
   */
  private static List<String> exerciseOne(Catalog catalog) {
    return null;
  }

  /* Exercise Two: anyMatch, findFirst, Optional
   * a) Is there any book published before 1970?                      -> true
   * b) First Sci-Fi book in catalog order, as Optional<Book>.         -> The Left Hand of Darkness
   * c) First "Poetry" book.                                           -> Optional.empty
   * Print b) and c) with orElse("none"), never with get().
   */
  private static List<String> exerciseTwo(Catalog catalog) {
    return null;
  }

  /* Exercise Three: mapToInt, min, max, average, IntSummaryStatistics
   * a) Oldest and newest publication year.                            -> 1967 and 2010
   * b) Average publication year of Fantasy books.                     -> 1987.75
   * c) The book with the longest title. Use Comparator.comparingInt.  -> One Hundred Years of Solitude
   */
  private static List<String> exerciseThree(Catalog catalog) {
    return null;
  }

  /* Exercise Four: Collectors.groupingBy, counting
   * a) Map<String, List<Book>>   books by genre.
   * b) Map<String, Long>         number of books per genre.           -> Sci-Fi=7, Fantasy=4, Fiction=2, Mystery=2
   * c) Map<Integer, List<String>> book titles by authorId.
   */
  private static List<String> exerciseFour(Catalog catalog) {
    return null;
  }

  /* Exercise Five: Collectors.toMap, lookups across lists
   * Build Map<Integer, Author> by id and Map<Integer, Book> by id, then for every loan
   * print "<member name> borrowed <title> by <author name>".
   * Hint: build the maps once, outside the loan stream.
   */
  private static List<String> exerciseFive(Catalog catalog) {
    return null;
  }

  /* Exercise Six: flatMap, distinct, Collectors.toSet
   * For each member, the set of distinct genres they have ever borrowed.
   * Expected for Ana: [Fantasy, Sci-Fi, Fiction]
   * Hint: group loans by memberId, then map each loan to its book's genre.
   */
  private static List<String> exerciseSix(Catalog catalog) {
    return null;
  }

  /* Exercise Seven: partitioningBy, ChronoUnit, injected "today"
   * Given LocalDate today and a 14 day limit, split the ACTIVE loans into
   * overdue and not overdue. Take today as a method parameter, never call LocalDate.now()
   * inside the stream.
   * With today = 2025-11-10 every active loan is overdue except none; try 2025-10-30 too.
   */
  private static List<String> exerciseSeven(Catalog catalog) {
    return null;
  }

  /* Exercise Eight: groupingBy + counting, sorted on entries, limit
   * a) The three most borrowed book titles.                            -> The Three-Body Problem (4), then two with 2
   * b) The member with the most loans.                                 -> Ana, Bence, Carla or Dávid all have 3, pick a tie rule
   * Hint: stream the entrySet(), sort by Map.Entry.comparingByValue().reversed().
   */
  private static List<String> exerciseEight(Catalog catalog) {
    return null;
  }

  /* Exercise Nine: reduce
   * a) Total number of loans with reduce(0, (acc, l) -> acc + 1). Then compare with count().
   * b) Concatenate all author names into one comma separated string with reduce,
   *    then redo it with Collectors.joining(", ") and say which one you would keep.
   */
  private static List<String> exerciseNine(Catalog catalog) {
    return null;
  }

  /* Exercise Ten: putting it together
   * For each book, how many copies are currently out (active loans).
   * Return Map<String, Long> title -> active loans, only for books with at least one.
   * Expected: One Hundred Years of Solitude=2, The Three-Body Problem=1, Death's End=1,
   *           Night Watch=1, The Left Hand of Darkness=1
   * Then: which books have never been borrowed? Use the loan bookIds as a Set and filter.
   */
  private static List<String> exerciseTen(Catalog catalog) {
    return null;
  }
}
