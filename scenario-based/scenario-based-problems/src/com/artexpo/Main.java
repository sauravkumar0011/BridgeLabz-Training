package com.artexpo;

public class Main {

	public static void main(String[] args) {

		Artist a1 = new Artist("saurav", 1200);
		Artist a2 = new Artist("shivam", 2200);
		Artist a3 = new Artist("rohit", 1500);
		Artist a4 = new Artist("himesh", 2300);
		
		ArtistList list = new ArtistList();
		list.addArtist(a1);
		list.addArtist(a2);
		list.addArtist(a3);
		list.addArtist(a4);
		
		list.displayArtists();	
	}

}
