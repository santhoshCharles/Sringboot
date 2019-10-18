package com.udaan.interview;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetBalanceResponseDetails  {
    @JsonProperty("Version") String version;
    String accountCurrencyCode;
    Double accountBalanceAmount;
    Boolean lowBalanceAlert;

    GetBalanceResponseDetails() {
    }

    public GetBalanceResponseDetails(String version, String accountCurrencyCode, Double accountBalanceAmount, Boolean lowBalanceAlert) {
        System.out.println("balance res "+version);
    	this.version = version;
        this.accountCurrencyCode = accountCurrencyCode;
        this.accountBalanceAmount = accountBalanceAmount;
        this.lowBalanceAlert = lowBalanceAlert;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAccountCurrencyCode() {
        return accountCurrencyCode;
    }

    public void setAccountCurrencyCode(String accountCurrencyCode) {
        this.accountCurrencyCode = accountCurrencyCode;
    }

    public Double getAccountBalanceAmount() {
        return accountBalanceAmount;
    }

    public void setAccountBalanceAmount(Double accountBalanceAmount) {
        this.accountBalanceAmount = accountBalanceAmount;
    }

    public Boolean getLowBalanceAlert() {
        return lowBalanceAlert;
    }

    public void setLowBalanceAlert(Boolean lowBalanceAlert) {
        this.lowBalanceAlert = lowBalanceAlert;
    }
}
