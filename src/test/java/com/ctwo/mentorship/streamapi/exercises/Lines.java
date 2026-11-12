package com.ctwo.mentorship.streamapi.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

/** Helpers shared by the exercise tests: an exercise returns its lines separated by "\n". */
final class Lines {

  private Lines() {}

  /** Splits an exercise result into lines, failing clearly while the exercise returns null. */
  static List<String> of(String result) {
    assertNotNull(result, "the exercise returned null: not solved yet");
    return result.lines().toList();
  }

  /** Same lines, in exactly this order. */
  static void assertLines(List<String> expected, String result) {
    assertEquals(expected, of(result));
  }

  /** Same lines, in any order. */
  static void assertSameLines(List<String> expected, String result) {
    assertEquals(
        expected.stream().sorted().toList(),
        of(result).stream().sorted().toList(),
        "lines differ (order is ignored)");
  }
}
