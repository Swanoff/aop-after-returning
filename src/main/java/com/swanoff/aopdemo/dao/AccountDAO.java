package com.swanoff.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.swanoff.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + ": Doing my db work: Adding an account \n");
	}
	
	public boolean doWork() {
		System.out.println(getClass() + ": dowWork() \n");
		return false;
	}

	public String getName() {
		System.out.println(getClass() + ": in getName() \n");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": in setName() \n");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": in getServiceCode() \n");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in setServiceCode() \n");
		this.serviceCode = serviceCode;
	}
	
}
