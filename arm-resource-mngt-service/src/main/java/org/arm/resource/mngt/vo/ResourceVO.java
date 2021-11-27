package org.arm.resource.mngt.vo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.arm.resource.mngt.entity.Availability;
import org.arm.resource.mngt.entity.Leaves;
import org.arm.resource.mngt.entity.Task;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "resourceId")
public class ResourceVO implements Serializable {

	/**
	*
	*/
	private static final long serialVersionUID = 8386616996157565633L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resourceId;
	private String resourceName;
	private String resourceType;
	private String region;
	@OneToMany(mappedBy = "resource")
//@JsonBackReference
	private List<Task> taskList;

	@OneToOne
	@JoinColumn(name = "availableId")
	private Availability availability;

	@OneToOne
	@JoinColumn(name = "leave_id")
	private Leaves leave;

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public Availability getAvailability() {
		return availability;
	}

	public void setAvailability(Availability availability) {
		this.availability = availability;
	}

	public Leaves getLeave() {
		return leave;
	}

	public void setLeave(Leaves leave) {
		this.leave = leave;
	}

}
