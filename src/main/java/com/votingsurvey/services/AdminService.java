package com.votingsurvey.services;

import com.votingsurvey.entity.Admin;

import java.util.Optional;

public interface AdminService {
	
	/**
     * Fetches a admin by their unique ID.
     *
     * @param id The ID of the admin.
     * @return An Optional containing the admin if found, otherwise empty.
     */
	Optional<Admin> getAdminById(Long id);
	
	// Authorization User
	public boolean authAdminByIdAndPassword(Long id, String password);
}
