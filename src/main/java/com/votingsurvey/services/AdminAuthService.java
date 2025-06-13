package com.votingsurvey.services;

import com.votingsurvey.dao.dashboard.AdminDao;
import com.votingsurvey.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminAuthService implements AdminService {

	@Autowired
	private AdminDao dao;

	@Override
	public Optional<Admin> getAdminById(Long id) {
		return dao.getAdminByIdDao(id);
	}

	@Override
	public boolean authAdminByIdAndPassword(Long id, String password) {

		Optional<Admin> optional = getAdminById(id);
		if (!(optional.isPresent())) return false;
		
		Admin admin = optional.get();
		if (id.equals(admin.getId()) && password.equals(admin.getPassword())) return true;
		
		return false;
	}
	
	
}

