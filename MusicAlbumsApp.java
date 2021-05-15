package za.ac.wsu.219052468
import package com.gmail.lihlewelani98

//MusicAlbumApp.java

public class MusicAlbumsApp
{
	public static void main( String[] args)
	{
		MusicAlbum Album1 = new MusicAlbum();
		Album1.setNumberOfTracks(1);
		Album1.settitleOfAlbum("Day Star");
		Album1.setnameOfArtists("Tory Lanez");
		Album1.getnamesOfTracks("Money over fall outs");
		Album1.getnumberOfMiutes(3.5);
	
		MusicAlbum Album2 = new MusicAlbum();
		Album2.setNumberOfTracks(1);
		Album2.settitleOfAlbum("Chixtape 5");
		Album2.setnameOfArtists("Tory Lanez");
		Album1.getnamesOfTracks("Broken Promises");
		Album1.getnumberOfMiutes(6.6);
		
		MusicAlbum Album3 = new MusicAlbum();
		Album3.Album1.setNumberOfTracks(1);
		Album3.settitleOfAlbum("Meet the wooo 2");
		Album3.setnameOfArtists("Pop smoke");
		Album3.getnamesOfTracks("Dior");
		Album3.getnumberOfMiutes(3.5);
		
		MusicAlbum Album4 = new MusicAlbum("East Atlanta love Letter",6, "6lack", "Unfair",4);
		Album4.setNumberOfTracks(1);
		Album4.settitleOfAlbum("East Atlanta love Letter");
		Album4.setnameOfArtists("6lack");
		Album4.getnamesOfTracks("Unfair");
		Album4.getnumberOfMiutes(3);
	
		
		MusicAlbum Album5 = new MusicAlbum("Rhass", 7, "Mr Thela","S'yophanda",2);
		Album5.setNumberOfTracks(1);
		Album5.settitleOfAlbums("Rhass");
		Album1.setnameOfArtists("Mr Thela");
		Album1.getnamesOfTracks("S'yophanda");
		Album1.getnumberOfMiutes(8.2);
		
		Album1.System.out.println( "ALBUM 1\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n");
		Album2.System.out.println( "ALBUM 2\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n" );
		Album3.System.out.println( "ALBUM 3\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n");
	    Album4.System.out.println( "ALBUM 4\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n");
        Album5.System.out.println( "ALBUM 5\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n");
        
		System.exit(0);
	}
}
