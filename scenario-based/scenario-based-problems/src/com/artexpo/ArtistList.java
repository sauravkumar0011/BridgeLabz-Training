package com.artexpo;
 
import java.util.ArrayList;

public class ArtistList {

	private ArrayList<Artist> artistList;
	
	public ArtistList() {
		this.artistList = new ArrayList<>();
	}
	
	public void addArtist(Artist artist)
	{
		int i = 0;
		
		for(Artist a : artistList) {
			
			if(a.getTime() <= artist.getTime())
				i++;
			else {
				break;
			}
		}
		artistList.add(i,artist);
	}
	
	public void displayArtists() {
        for(Artist a : artistList) {
			System.out.println("Name : " + a.getName());
	    }
	}
	
}
