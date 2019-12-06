package com.example.springwebApplicationjpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phone {
	@Id
	private int pid;
	private String name;
	private String sim;
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Phone [pid=" + pid + ", name=" + name + ", sim=" + sim + "]";
	}
	
	

}
