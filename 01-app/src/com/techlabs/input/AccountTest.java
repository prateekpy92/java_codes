package com.techlabs.input;

import com.techlabs.first.AccontType;

public class AccountTest {

	private int accountNo;
	private String Name;
	private int accountbalance;
	private AccontType acctype;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public AccountTest() {
		super();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}
	public AccontType getAcctype() {
		return acctype;
	}
	public void setAcctype(AccontType acctype) {
		this.acctype = acctype;
	}
	@Override
	public String toString() {
		return "AccountTest [accountNo=" + accountNo + ", Name=" + Name + ", accountbalance=" + accountbalance
				+ ", acctype=" + acctype + "]";
	}
		

	}

