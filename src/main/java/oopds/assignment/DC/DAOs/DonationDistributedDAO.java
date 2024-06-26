package oopds.assignment.DC.DAOs;

import java.util.List;
import java.util.UUID;
import oopds.assignment.DC.models.DonationDistributed;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * A Data Access Object (DAO) to be used by the Service Classes to access
 * Entities stored in the Database.
 * This DAO is used to access Donation Requested Entities in the Database.
 */
@Repository
public interface DonationDistributedDAO extends JpaRepository<DonationDistributed, UUID> {
	// @Query(value = "Select * from DonationMade dm left")
	// List<DonationDistributed> findAll();

	// List<DonationDistributed> findByQuantity(int quantity);

	// List<DonationDistributed> findByRemaining(int remaining);

	/**
	 * Abstract method that allows the service to search for the Donation Distributed based on their Status.
	 *
	 * @param status The status to be searched for.
	 * @return The List of Donation Distributed that matches the status passed.
	 */
	List<DonationDistributed> findByStatus(String status);
}
