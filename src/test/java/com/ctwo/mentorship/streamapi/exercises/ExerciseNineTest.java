package com.ctwo.mentorship.streamapi.exercises;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import java.util.List;
import org.junit.jupiter.api.Test;

/** The expected format is described in the comment of {@link ExerciseNine}. */
class ExerciseNineTest {

  private final Catalog catalog = Catalog.getInstance();

  @Test
  void nine() {
    String names =
        "Ursula K. Le Guin, Gabriel García Márquez, Terry Pratchett, Octavia Butler,"
            + " Umberto Eco, Liu Cixin";
    Lines.assertLines(List.of("15", "15", names, names), ExerciseNine.nine(catalog));
  }
}
