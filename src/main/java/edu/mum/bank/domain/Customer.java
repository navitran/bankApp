package edu.mum.bank.domain;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

//@Named
//@SessionScoped
public class Customer implements Serializable {
	private String name;
public Customer(){
}

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
