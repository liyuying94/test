package org.com.examples.springmvc.entity;

import java.io.Serializable;

/**
 * 学生实体
 */

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2542917141205484745L;
	private Integer id;
	private String name;
	private String sumScore;
	private String avgScore;
	private Integer age;

	public Student() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSumScore() {
		return sumScore;
	}

	public void setSumScore(String sumScore) {
		this.sumScore = sumScore;
	}

	public String getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(String avgScore) {
		this.avgScore = avgScore;
	}

	public int getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sumScore=" + sumScore + ", avgScore=" + avgScore + ", age="
				+ age + "]";
	}

}
