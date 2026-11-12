package com.ctwo.mentorship.streamapi.exercises;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import java.util.List;
import org.junit.jupiter.api.Test;

/** The expected format is described in the comment of {@link ExerciseFive}. */
class ExerciseFiveTest {

  private final Catalog catalog = Catalog.getInstance();

  @Test
  void five() {
    Lines.assertLines(
        List.of(
            "Ana borrowed A Wizard of Earthsea by Ursula K. Le Guin",
            "Ana borrowed The Three-Body Problem by Liu Cixin",
            "Ana borrowed One Hundred Years of Solitude by Gabriel García Márquez",
            "Bence borrowed The Three-Body Problem by Liu Cixin",
            "Bence borrowed The Dark Forest by Liu Cixin",
            "Bence borrowed Death's End by Liu Cixin",
            "Carla borrowed Guards! Guards! by Terry Pratchett",
            "Carla borrowed The Name of the Rose by Umberto Eco",
            "Carla borrowed The Three-Body Problem by Liu Cixin",
            "Dávid borrowed Kindred by Octavia Butler",
            "Dávid borrowed The Three-Body Problem by Liu Cixin",
            "Dávid borrowed One Hundred Years of Solitude by Gabriel García Márquez",
            "Eva borrowed A Wizard of Earthsea by Ursula K. Le Guin",
            "Eva borrowed Night Watch by Terry Pratchett",
            "Farid borrowed The Left Hand of Darkness by Ursula K. Le Guin"),
        ExerciseFive.five(catalog));
  }
}
