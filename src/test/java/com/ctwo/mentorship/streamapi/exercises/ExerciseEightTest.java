package com.ctwo.mentorship.streamapi.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.ctwo.mentorship.streamapi.domain.model.Catalog;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

/** The expected format is described in the comment of {@link ExerciseEight}. */
class ExerciseEightTest {

  private final Catalog catalog = Catalog.getInstance();

  @Test
  void eight() {
    List<String> lines = Lines.of(ExerciseEight.eight(catalog));
    assertEquals(4, lines.size(), "expected 4 lines but got " + lines);
    assertEquals("The Three-Body Problem (4)", lines.get(0));
    assertEquals(
        Set.of("A Wizard of Earthsea (2)", "One Hundred Years of Solitude (2)"),
        Set.copyOf(lines.subList(1, 3)),
        "second and third most borrowed, in either order");
    assertTrue(
        Set.of("Ana (3)", "Bence (3)", "Carla (3)", "Dávid (3)").contains(lines.get(3)),
        "member with the most loans, got: " + lines.get(3));
  }
}
