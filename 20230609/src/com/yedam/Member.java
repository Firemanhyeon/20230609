package com.yedam;

public class Member {
	private String id ;
	private String pw;
	
	public Member() {}
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	@Override
	public int hashCode() {
//		return super.hashCode();
		return this.id.hashCode();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);
		if(!(obj instanceof Member)) {
			return false;
		}
		Member member =(Member) obj;
		if(this.id.equals(member.id)&&this.pw.equals(member.pw)) {
			return true;
		}
		return false;
	}
	@Override//재정의. 재정의를 하지않으면 방이름만 나옴
	public String toString() {
//		return super.toString();
		return "회원아이디: "+ id + ",비밀번호: "+ pw;
	}
	
	
}
