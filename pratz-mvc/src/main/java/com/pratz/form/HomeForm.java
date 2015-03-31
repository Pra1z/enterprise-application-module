package com.pratz.form;

import org.hibernate.validator.constraints.NotBlank;

public class HomeForm {
	@NotBlank
	private String homeName;
	@NotBlank
	private String homeNumber;
	
	public String getHomeName() {
		return homeName;
	}
	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

}
