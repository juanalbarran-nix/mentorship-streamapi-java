package com.ctwo.mentorship.streamapi.exercises;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import java.util.List;
import org.junit.jupiter.api.Test;

/** The expected format is described in the comment of {@link ExerciseSix}. */
class ExerciseSixTest {

  private final Catalog catalog = Catalog.getInstance();

  @Test
  void six() {
    Lines.assertSameLines(
        List.of(
            "Ana: Fantasy, Fiction, Sci-Fi",
            "Bence: Sci-Fi",
            "Carla: Fantasy, Mystery, Sci-Fi",
            "Dávid: Fiction, Sci-Fi",
            "Eva: Fantasy",
            "Farid: Sci-Fi"),
        ExerciseSix.six(catalog));
  }
}
