package com.xworkz.collection.lamda.lamdaBoot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.xworkz.collection.lamda.lamdaDTO.MovieDTO;

public class MovieRunner {
	public static void main(String[] args) {

		MovieDTO dto1 = new MovieDTO("kgf", "sambargi", 220, "kannada");
		MovieDTO dto2 = new MovieDTO("rrr", "rajamouli", 200, "telugu");
		MovieDTO dto3 = new MovieDTO("charlie", "rakshithShetty", 150, "kannada");
		MovieDTO dto4 = new MovieDTO("kantara", "rishab shetty", 320, "kannada");
		MovieDTO dto5 = new MovieDTO("shersha", "abc", 220, "hindi");

		List<MovieDTO> dtos = new ArrayList<MovieDTO>();
		dtos.add(dto1);
		dtos.add(dto2);
		dtos.add(dto3);
		dtos.add(dto4);
		dtos.add(dto5);

		Comparator<MovieDTO> comparator = ((e1, e2) -> e2.getName().compareToIgnoreCase(e1.getName()));
		dtos.stream().sorted(comparator).forEach(e -> System.out.println(e));
		System.out.println(System.lineSeparator());
		System.out.println("----------sorting on price-------------");

		comparator = ((y1, y2) -> Float.compare(y2.getPrice(), y1.getPrice()));
		dtos.stream().sorted(comparator).forEach(e -> System.out.println(e));

		System.out.println(System.lineSeparator());
		 comparator=((e1,e2)-> Integer.compare(e1.getPrice(),e2.getPrice()));
		 dtos.stream().sorted(comparator).forEach(e -> System.out.println(e));
	}

}
