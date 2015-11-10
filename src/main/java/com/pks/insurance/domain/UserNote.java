package com.pks.insurance.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ja_user_notes database table.
 * 
 */
@Entity
@Table(name="ja_user_notes")
@NamedQuery(name="UserNote.findAll", query="SELECT u FROM UserNote u")
public class UserNote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Lob
	@Column(nullable=false)
	private String body;

	@Column(nullable=false)
	private int catid;

	@Column(name="checked_out", nullable=false)
	private int checkedOut;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="checked_out_time", nullable=false)
	private Date checkedOutTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_time", nullable=false)
	private Date createdTime;

	@Column(name="created_user_id", nullable=false)
	private int createdUserId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modified_time", nullable=false)
	private Date modifiedTime;

	@Column(name="modified_user_id", nullable=false)
	private int modifiedUserId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="publish_down", nullable=false)
	private Date publishDown;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="publish_up", nullable=false)
	private Date publishUp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="review_time", nullable=false)
	private Date reviewTime;

	@Column(nullable=false)
	private byte state;

	@Column(nullable=false, length=100)
	private String subject;

	@Column(name="user_id", nullable=false)
	private int userId;

	public UserNote() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getCatid() {
		return this.catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public int getCheckedOut() {
		return this.checkedOut;
	}

	public void setCheckedOut(int checkedOut) {
		this.checkedOut = checkedOut;
	}

	public Date getCheckedOutTime() {
		return this.checkedOutTime;
	}

	public void setCheckedOutTime(Date checkedOutTime) {
		this.checkedOutTime = checkedOutTime;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public int getCreatedUserId() {
		return this.createdUserId;
	}

	public void setCreatedUserId(int createdUserId) {
		this.createdUserId = createdUserId;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public int getModifiedUserId() {
		return this.modifiedUserId;
	}

	public void setModifiedUserId(int modifiedUserId) {
		this.modifiedUserId = modifiedUserId;
	}

	public Date getPublishDown() {
		return this.publishDown;
	}

	public void setPublishDown(Date publishDown) {
		this.publishDown = publishDown;
	}

	public Date getPublishUp() {
		return this.publishUp;
	}

	public void setPublishUp(Date publishUp) {
		this.publishUp = publishUp;
	}

	public Date getReviewTime() {
		return this.reviewTime;
	}

	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}

	public byte getState() {
		return this.state;
	}

	public void setState(byte state) {
		this.state = state;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}