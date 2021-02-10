package com.thinkitive.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.thinkitive.enums.Gender;
import com.thinkitive.enums.UserStatus;
import com.thinkitive.enums.UserType;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
//	private String userEmail;
	private String userPassword;
	private String userName;
//	private Gender userGender;
//	private String userAddress;
//	private String userMobile;
//	private String userCreatedOn;
	@Enumerated(EnumType.STRING)
	private UserType type;
	@Enumerated(EnumType.STRING)
	private UserStatus isApproved;

	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public UserStatus getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(UserStatus isApproved) {
		this.isApproved = isApproved;
	}

	public User(Long userId, String userPassword, String userName, UserType type, UserStatus isApproved) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.type = type;
		this.isApproved = isApproved;
	}

	public User() {
		
	}



	
}
