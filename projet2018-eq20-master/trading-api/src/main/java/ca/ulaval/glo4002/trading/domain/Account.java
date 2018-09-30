package ca.ulaval.glo4002.trading.domain;

import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;

import ca.ulaval.glo4002.trading.application.AccountApplicationServices;

public class Account extends ProfileConservative {

	long investorId;
	String investorName;
	String email;
	float credits;
	long accountNumber;
	String typeLabel = "type";
	String focusAreasLabel = "focusAreas";
	HashMap<String, Object> profileType = new HashMap<String, Object>();

	@JsonProperty("investorId")
	public long getInvestorId() {
		return investorId;
	}

	@JsonProperty("investorName")
	public String getInvestorName() {
		return investorName;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("credits")
	public float getCredits() {
		return credits;
	}

	@JsonProperty
	public long getaccountNumber() {
		AccountApplicationServices services = new AccountApplicationServices();
		this.accountNumber = services.generateAccountNumber();
		return accountNumber;
	}

	@JsonProperty("investorProfile")
	public HashMap<String, Object> getProfile() {
		profileType.put(typeLabel, super.type);
		profileType.put(focusAreasLabel, super.focusAreas);
		return profileType;
	}

	public Account() {
		super();
	}

	public Account(long investorId, String investorName, String email, float credits, String type,
			ArrayList<String> focusAreas) {
		this.investorId = investorId;
		this.investorName = investorName;
		this.email = email;
		this.credits = credits;

	}

}
