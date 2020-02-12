package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Branch;
import com.example.demo.service.BranchService;

@RestController
@RequestMapping(path = "/api/branch")
public class BranchController {

	@Autowired
	private BranchService branchService;

	@GetMapping(path = "/getAll")
	public List<Branch> getBranches() {
		return branchService.getAllBranches();

	}

	@GetMapping("/{id}")
	public Optional<Branch> getBranch(@PathVariable(value = "id")Long branchNo) {
		
		return branchService.getBranch(branchNo);
	}

	@PostMapping("/add")
	public ResponseEntity<String> createBranch(@RequestBody Branch branch) {
		branchService.createBranch(branch);
		return new ResponseEntity<String>("Branch Saved SUccessfully" , HttpStatus.CREATED);
	}

	@PutMapping(path = "/modify/{id}")
	public ResponseEntity<Branch> modifyBranch(@PathVariable(value = "id")Long branchNo,@RequestBody Branch branch) {
		branchService.modifyBranch(branch);
		return new ResponseEntity<Branch>(HttpStatus.ACCEPTED);
	}

	@DeleteMapping(path = "/delAll")
	public void deleteAllBranches() {
		branchService.deleteAllBranches();
	}

	@DeleteMapping(path = "/{id}")
	public void deleteBranch(@PathVariable(value = "id") Long branchNo) {
		branchService.deleteBranch(branchNo);

	}

}
