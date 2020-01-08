package com.Leon.pojo;
// Generated 2019-1-2 0:12:42 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Conference generated by hbm2java
 */
@Entity
@Table(name = "conference", catalog = "cms")
public class Conference implements java.io.Serializable {

	private Integer id;
	private String name;
	private Date date;
	private String address;
	private String poster;
	private String sketch;
	private String detail;
	private String images;
	private int state;
	private String author;

	public Conference() {
	}

	public Conference(String name, Date date, String address, String poster, String sketch, int state) {
		this.name = name;
		this.date = date;
		this.address = address;
		this.poster = poster;
		this.sketch = sketch;
		this.state = state;
	}

	public Conference(String name, Date date, String address, String poster, String sketch, String detail,
			String images, int state, String author) {
		this.name = name;
		this.date = date;
		this.address = address;
		this.poster = poster;
		this.sketch = sketch;
		this.detail = detail;
		this.images = images;
		this.state = state;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return id+"\n"+name+"\n"+date+"\n"+address+"\n"+poster+"\n"+sketch.trim()+"\n"+detail+"\n"+images+"\n"+state+"\n"+author;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 16)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "address", nullable = false, length = 32)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "poster", nullable = false, length = 128)
	public String getPoster() {
		return this.poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	@Column(name = "sketch", nullable = false, length = 256)
	public String getSketch() {
		return this.sketch;
	}

	public void setSketch(String sketch) {
		this.sketch = sketch;
	}

	@Column(name = "detail", length = 2048)
	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Column(name = "images", length = 128)
	public String getImages() {
		return this.images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	@Column(name = "state", nullable = false)
	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Column(name = "author", length = 10)
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
