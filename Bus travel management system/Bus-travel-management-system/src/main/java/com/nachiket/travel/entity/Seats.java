package com.nachiket.travel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Seats {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long seatId;

  private boolean status;

}
