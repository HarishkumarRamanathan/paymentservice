package com.example.payment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.payment.entity.PaymentEntity;
import com.example.payment.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;

	@GetMapping
	public String index() {
		return "Welcome payment service";
	}
	
	@PostMapping("/dopayment")
	public PaymentEntity save(@RequestBody PaymentEntity paymentEntity) {
		return paymentService.save(paymentEntity);
		
	}
	
	@GetMapping("/getbyorderid/{orderId}")
	public Optional<PaymentEntity> getByOrderId(Long orderId) {
		return paymentService.getByOrderId(orderId);
		
	}
}
