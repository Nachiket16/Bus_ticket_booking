package com.nachiket.travel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Data
public class JourneyDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long journeyId;

  private String fromLocation;
  private String toLocation;
  private LocalDateTime departureDateTime;
  private LocalDateTime arrivalDateTime;
  private int availableSeats;
  private BigDecimal fare;

}
