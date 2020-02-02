package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id // 프라이머리 키 관리
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 데이터베이스에서 자동으로 1씩 증가.
	@Column(nullable=false, length=20) // 디폴트값이 null이 안 되도록.
	
	private Long id;
	private String userId;
	private String name;
	private String email;
	private String password;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userid=" + userId + ", username=" + name + ", useremail=" + email + ", userpw=" + password
				+ "]";
	}
}
