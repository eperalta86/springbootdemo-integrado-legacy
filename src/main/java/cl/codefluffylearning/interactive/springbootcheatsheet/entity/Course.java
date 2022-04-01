package cl.codefluffylearning.interactive.springbootcheatsheet.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="course_id")
	private int courseId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="cost")
	private int cost;
	
	public Course() {
		
	}
	
	public Course (int courseId, String title, String duration, int cost) {
		this.courseId = courseId;
		this.title = title;
		this.duration = duration;
		this.cost = cost;
	}
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	

}
