package com.sbm.shura.dto;

public class UserDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6104011990509049339L;

	private String email;
	private String password;
	private String username;
	
	
	public UserDTO() {}
	
	public UserDTO(long id) {}
	
	public UserDTO(long id , String username ,String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public UserDTO(long id , String email,String password, String username) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	} 
	
}
