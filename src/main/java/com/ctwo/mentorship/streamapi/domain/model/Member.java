package com.ctwo.mentorship.streamapi.domain.model;

import java.time.LocalDate;

public record Member(Integer id, String name, LocalDate joinedOn) {}
