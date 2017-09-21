package com.pojo;

public class Addr {

	private Integer aid;
	private String addrName;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAddrName() {
		return addrName;
	}
	public void setAddrName(String addrName) {
		this.addrName = addrName;
	}
	@Override
	public String toString() {
		return "Addr [aid=" + aid + ", addrName=" + addrName + "]";
	}
	
}
