package com.hhit.entity;
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : WeiboInfo.java
//  @ Date : 2016/4/3
//  @ Author : 
//
//




public class WeiboInfo implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String identifier;
	private String name;
	private String avatar;
	private String location;
	private String gender;
	private Integer followersCount;
	private Integer friendsCount;
	private Integer weiBoClass;
	private String createTime;
	private String description;
	private User user;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getFollowersCount() {
		return followersCount;
	}
	public void setFollowersCount(Integer followersCount) {
		this.followersCount = followersCount;
	}
	public Integer getFriendsCount() {
		return friendsCount;
	}
	public void setFriendsCount(Integer friendsCount) {
		this.friendsCount = friendsCount;
	}
	public Integer getWeiBoClass() {
		return weiBoClass;
	}
	public void setWeiBoClass(Integer weiBoClass) {
		this.weiBoClass = weiBoClass;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}