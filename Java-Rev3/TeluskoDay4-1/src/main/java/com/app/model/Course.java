package com.app.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

@Repository
public class Course 
{
	private String courseName;
	private int courseId;
	private int courseCost;
	
	public Course() 
	{
		super();
	}

	public Course(String courseName, int courseId, int courseCost) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.courseCost = courseCost;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getCourseCost() {
		return courseCost;
	}

	public void setCourseCost(int courseCost) {
		this.courseCost = courseCost;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseId=" + courseId + ", courseCost=" + courseCost + "]";
	}
}
