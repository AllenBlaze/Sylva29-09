package ca.ulaval.glo4002.trading.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class ProfileConservative extends Profile {
	String type = "CONSERVATIVE";
	ArrayList<String> focusAreas = new ArrayList<String>();

	@Override
	@JsonProperty(access = Access.WRITE_ONLY)
	public String getType() {
		return type;
	}

	@Override
	@JsonProperty(access = Access.WRITE_ONLY)
	public ArrayList<String> getFocusAreas() {
		return focusAreas;

	}

}
