package com.udaan.interview;

public class GetBalanceModel extends GetBalanceBaseModel {
    private GetBalanceResponseDetails getBalanceResponse;

    
    
    public GetBalanceModel() {
    	//System.out.println("GetBalanceModel");
    }

    public GetBalanceModel(com.udaan.interview.GetBalanceResponseDetails getBalanceResponse) {
    	//System.out.println("GetBalanceModel value"+getBalanceResponse);
//    	this.getBalanceResponse = getBalanceResponse;
    	System.out.println("data"+getBalanceResponse);
    	GetBalanceModel a=new GetBalanceModel();
    	a.set(getBalanceResponse);
    }

    public com.udaan.interview.GetBalanceResponseDetails getGetBalanceResponse() {
        return getBalanceResponse;
    }

    public void setGetBalanceResponse(com.udaan.interview.GetBalanceResponseDetails getBalanceResponse) {
        this.getBalanceResponse = getBalanceResponse;
    }

    public Double giveBalance() {
    	//System.out.println(this.getBalanceResponse.toString());
        return this.getBalanceResponse.accountBalanceAmount;
    }
}
