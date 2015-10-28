package com.anna.movie;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Plays {
	int id;
	int movie_id;
	Date time;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	public Plays(int id, int movie_id, Date time) {
		super();
		this.id = id;
		this.movie_id = movie_id;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
