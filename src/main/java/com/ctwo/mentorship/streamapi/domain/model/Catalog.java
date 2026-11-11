package com.ctwo.mentorship.streamapi.domain.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Catalog {
  private static final Catalog INSTANCE = new Catalog();

  private List<Book> books;
  private List<Author> authors;
  private List<Member> members;
  private List<Loan> loans;

  private Catalog() {
    this.authors =
        List.of(
            new Author(1, "Ursula K. Le Guin", "US"),
            new Author(2, "Gabriel García Márquez", "CO"),
            new Author(3, "Terry Pratchett", "UK"),
            new Author(4, "Octavia Butler", "US"),
            new Author(5, "Umberto Eco", "IT"),
            new Author(6, "Liu Cixin", "CN"));
    this.books =
        List.of(
            new Book(1, "A Wizard of Earthsea", "Fantasy", 1968, 1),
            new Book(2, "The Left Hand of Darkness", "Sci-Fi", 1969, 1),
            new Book(3, "The Dispossessed", "Sci-Fi", 1974, 1),
            new Book(4, "One Hundred Years of Solitude", "Fiction", 1967, 2),
            new Book(5, "Love in the Time of Cholera", "Fiction", 1985, 2),
            new Book(6, "Guards! Guards!", "Fantasy", 1989, 3),
            new Book(7, "Small Gods", "Fantasy", 1992, 3),
            new Book(8, "Night Watch", "Fantasy", 2002, 3),
            new Book(9, "Kindred", "Sci-Fi", 1979, 4),
            new Book(10, "Parable of the Sower", "Sci-Fi", 1993, 4),
            new Book(11, "The Name of the Rose", "Mystery", 1980, 5),
            new Book(12, "Foucault's Pendulum", "Mystery", 1988, 5),
            new Book(13, "The Three-Body Problem", "Sci-Fi", 2008, 6),
            new Book(14, "The Dark Forest", "Sci-Fi", 2008, 6),
            new Book(15, "Death's End", "Sci-Fi", 2010, 6));
    this.members =
        List.of(
            new Member(1, "Ana", LocalDate.of(2022, 1, 10)),
            new Member(2, "Bence", LocalDate.of(2022, 6, 3)),
            new Member(3, "Carla", LocalDate.of(2023, 2, 20)),
            new Member(4, "Dávid", LocalDate.of(2023, 9, 14)),
            new Member(5, "Eva", LocalDate.of(2024, 4, 1)),
            new Member(6, "Farid", LocalDate.of(2024, 11, 8)));

    this.loans =
        List.of(
            new Loan(1, 1, LocalDate.of(2025, 9, 1), Optional.of(LocalDate.of(2025, 9, 12))),
            new Loan(13, 1, LocalDate.of(2025, 9, 15), Optional.of(LocalDate.of(2025, 10, 1))),
            new Loan(4, 1, LocalDate.of(2025, 10, 5), Optional.empty()),
            new Loan(13, 2, LocalDate.of(2025, 9, 3), Optional.of(LocalDate.of(2025, 9, 20))),
            new Loan(14, 2, LocalDate.of(2025, 9, 21), Optional.of(LocalDate.of(2025, 10, 10))),
            new Loan(15, 2, LocalDate.of(2025, 10, 11), Optional.empty()),
            new Loan(6, 3, LocalDate.of(2025, 8, 20), Optional.of(LocalDate.of(2025, 9, 2))),
            new Loan(11, 3, LocalDate.of(2025, 9, 10), Optional.of(LocalDate.of(2025, 10, 15))),
            new Loan(13, 3, LocalDate.of(2025, 10, 20), Optional.empty()),
            new Loan(9, 4, LocalDate.of(2025, 9, 5), Optional.of(LocalDate.of(2025, 9, 19))),
            new Loan(13, 4, LocalDate.of(2025, 10, 2), Optional.of(LocalDate.of(2025, 10, 16))),
            new Loan(4, 4, LocalDate.of(2025, 10, 18), Optional.empty()),
            new Loan(1, 5, LocalDate.of(2025, 10, 1), Optional.of(LocalDate.of(2025, 10, 14))),
            new Loan(8, 5, LocalDate.of(2025, 10, 25), Optional.empty()),
            new Loan(2, 6, LocalDate.of(2025, 10, 28), Optional.empty()));
  }

  public static Catalog getInstance() {
    return INSTANCE;
  }

  public List<Book> getBooks() {
    return this.books;
  }

  public List<Author> getAuthors() {
    return this.authors;
  }

  public List<Member> getMembers() {
    return this.members;
  }

  public List<Loan> getLoans() {
    return this.loans;
  }
}
