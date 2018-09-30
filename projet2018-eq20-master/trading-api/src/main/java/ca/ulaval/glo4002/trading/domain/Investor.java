package ca.ulaval.glo4002.trading.domain;

import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import ca.ulaval.glo4002.trading.application.InvestorApplicationServices;

//import ca.ulaval.glo4002.trading.application.InvestorApplicationServices;

public class Investor {

	String investorName;
	String email;
	long investorId;
	String typeLabel = "type";
	String focusAreasLabel = "focusAreas";
	String type;
	ArrayList<String> focusAreas = new ArrayList<String>();
	HashMap<String, Object> profileType = new HashMap<String, Object>();

	@JsonProperty("investorName")
	public String getInvestorName() {
		return investorName;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("investorId")
	public long getInvestorId() {
		InvestorApplicationServices services = new InvestorApplicationServices();
		this.investorId = services.generateInvestorId();
		return investorId;

	}

	@JsonProperty(access = Access.WRITE_ONLY)
	public String getType() {
		return type;
	}

	@JsonProperty(access = Access.WRITE_ONLY)
	public ArrayList<String> getFocusAreas() {
		return focusAreas;
	}

	@JsonProperty("investorProfile")
	public HashMap<String, Object> getProfile() {
		profileType.put(typeLabel, type);
		profileType.put(focusAreasLabel, focusAreas);
		return profileType;
	}

	public Investor() {

	}

	public Investor(String investorName, String email, String type, ArrayList<String> focusAreas) {
		this.investorName = investorName;
		this.email = email;
		this.type = type;
		this.focusAreas = focusAreas;

	}

}
