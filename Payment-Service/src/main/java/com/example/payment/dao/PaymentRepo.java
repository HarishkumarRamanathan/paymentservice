package com.example.payment.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.payment.entity.PaymentEntity;

@Repository
public interface PaymentRepo extends JpaRepository<PaymentEntity, Long> {

	Optional<PaymentEntity> findByOrderId(Long orderId);

}
