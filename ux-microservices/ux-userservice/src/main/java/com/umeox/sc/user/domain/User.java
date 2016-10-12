package com.umeox.sc.user.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BaseEntity{
	
	private static final long serialVersionUID = 7863724726303525788L;
	
	private String username;
	private String password;
	private String nickname;//昵称
	private String tel;//手机号码
	private String email;//邮箱
	
	public User() {
	}
	public User(String username,String password,String nickname,String tel,String email){
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.tel = tel;
		this.email = email;
	}
	
	@Column(unique = true)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
