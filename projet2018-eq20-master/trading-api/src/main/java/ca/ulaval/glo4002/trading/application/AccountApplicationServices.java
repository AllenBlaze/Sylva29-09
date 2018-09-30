package ca.ulaval.glo4002.trading.application;

import java.util.ArrayList;

public class AccountApplicationServices {

	long ACCOUNTLISTINITIALVALUE = 1000;
	long accountNumber;
	public ArrayList<Long> accountNumberList = new ArrayList<Long>();

	/*
	 * public boolean isAccountNumberLastValue(long accountNumber) {
	 * accountNumberList.add(accountNumber); return (accountNumber ==
	 * this.accountNumberList.get(this.accountNumberList.size() - 1)); }
	 */

	public boolean isCreditGreaterThanZero(float credits) {
		return (credits > 0.00);
	}

	public long generateAccountNumber() {
		// this.accountNumberList.add(ACCOUNTLISTINITIALVALUE);
		// accountNumber = this.accountNumberList.get(this.accountNumberList.size() -
		// 1);
		accountNumber = ACCOUNTLISTINITIALVALUE + 1;
		while (!(isAccountNumberUnique(accountNumber))) {
			accountNumber++;
		}
		this.accountNumberList.add(accountNumber);
		accountNumber = this.accountNumberList.get(this.accountNumberList.size() - 1);
		ACCOUNTLISTINITIALVALUE = accountNumber;
		return accountNumber;
	}

	public boolean isAccountNumberUnique(long accountNumber) {
		return !accountNumberList.contains(accountNumber);
	}

}
