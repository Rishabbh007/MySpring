package com.vinculum.ondc.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
/**
 *
 * @author Manish Anand
 *
 * Extend this class to gain the transaction management
 * feature in any of the service.
 *
 */
public abstract class Transactional{
	/**
	 * Logger for this class.
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(Transactional.class);
	/**
	 * The Transaction, Which is initialized at the time of
	 * Transaction Beginning
	 */
	private TransactionStatus transaction;
	/**
	 * The Transaction Manager Which is to be Set Before
	 * You Begin Any Transaction
	 */
	private PlatformTransactionManager manager;

	public void begin(){
		//Create the Default Transaction Manager
		final DefaultTransactionDefinition defination = new DefaultTransactionDefinition();
		//Set the time out to 2 minutes
		defination.setTimeout(120);
		//Set the Isolation Level
		defination.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
		//Set the Propagation Behavior
		defination.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		//Create a new Transaction
		transaction = manager.getTransaction(defination);
	}

	//Method to Commit the Transaction
	public void commit(){
		manager.commit(transaction);
	}
	//Method To Roll back the Transaction
	public void rollback(){
		manager.rollback(transaction);
	}
	//Returns the Transaction Manager
	public PlatformTransactionManager getManager() {
		return manager;
	}
	//Sets the Transaction Manager
	public void setManager(final PlatformTransactionManager manager) {
		this.manager = manager;
	}
}
