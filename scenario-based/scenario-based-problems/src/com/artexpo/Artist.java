package com.artexpo;

public class Artist {

	private String name;
	private int time;
	
	public Artist(String name, int time) {
		this.name = name;
		this.time = time;
	}
	
	public int getTime() {return time;}
	public String getName() {return name;}
}
