package com.thr.Hibernet_crud;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private int sId;
private String sName;
private String subject;
private int contact;




public Student() {
	super();
}
public Student(int sId, String sName, String subject, int contact) {
	super();
	this.sId = sId;
	this.sName = sName;
	this.subject = subject;
	this.contact = contact;
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public int getContact() {
	return contact;
}
public void setContact(int contact) {
	this.contact = contact;
}



}
