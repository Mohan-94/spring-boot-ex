package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Branch;

public interface BranchService {
	
	public List<Branch> getAllBranches();
	public Branch createBranch(Branch branch);
	public Optional<Branch> getBranch(Long branchNo);
	public Branch modifyBranch(Branch branch);
	public void deleteAllBranches();
	public void deleteBranch(Long branchNo);

}
