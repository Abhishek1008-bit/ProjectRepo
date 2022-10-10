package com.thr.Hibernet;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
private String courseName;
private String courseDuration;





public Certificate() {
	super();
}





public Certificate(String courseName, String courseDuration) {
	super();
	this.courseName = courseName;
	this.courseDuration = courseDuration;
}





public String getCourseName() {
	return courseName;
}





public void setCourseName(String courseName) {
	this.courseName = courseName;
}





public String getCourseDuration() {
	return courseDuration;
}





public void setCourseDuration(String courseDuration) {
	this.courseDuration = courseDuration;
}


}
