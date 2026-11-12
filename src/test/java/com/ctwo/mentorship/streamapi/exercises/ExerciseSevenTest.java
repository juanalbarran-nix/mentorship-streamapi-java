package com.ctwo.mentorship.streamapi.exercises;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Test;

/** The expected format is described in the comment of {@link ExerciseSeven}. */
class ExerciseSevenTest {

  private final Catalog catalog = Catalog.getInstance();

  @Test
  void sevenOn10November() {
    Lines.assertSameLines(
        List.of(
            "overdue: Ana - One Hundred Years of Solitude",
            "overdue: Bence - Death's End",
            "overdue: Carla - The Three-Body Problem",
            "overdue: Dávid - One Hundred Years of Solitude",
            "overdue: Eva - Night Watch",
            "not overdue: Farid - The Left Hand of Darkness"),
        ExerciseSeven.seven(catalog, LocalDate.of(2025, 11, 10)));
  }

  @Test
  void sevenOn30October() {
    Lines.assertSameLines(
        List.of(
            "overdue: Ana - One Hundred Years of Solitude",
            "overdue: Bence - Death's End",
            "not overdue: Carla - The Three-Body Problem",
            "not overdue: Dávid - One Hundred Years of Solitude",
            "not overdue: Eva - Night Watch",
            "not overdue: Farid - The Left Hand of Darkness"),
        ExerciseSeven.seven(catalog, LocalDate.of(2025, 10, 30)));
  }
}
