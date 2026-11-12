package com.ctwo.mentorship.streamapi.exercises;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import java.util.List;
import org.junit.jupiter.api.Test;

/** The expected format is described in the comment of {@link ExerciseTen}. */
class ExerciseTenTest {

  private final Catalog catalog = Catalog.getInstance();

  @Test
  void ten() {
    Lines.assertSameLines(
        List.of(
            "One Hundred Years of Solitude=2",
            "The Three-Body Problem=1",
            "Death's End=1",
            "Night Watch=1",
            "The Left Hand of Darkness=1",
            "never borrowed: The Dispossessed, Love in the Time of Cholera, Small Gods,"
                + " Parable of the Sower, Foucault's Pendulum"),
        ExerciseTen.ten(catalog));
  }
}
