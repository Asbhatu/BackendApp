package com.lwam.lwam.model;


import java.util.Set;

public class Subject {
	
	
    private long subjectId;
	
	private String subjectName;
	
    private String subjectProgress;

    private String subjectStatus;

    private String subjectDuration;

    private String subjectType;
	


    public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectProgress() {
		return subjectProgress;
	}

	public void setSubjectProgress(String subjectProgress) {
		this.subjectProgress = subjectProgress;
	}

	public String getSubjectStatus() {
		return subjectStatus;
	}

	public void setSubjectStatus(String subjectStatus) {
		this.subjectStatus = subjectStatus;
	}

	public String getSubjectDuration() {
		return subjectDuration;
	}

	public void setSubjectDuration(String subjectDuration) {
		this.subjectDuration = subjectDuration;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}



}
