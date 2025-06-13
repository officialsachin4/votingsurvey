package com.votingsurvey.dao;

import com.votingsurvey.entity.Party;

import java.util.List;

public interface PartysDao {

	/**
     * Saves a part entity to the database.
     *
     * @param part the part entity to be saved
     * @return the saved part entity
     */
	Party savePartyDao(Party party);
	
	/**
     * Retrieves all party from the database.
     *
     * @return a list of all party
     */
    List<Party> getAllPartysDao();
    
    boolean deletePartyByIdDao(Long Id);
    
    List<Party> getActiveElectionPartiesDao();
    
    List<Party> getPartiesByConstituencyDao(Long constituencyId);
    
    List<Party> getPartiesByConstituencyNameDao(String constituencyName);
    
    boolean updateVotesDao(Long partyId, Long newVotes);
    
    int resetAllPartyVotesByConstituencyIdDao(Long constituencyId);
}
