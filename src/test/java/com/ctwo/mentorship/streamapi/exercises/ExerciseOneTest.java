package com.ctwo.mentorship.streamapi.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import java.util.List;
import org.junit.jupiter.api.Test;

/** The expected format is described in the comment of {@link ExerciseOne}. */
class ExerciseOneTest {

  private final Catalog catalog = Catalog.getInstance();

  @Test
  void one() {
    assertEquals(
        "[Death's End, Night Watch, The Dark Forest, The Three-Body Problem]",
        ExerciseOne.one(catalog),
        "expected the sorted list of titles, printed as a List");
  }
}
