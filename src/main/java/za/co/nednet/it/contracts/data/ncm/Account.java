package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.*;

/*
JSON Representation for Account:
{
  "type": "object",
  "properties": {
    "accountName": {
      "type": "string"
    },
    "accountType": {
      "type": "string"
    },
    "accountStatus": {
      "type": "string"
    }
  }
}
*/

public class Account {

	@Size(max=1)
	private String accountName;

	@Size(max=1)
	private String accountType;

	@Size(max=1)
	private String accountStatus;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    accountName = null;
	    accountType = null;
	    accountStatus = null;
	}
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
}