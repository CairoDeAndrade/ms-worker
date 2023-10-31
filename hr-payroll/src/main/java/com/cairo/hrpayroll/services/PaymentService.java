package com.cairo.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.cairo.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Cairo", 150.0, days);
	}
}
