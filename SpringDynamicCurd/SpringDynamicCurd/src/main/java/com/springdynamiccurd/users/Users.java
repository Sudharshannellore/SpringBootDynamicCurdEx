package com.springdynamiccurd.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
@Id
private int userid;
private String username;
private String email;
public Users() {
	
	System.out.println("User Table Created");
}
public Users(int userid, String username, String email) {
	super();
	this.userid = userid;
	this.username = username;
	this.email = email;
}

@Override
public String toString() {
	return "Users [userid=" + userid + ", username=" + username + ", email=" + email + "]";
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}

