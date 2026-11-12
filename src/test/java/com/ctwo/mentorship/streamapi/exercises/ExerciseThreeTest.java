package com.ctwo.mentorship.streamapi.exercises;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import java.util.List;
import org.junit.jupiter.api.Test;

/** The expected format is described in the comment of {@link ExerciseThree}. */
class ExerciseThreeTest {

  private final Catalog catalog = Catalog.getInstance();

  @Test
  void three() {
    Lines.assertLines(
        List.of("1967", "2010", "1987.75", "One Hundred Years of Solitude"),
        ExerciseThree.three(catalog));
  }
}
