package com.example.payment.service;

import java.util.Optional;

import com.example.payment.entity.PaymentEntity;

public interface PaymentService {

	PaymentEntity save(PaymentEntity paymentEntity);

	Optional<PaymentEntity> getByOrderId(Long orderId);

}
