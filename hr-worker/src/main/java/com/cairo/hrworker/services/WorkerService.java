package com.cairo.hrworker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cairo.hrworker.entities.Worker;
import com.cairo.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository repository;
	
	public List<Worker> findAll() {
		return repository.findAll();
	}

	public Worker findById(Long id) {
		return repository.findById(id).get();
	}
}
