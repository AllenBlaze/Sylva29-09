package ca.ulaval.glo4002.trading.domain;

import java.util.ArrayList;

public abstract class Profile {
	String type;
	ArrayList<String> focusAreas = new ArrayList<String>();

	public abstract String getType();

	public abstract ArrayList<String> getFocusAreas();

}
