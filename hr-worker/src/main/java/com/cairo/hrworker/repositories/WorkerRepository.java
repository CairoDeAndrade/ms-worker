package com.cairo.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cairo.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
