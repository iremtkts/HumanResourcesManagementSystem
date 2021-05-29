package kodlama.io.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")

public class User {
	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id ;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="created_date")
	private Date createdDate;
	@Column(name="is_active")
	private boolean isActive;
	@Column(name="is_deleted")
	private boolean isDeleted;

}
