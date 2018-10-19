
package com.dda.transactions.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="transaction")
@Inheritance(strategy = InheritanceType.JOINED)
public class Transaction
    extends AccountDescriptor
    implements Serializable
{

    final static long serialVersionUID = 6445440211435233338L;
    /**
     * Long term persistent identity of the transaction
     * 
     */
    
    
    @Column(name="TransactionId")
    private String transactionId;
    /**
     * The date and time that the transaction was added to the server backend                       systems
     * 
     */
    @Column(name="TransactionTimestamp")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date transactionTimestamp;
    /**
     * status of transaction
     * 
     */
    //@Column(name="Status")
    @Enumerated(EnumType.STRING)
    private Status status;
    /**
     * The amount of money in the account currency
     * 
     */
    @Column(name="Amount")
   private Double amount;
    /**
     * reference transaction Id
     * 
     */
   /* @Column(name="ReferenceTransactionId")
   private String ReferenceTransactionId;*/

    /**
     * Creates a new Transaction.
     * 
     */
    public Transaction() {
        super();
    }

    /**
     * Creates a new Transaction.
     * 
     */
    public Transaction(String accountId, AccountType accountType, String displayName, String description, AccountStatus accountStatus, Long accountDescriptorId, String customerId, String transactionId, Date transactionTimestamp, Status status, Double amount, String ReferenceTransactionId) {
        super(accountId, accountType, displayName, description, accountStatus, accountDescriptorId, customerId);
        this.transactionId = transactionId;
        this.transactionTimestamp = transactionTimestamp;
        this.status = status;
        this.amount = amount;
        //this.ReferenceTransactionId = ReferenceTransactionId;
    }

    /**
     * Returns the transactionId.
     * 
     * @return
     *     transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Set the transactionId.
     * 
     * @param transactionId
     *     the new transactionId
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Returns the transactionTimestamp.
     * 
     * @return
     *     transactionTimestamp
     */
    public Date getTransactionTimestamp() {
        return transactionTimestamp;
    }

    /**
     * Set the transactionTimestamp.
     * 
     * @param transactionTimestamp
     *     the new transactionTimestamp
     */
    public void setTransactionTimestamp(Date transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }

    /**
     * Returns the status.
     * 
     * @return
     *     status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Set the status.
     * 
     * @param status
     *     the new status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Returns the amount.
     * 
     * @return
     *     amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Set the amount.
     * 
     * @param amount
     *     the new amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Returns the ReferenceTransactionId.
     * 
     * @return
     *     ReferenceTransactionId
     */
   /* public String getReferenceTransactionId() {
        return ReferenceTransactionId;
    }*/

    /**
     * Set the ReferenceTransactionId.
     * 
     * @param ReferenceTransactionId
     *     the new ReferenceTransactionId
     */
    /*public void setReferenceTransactionId(String ReferenceTransactionId) {
        this.ReferenceTransactionId = ReferenceTransactionId;
    }*/

   /* public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(transactionId).append(transactionTimestamp).append(status).append(amount);
    }*/

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (this.getClass()!= other.getClass()) {
            return false;
        }
        Transaction otherObject = ((Transaction) other);
        return new EqualsBuilder().appendSuper(super.equals(otherObject)).append(transactionId, otherObject.transactionId).append(transactionTimestamp, otherObject.transactionTimestamp).append(status, otherObject.status).isEquals();
    }

    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("transactionId", transactionId).append("transactionTimestamp", transactionTimestamp).append("status", status).toString();
    }
    
    
/*
	public Transaction(String transactionId, Date transactionTimestamp, Status status, Double amount) {
		super();
		this.transactionId = transactionId;
		this.transactionTimestamp = transactionTimestamp;
		this.status = status;
		
	}
*/
    
    
    
    
    
    
}
