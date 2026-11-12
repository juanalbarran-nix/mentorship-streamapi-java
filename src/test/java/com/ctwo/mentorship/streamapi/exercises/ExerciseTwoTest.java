package com.ctwo.mentorship.streamapi.exercises;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import java.util.List;
import org.junit.jupiter.api.Test;

/** The expected format is described in the comment of {@link ExerciseTwo}. */
class ExerciseTwoTest {

  private final Catalog catalog = Catalog.getInstance();

  @Test
  void two() {
    Lines.assertLines(
        List.of("true", "The Left Hand of Darkness", "none"), ExerciseTwo.two(catalog));
  }
}
