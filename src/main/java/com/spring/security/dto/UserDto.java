package com.spring.security.dto;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserDto {


	private Long id;
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	@NotEmpty(message = "Email Should not be empty")
	@Email
	private String email;
	
	@NotEmpty(message = "Password should not be empty")
	private String password;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	
	public UserDto(Long id, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
