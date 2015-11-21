package com.pks.insurance.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usergroups database table.
 * 
 */
@Entity
public class Usergroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false)
	private int lft;

	@Column(name="parent_id", nullable=false)
	private int parentId;

	@Column(nullable=false)
	private int rgt;

	@Column(nullable=false, length=100)
	private String title;

	//bi-directional many-to-many association to User
	@ManyToMany
	@JoinTable(
		name="user_usergroup_map"
		, joinColumns={
			@JoinColumn(name="group_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="user_id", nullable=false)
			}
		)
	private List<User> users;

	public Usergroup() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLft() {
		return this.lft;
	}

	public void setLft(int lft) {
		this.lft = lft;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getRgt() {
		return this.rgt;
	}

	public void setRgt(int rgt) {
		this.rgt = rgt;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}