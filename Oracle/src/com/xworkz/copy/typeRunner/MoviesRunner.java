package com.xworkz.copy.typeRunner;

import com.xworkz.copy.type.Movies;

public class MoviesRunner {

	public static void main(String[] args) {
		Movies movie=new Movies();
		movie.display();
		System.out.println("====================");
		String[] movieSongs = { "Singera Siri", "Varaha Roopam", "Vaa Poruluya", "Rebel Song" };
		int[] ticketPrice = { 100, 260, 200 };
		String[] characters = { "Shiva", "Rukkamini", "Leela", "Sudakara", "Kamala" };
		String[] language = { "Kannada", "English", "Hindi", "Telugu" };
		String[] castName = { "Rishab Shetty", "Sapthami", "Kishor", "Promodha Shetty" };
		String[] theatreName = { "Kaveri", "PVR cinimas", "Prasanna" };

		Movies movie1 = new Movies("Kantara", "Rishab Shetty", "Sapthami", 22, 100, 5, movieSongs, ticketPrice,
				characters, language, castName, theatreName);
		movie1.display();
	}

}
