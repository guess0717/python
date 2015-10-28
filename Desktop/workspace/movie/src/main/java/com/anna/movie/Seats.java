package com.anna.movie;

public class Seats {
	int id;
	int play_id;
	int seat_no;
	int status;
	public Seats(int play_id, int seat_no) {
		super();
		this.play_id = play_id;
		this.seat_no = seat_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPlay_id() {
		return play_id;
	}
	public void setPlay_id(int play_id) {
		this.play_id = play_id;
	}
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}

