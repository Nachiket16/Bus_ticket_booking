package com.nachiket.travel.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

public class PaymentDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long paymentId;

  private String paymentType;
  private String transactionNo;
  private LocalDateTime transactionDateTime;


}
