package com.cairo.hrpayroll.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cairo.hrpayroll.entities.Payment;
import com.cairo.hrpayroll.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentContoller {
	
	@Autowired
	private PaymentService service;
	
	@GetMapping("/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable long workerId, @PathVariable int days) {
		return ResponseEntity.ok(service.getPayment(workerId, days));
	}
}
