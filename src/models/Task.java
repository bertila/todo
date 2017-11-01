package models;

import java.time.LocalDate;

public class Task {
	private String taskName;
	private int priority;
	private String status;
	private LocalDate dateDeadline;
	private LocalDate dateEntered;
	private int id=0;
	private int currentRecord=0;
	
	public Task(String taskName, int priority, LocalDate dateDeadline) {
		this.id=currentRecord;
		this.taskName = taskName;
		this.priority = priority;
		this.dateDeadline = dateDeadline;
		this.dateEntered = LocalDate.now();
		currentRecord++;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public LocalDate getDateDeadline() {
		return dateDeadline;
	}

	public void setDateDeadline(LocalDate dateDeadline) {
		this.dateDeadline = dateDeadline;
	}

	public LocalDate getDateEntered() {
		return dateEntered;
	}

	public void setDateEntered(LocalDate dateEntered) {
		this.dateEntered = dateEntered;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}