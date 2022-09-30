package com.example.demo.Model;

public class JwtRequest {
  String userName;
  String passWord;
  
  
public JwtRequest() {
	super();
}
public JwtRequest(String userName, String passWord) {
	super();
	this.userName = userName;
	this.passWord = passWord;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
@Override
public String toString() {
	return "JwtRequest [userName=" + userName + ", passWord=" + passWord + "]";
}

  
}
