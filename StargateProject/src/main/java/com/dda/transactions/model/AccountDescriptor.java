
package com.dda.transactions.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


@Entity
@Table(name="accountdescriptor")
public class AccountDescriptor implements Serializable
{

    final static long serialVersionUID = -3966898641298402658L;
    /**
     * Long-term persistent identity of the account
     * 
     */
    private String accountId;
    /**
     * account type for User account
     * 
     */
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    /**
     * Account identity to display to customer
     * 
     */
    private String displayName;
    /**
     * Description of account
     * 
     */
    private String description;
    /**
     * Status of Account
     * 
     */
    @Enumerated(EnumType.STRING)
    @Column(name="Status")
    private AccountStatus accountStatus;
    /**
     * primary key
     * 
     */
    @Id
    private Long accountDescriptorId;
    /**
     * foregin key
     * 
     */
    private String customerId;

    /**
     * Creates a new AccountDescriptor.
     * 
     */
    public AccountDescriptor() {
        super();
    }

    /**
     * Creates a new AccountDescriptor.
     * 
     */
    public AccountDescriptor(String accountId, AccountType accountType, String displayName, String description, AccountStatus accountStatus, Long accountDescriptorId, String customerId) {
        super();
        this.accountId = accountId;
        this.accountType = accountType;
        this.displayName = displayName;
        this.description = description;
        this.accountStatus = accountStatus;
        this.accountDescriptorId = accountDescriptorId;
        this.customerId = customerId;
    }

    /**
     * Returns the accountId.
     * 
     * @return
     *     accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Set the accountId.
     * 
     * @param accountId
     *     the new accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Returns the accountType.
     * 
     * @return
     *     accountType
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Set the accountType.
     * 
     * @param accountType
     *     the new accountType
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * Returns the displayName.
     * 
     * @return
     *     displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Set the displayName.
     * 
     * @param displayName
     *     the new displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Returns the description.
     * 
     * @return
     *     description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description.
     * 
     * @param description
     *     the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the accountStatus.
     * 
     * @return
     *     accountStatus
     */
    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
     * Set the accountStatus.
     * 
     * @param accountStatus
     *     the new accountStatus
     */
    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * Returns the accountDescriptorId.
     * 
     * @return
     *     accountDescriptorId
     */
    public Long getAccountDescriptorId() {
        return accountDescriptorId;
    }

    /**
     * Set the accountDescriptorId.
     * 
     * @param accountDescriptorId
     *     the new accountDescriptorId
     */
    public void setAccountDescriptorId(Long accountDescriptorId) {
        this.accountDescriptorId = accountDescriptorId;
    }

    /**
     * Returns the customerId.
     * 
     * @return
     *     customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Set the customerId.
     * 
     * @param customerId
     *     the new customerId
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(accountId).append(accountType).append(displayName).append(description).append(accountStatus).append(accountDescriptorId).append(customerId).toHashCode();
    }

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
        AccountDescriptor otherObject = ((AccountDescriptor) other);
        return new EqualsBuilder().append(accountId, otherObject.accountId).append(accountType, otherObject.accountType).append(displayName, otherObject.displayName).append(description, otherObject.description).append(accountStatus, otherObject.accountStatus).append(accountDescriptorId, otherObject.accountDescriptorId).append(customerId, otherObject.customerId).isEquals();
    }

    public String toString() {
        return new ToStringBuilder(this).append("accountId", accountId).append("accountType", accountType).append("displayName", displayName).append("description", description).append("accountStatus", accountStatus).append("accountDescriptorId", accountDescriptorId).append("customerId", customerId).toString();
    }

}
