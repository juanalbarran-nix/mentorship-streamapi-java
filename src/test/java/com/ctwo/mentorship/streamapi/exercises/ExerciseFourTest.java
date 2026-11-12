package com.ctwo.mentorship.streamapi.exercises;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import java.util.List;
import org.junit.jupiter.api.Test;

/** The expected format is described in the comment of {@link ExerciseFour}. */
class ExerciseFourTest {

  private final Catalog catalog = Catalog.getInstance();

  @Test
  void four() {
    Lines.assertSameLines(
        List.of(
            "Fantasy: A Wizard of Earthsea, Guards! Guards!, Small Gods, Night Watch",
            "Sci-Fi: The Left Hand of Darkness, The Dispossessed, Kindred, Parable of the Sower,"
                + " The Three-Body Problem, The Dark Forest, Death's End",
            "Fiction: One Hundred Years of Solitude, Love in the Time of Cholera",
            "Mystery: The Name of the Rose, Foucault's Pendulum",
            "Sci-Fi=7",
            "Fantasy=4",
            "Fiction=2",
            "Mystery=2",
            "1: A Wizard of Earthsea, The Left Hand of Darkness, The Dispossessed",
            "2: One Hundred Years of Solitude, Love in the Time of Cholera",
            "3: Guards! Guards!, Small Gods, Night Watch",
            "4: Kindred, Parable of the Sower",
            "5: The Name of the Rose, Foucault's Pendulum",
            "6: The Three-Body Problem, The Dark Forest, Death's End"),
        ExerciseFour.four(catalog));
  }
}
