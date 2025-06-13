package com.votingsurvey.dao.dashboard;

import com.votingsurvey.entity.Admin;

import java.util.Optional;

public interface AdminDao {
	
	/**
     * Retrieves a admin by their unique identifier.
     *
     * @param id the ID of admin
     * @return an optional containing the admin if found, otherwise empty
     */
    Optional<Admin> getAdminByIdDao(Long id);
}
