package com.xworkz.collection.boot;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.dto.TShirtDTO;

public class TShirtRunner {

	public static void main(String[] args) {

		Set<String> string = new TreeSet<String>();
		string.add("sahana");
		string.add("swati");
		string.add("neelu");
		string.add("neelu");
		System.out.println(string.size());
		for (String tShirtDTO : string) {
			System.out.println(tShirtDTO);
		}

		System.out.println("--------------running Dto's---------");
		TShirtDTO dto1 = new TShirtDTO("MAX", false, 200);
		TShirtDTO dto2 = new TShirtDTO("PUMA", false, 200);
		TShirtDTO dto3 = new TShirtDTO("LIFESTYLE", false, 200);

		Set<TShirtDTO> sets = new TreeSet<TShirtDTO>();
		sets.add(dto3);
		sets.add(dto1);
		sets.add(dto2);
		sets.add(dto3);
		sets.add(dto1);
		System.out.println("Size of sets: " + sets.size());
		for (TShirtDTO tShirtDTO : sets) {
			System.out.println(tShirtDTO);
			System.out.println("original hashcode:" + System.identityHashCode(sets));
		}
	}

}
