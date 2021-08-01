package com.example.payment.service;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.payment.dao.PaymentRepo;
import com.example.payment.entity.PaymentEntity;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepo paymentRepo;

	@Override
	public PaymentEntity save(PaymentEntity paymentEntity) {
		// TODO Auto-generated method stub
		paymentEntity.setPaymentStatus(paymentProcessing());
		paymentEntity.setTransactionId(UUID.randomUUID().toString());
		return paymentRepo.save(paymentEntity);
	}
	
	public String paymentProcessing() {
		System.out.print("****************************************"+new Random().nextBoolean());
		return new Random().nextBoolean()? "success" : "failed";
		
	}

	@Override
	public Optional<PaymentEntity> getByOrderId(Long orderId) {
		// TODO Auto-generated method stub
		return paymentRepo.findByOrderId(orderId);
	}

}
