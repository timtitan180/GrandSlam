package com.application.grandslam.forms;

import javax.validation.constraints.*;

public class SignUpForm {
	@NotNull(message = "Please enter your first name")
	@Size(min=1,max=45,message="First Name must be between 1 and 45 characters long")
	private String firstName;

	@NotNull(message = "Please enter your last name")
	@Size(min=1,max=45,message="Last Name must be between 1 and 45 characters long")
	private String lastName;

	@NotNull(message = "Please enter your email")
	@Pattern(regexp="^(.+)@(.+)$",message="Please enter an actual email")
	private String email;

	@NotNull(message = "Please enter your password")
	private String password;

	@NotNull(message = "Please enter your password again")
	private String confirmPassword;




	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getConfirmPassword() {
		return confirmPassword;
	}



	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	@Override
	public String toString() {
		return "CreateUserForm: [" + firstName + "" + lastName + "" + email + "" +password + "" + confirmPassword
				+ "]";
	}


}
