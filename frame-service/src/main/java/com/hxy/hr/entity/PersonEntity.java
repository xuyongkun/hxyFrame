package com.hxy.hr.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 人事表
 * 
 * @author kenny
 * @email xuyongkun22@163.com
 * @date 2017-10-26 14:48:12
 */
public class PersonEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String id;
	//
	private String bapid;
	//
	private String hrNo;
	//
	private String hrName;
	//
	private Date createTime;
	//
	private Date updateTime;
	//
	private String status;
	//
	private String phone;
	//
	private String photo;
	//
	private String email;
	//
	private String degree;
	//
	private String address;
	//
	private String supervisor;
	//
	private String age;
	//
	private String nation;
	//
	private String createId;
	//
	private String updateId;
	//
	private String baid;
	//
	private String idCard;
	//
	private String school;
	//
	private Date startTime;
	//
	private Date endTime;
	//
	private String contacts;
	//
	private String contactsPhone;
	//
	private Integer empStatus;

	/**
	 * 设置：
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setBapid(String bapid) {
		this.bapid = bapid;
	}
	/**
	 * 获取：
	 */
	public String getBapid() {
		return bapid;
	}
	/**
	 * 设置：
	 */
	public void setHrNo(String hrNo) {
		this.hrNo = hrNo;
	}
	/**
	 * 获取：
	 */
	public String getHrNo() {
		return hrNo;
	}
	/**
	 * 设置：
	 */
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	/**
	 * 获取：
	 */
	public String getHrName() {
		return hrName;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/**
	 * 获取：
	 */
	public String getPhoto() {
		return photo;
	}
	/**
	 * 设置：
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}
	/**
	 * 获取：
	 */
	public String getDegree() {
		return degree;
	}
	/**
	 * 设置：
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：
	 */
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	/**
	 * 获取：
	 */
	public String getSupervisor() {
		return supervisor;
	}
	/**
	 * 设置：
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * 获取：
	 */
	public String getAge() {
		return age;
	}
	/**
	 * 设置：
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}
	/**
	 * 获取：
	 */
	public String getNation() {
		return nation;
	}
	/**
	 * 设置：
	 */
	public void setCreateId(String createId) {
		this.createId = createId;
	}
	/**
	 * 获取：
	 */
	public String getCreateId() {
		return createId;
	}
	/**
	 * 设置：
	 */
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	/**
	 * 获取：
	 */
	public String getUpdateId() {
		return updateId;
	}
	/**
	 * 设置：
	 */
	public void setBaid(String baid) {
		this.baid = baid;
	}
	/**
	 * 获取：
	 */
	public String getBaid() {
		return baid;
	}
	/**
	 * 设置：
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	/**
	 * 获取：
	 */
	public String getIdCard() {
		return idCard;
	}
	/**
	 * 设置：
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	/**
	 * 获取：
	 */
	public String getSchool() {
		return school;
	}
	/**
	 * 设置：
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * 获取：
	 */
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * 设置：
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 获取：
	 */
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * 设置：
	 */
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	/**
	 * 获取：
	 */
	public String getContacts() {
		return contacts;
	}
	/**
	 * 设置：
	 */
	public void setContactsPhone(String contactsPhone) {
		this.contactsPhone = contactsPhone;
	}
	/**
	 * 获取：
	 */
	public String getContactsPhone() {
		return contactsPhone;
	}
	/**
	 * 设置：
	 */
	public void setEmpStatus(Integer empStatus) {
		this.empStatus = empStatus;
	}
	/**
	 * 获取：
	 */
	public Integer getEmpStatus() {
		return empStatus;
	}
}
