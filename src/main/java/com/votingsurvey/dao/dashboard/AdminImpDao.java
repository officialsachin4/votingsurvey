package com.votingsurvey.dao.dashboard;

import com.votingsurvey.entity.Admin;
import com.votingsurvey.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AdminImpDao implements AdminDao {
	
	@Autowired
	private AdminRepository repository;

	@Override
	public Optional<Admin> getAdminByIdDao(Long id) {
		return repository.findById(id);
	}
}


