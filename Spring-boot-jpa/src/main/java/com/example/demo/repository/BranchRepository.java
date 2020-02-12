package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Branch;

public interface BranchRepository extends JpaRepository<Branch, Long> {

}
