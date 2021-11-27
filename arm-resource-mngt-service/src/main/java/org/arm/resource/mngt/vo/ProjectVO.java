package org.arm.resource.mngt.vo;

import java.io.Serializable;
import javax.persistence.Id;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "projectId")
public class ProjectVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6508299485922031642L;
	@Id
	private int projectId;
	private String projectName;
}
