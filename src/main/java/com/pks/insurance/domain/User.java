package com.pks.insurance.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ja_users database table.
 * 
 */
@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=100)
	private String activation;

	@Column(nullable=false)
	private byte block;

	@Column(nullable=false, length=100)
	private String email;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date lastResetTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date lastvisitDate;

	@Column(nullable=false, length=255)
	private String name;

	@Column(nullable=false, length=1000)
	private String otep;

	@Column(nullable=false, length=1000)
	private String otpKey;

	@Lob
	@Column(nullable=false)
	private String params;

	@Column(nullable=false, length=100)
	private String password;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date registerDate;

	@Column(nullable=false)
	private byte requireReset;

	@Column(nullable=false)
	private int resetCount;

	private byte sendEmail;

	@Column(nullable=false, length=150)
	private String username;

	//bi-directional many-to-many association to Usergroup
	@ManyToMany
	@JoinTable(
		name="user_usergroup_map"
		, joinColumns={
			@JoinColumn(name="user_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="group_id", nullable=false)
			}
		)
	private List<Usergroup> usergroups;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivation() {
		return this.activation;
	}

	public void setActivation(String activation) {
		this.activation = activation;
	}

	public byte getBlock() {
		return this.block;
	}

	public void setBlock(byte block) {
		this.block = block;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastResetTime() {
		return this.lastResetTime;
	}

	public void setLastResetTime(Date lastResetTime) {
		this.lastResetTime = lastResetTime;
	}

	public Date getLastvisitDate() {
		return this.lastvisitDate;
	}

	public void setLastvisitDate(Date lastvisitDate) {
		this.lastvisitDate = lastvisitDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOtep() {
		return this.otep;
	}

	public void setOtep(String otep) {
		this.otep = otep;
	}

	public String getOtpKey() {
		return this.otpKey;
	}

	public void setOtpKey(String otpKey) {
		this.otpKey = otpKey;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public byte getRequireReset() {
		return this.requireReset;
	}

	public void setRequireReset(byte requireReset) {
		this.requireReset = requireReset;
	}

	public int getResetCount() {
		return this.resetCount;
	}

	public void setResetCount(int resetCount) {
		this.resetCount = resetCount;
	}

	public byte getSendEmail() {
		return this.sendEmail;
	}

	public void setSendEmail(byte sendEmail) {
		this.sendEmail = sendEmail;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Usergroup> getUsergroups() {
		return this.usergroups;
	}

	public void setUsergroups(List<Usergroup> usergroups) {
		this.usergroups = usergroups;
	}

}