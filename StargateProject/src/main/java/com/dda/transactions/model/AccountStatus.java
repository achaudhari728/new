
package com.dda.transactions.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AccountStatus {

    @JsonProperty("OPEN")
    OPEN("OPEN"),
    @JsonProperty("CLOSED")
    CLOSED("CLOSED"),
    @JsonProperty("PENDINGOPEN")
    PENDINGOPEN("PENDINGOPEN"),
    @JsonProperty("PENDINGCLOSE")
    PENDINGCLOSE("PENDINGCLOSE"),
    @JsonProperty("DELINQUENT")
    DELINQUENT("DELINQUENT"),
    @JsonProperty("PAID")
    PAID("PAID"),
    @JsonProperty("NEGATIVECURRENTBALANCE")
    NEGATIVECURRENTBALANCE("NEGATIVECURRENTBALANCE"),
    @JsonProperty("APPROVED")
    APPROVED("APPROVED"),
    @JsonProperty("REJECTED")
    REJECTED("REJECTED"),
    @JsonProperty("PENDING")
    PENDING("PENDING"),
    @JsonProperty("POSTED")
    POSTED("POSTED");
    private final String value;
    private final static Map<String, AccountStatus> VALUE_CACHE = new HashMap<String, AccountStatus>();

    static {
        for (AccountStatus c: values()) {
            VALUE_CACHE.put(c.value, c);
        }
    }

    private AccountStatus(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    public static AccountStatus fromValue(String value) {
        return VALUE_CACHE.get(value);
    }

    @Override
    public String toString() {
        return this.value;
    }

}
