package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cvs")


public class Cv {
	@Id
	@Column(name="cv_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cvId;
	
	@ManyToOne(targetEntity= JobSeeker.class)
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
	
	@Column(name="description")
	private String description;
	
	@Column(name="github_adress")
	private String githubAddress;
	
	@Column(name="linkedin_adress")
	private String linkedinAddress;
	
	@JsonIgnore
	@OneToMany(mappedBy="cv")
	private List<Education> education;
	
	@JsonIgnore
	@OneToMany(mappedBy="cv")
	private List<JobSeekerLanguage> jobSeekerLanguage;
	
	@JsonIgnore
	@OneToMany(mappedBy="cv")
	private List<Technology> technology;
	
	@JsonIgnore
	@OneToMany(mappedBy="cv")
	private List<WorkExperience> workExperience;
	
	//@JsonIgnore
//	@OneToMany(mappedBy="cv")
	//private List<Photo> photo;
	
	
	

}
