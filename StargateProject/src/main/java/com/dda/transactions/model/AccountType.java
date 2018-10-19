
package com.dda.transactions.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AccountType {

    @JsonProperty("401A")
    _401_A("401A"),
    @JsonProperty("401K")
    _401_K("401K"),
    @JsonProperty("403B")
    _403_B("403B"),
    @JsonProperty("AUTOLOAN")
    AUTOLOAN("AUTOLOAN"),
    @JsonProperty("CD")
    CD("CD"),
    @JsonProperty("CHARGE")
    CHARGE("CHARGE"),
    @JsonProperty("CHECKING")
    CHECKING("CHECKING"),
    @JsonProperty("COMMERCIALLINEOFCREDIT")
    COMMERCIALLINEOFCREDIT("COMMERCIALLINEOFCREDIT"),
    @JsonProperty("COMMERCIALLOAN")
    COMMERCIALLOAN("COMMERCIALLOAN"),
    @JsonProperty("\u00a0COVERDELL")
    COVERDELL("\u00a0COVERDELL"),
    @JsonProperty("CREDITCARD")
    CREDITCARD("CREDITCARD"),
    @JsonProperty("ESCROW")
    ESCROW("ESCROW"),
    @JsonProperty("ESOP")
    ESOP("ESOP"),
    @JsonProperty("GUARDIAN")
    GUARDIAN("GUARDIAN"),
    @JsonProperty("HOMEEQUITYLOAN")
    HOMEEQUITYLOAN("HOMEEQUITYLOAN"),
    @JsonProperty("HOMELINEOFCREDIT")
    HOMELINEOFCREDIT("HOMELINEOFCREDIT"),
    @JsonProperty("INSITUTIONALTRUST INSTALLMENT")
    INSITUTIONALTRUST_INSTALLMENT("INSITUTIONALTRUST INSTALLMENT"),
    @JsonProperty("IRA")
    IRA("IRA"),
    @JsonProperty("KEOGH")
    KEOGH("KEOGH"),
    @JsonProperty("LINEOFCREDIT")
    LINEOFCREDIT("LINEOFCREDIT"),
    @JsonProperty("LOAN")
    LOAN("LOAN"),
    @JsonProperty("MILATARYLOAN")
    MILATARYLOAN("MILATARYLOAN"),
    @JsonProperty("MONEYMARKET")
    MONEYMARKET("MONEYMARKET"),
    @JsonProperty("MORTGAGE")
    MORTGAGE("MORTGAGE"),
    @JsonProperty("PERSONALLOAN")
    PERSONALLOAN("PERSONALLOAN"),
    @JsonProperty("ROLLOVER")
    ROLLOVER("ROLLOVER"),
    @JsonProperty("\u00a0ROTH")
    ROTH("\u00a0ROTH"),
    @JsonProperty("SARSEP")
    SARSEP("SARSEP"),
    @JsonProperty("SAVINGS")
    SAVINGS("SAVINGS"),
    @JsonProperty("SMBLOAN")
    SMBLOAN("SMBLOAN"),
    @JsonProperty("STUDENTLOAN")
    STUDENTLOAN("STUDENTLOAN"),
    @JsonProperty("TAXABLE")
    TAXABLE("TAXABLE"),
    @JsonProperty("TDA")
    TDA("TDA"),
    @JsonProperty("TRUST")
    TRUST("TRUST"),
    @JsonProperty("UGMA")
    UGMA("UGMA"),
    @JsonProperty("UTMA")
    UTMA("UTMA"),
    @JsonProperty("PENDING")
    PENDING("PENDING"),
    @JsonProperty("MEMO")
    MEMO("MEMO"),
    @JsonProperty("POSTED")
    POSTED("POSTED"),
    @JsonProperty("AUTHORIZATION")
    AUTHORIZATION("AUTHORIZATION");
    private final String value;
    private final static Map<String, AccountType> VALUE_CACHE = new HashMap<String, AccountType>();

    static {
        for (AccountType c: values()) {
            VALUE_CACHE.put(c.value, c);
        }
    }

    private AccountType(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    public static AccountType fromValue(String value) {
        return VALUE_CACHE.get(value);
    }

    @Override
    public String toString() {
        return this.value;
    }

}
