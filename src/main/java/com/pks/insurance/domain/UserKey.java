package com.pks.insurance.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ja_user_keys database table.
 * 
 */
@Entity
@Table(name="ja_user_keys")
@NamedQuery(name="UserKey.findAll", query="SELECT u FROM UserKey u")
public class UserKey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false)
	private byte invalid;

	@Column(nullable=false, length=255)
	private String series;

	@Column(nullable=false, length=200)
	private String time;

	@Column(nullable=false, length=255)
	private String token;

	@Column(nullable=false, length=255)
	private String uastring;

	@Column(name="user_id", nullable=false, length=255)
	private String userId;

	public UserKey() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getInvalid() {
		return this.invalid;
	}

	public void setInvalid(byte invalid) {
		this.invalid = invalid;
	}

	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUastring() {
		return this.uastring;
	}

	public void setUastring(String uastring) {
		this.uastring = uastring;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}