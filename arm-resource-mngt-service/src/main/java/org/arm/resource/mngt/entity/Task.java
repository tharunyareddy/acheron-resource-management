package org.arm.resource.mngt.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task {

	@Id
	private int taskId;
	private String taskName;
	private String taskOwner;
	private Timestamp startdate;
	private Timestamp enddate;
	private float duration;
	@Enumerated(EnumType.STRING)
	private Priority priority;
	@Enumerated(EnumType.STRING)
	private Status status;
	private Timestamp createDate;
	private Timestamp updateDate;
	private int isDeleted;
	@ManyToOne
	private Project project;
	
}
