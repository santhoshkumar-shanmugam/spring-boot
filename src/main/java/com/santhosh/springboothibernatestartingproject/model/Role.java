package com.santhosh.springboothibernatestartingproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private int roleId;

	@Column(name = "role_name")
	private String roleName;

	@Column(name = "created_date")
	private Date createdDate;

	/*
	 * @OneToOne private Employee employee;
	 */

	public Role() {
		super();
	}

	public Role(int roleId, String roleName, Date createdDate) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.createdDate = createdDate;

	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", createdDate=" + createdDate + "]";
	}

	// public Employee getEmployee() {
	// return employee;
	// }
	//
	// public void setEmployee(Employee employee) {
	// this.employee = employee;
	// }

}
