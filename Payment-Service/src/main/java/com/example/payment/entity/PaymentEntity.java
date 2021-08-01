package com.example.payment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long paymentId;
	private String paymentStatus;
	private String transactionId;
	private Long orderId;
	private double amount;
}
