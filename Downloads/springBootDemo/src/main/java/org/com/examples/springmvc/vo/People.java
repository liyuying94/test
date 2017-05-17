package org.com.examples.springmvc.vo;

public class People {
	private Integer id;
	private String age;
	private String name;
	
	
	public People() {
		super();
	}
	public People(Integer id, String age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}
