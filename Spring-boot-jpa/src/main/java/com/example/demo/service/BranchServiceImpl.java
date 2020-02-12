package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Branch;
import com.example.demo.repository.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	private BranchRepository branchRepo;

	public List<Branch> getAllBranches() {
		return branchRepo.findAll();
	}

	@Override
	public Branch createBranch(Branch branch) {
		return branchRepo.save(branch);
	}

	@Override
	public Optional<Branch> getBranch(Long branchNo) {
		return branchRepo.findById(branchNo);
	}

	@Override
	public void deleteAllBranches() {
	 	branchRepo.deleteAll();

	}

	@Override
	public Branch modifyBranch(Branch branch) {
		return branchRepo.save(branch);
	}

	@Override
	public void deleteBranch(Long branchNo) {
		branchRepo.deleteById(branchNo);
	}

}
