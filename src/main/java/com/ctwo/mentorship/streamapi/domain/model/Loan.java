package com.ctwo.mentorship.streamapi.domain.model;

import java.time.LocalDate;
import java.util.Optional;

public record Loan(
    Integer bookId, Integer memberId, LocalDate borrowedOn, Optional<LocalDate> returnedOn) {}
