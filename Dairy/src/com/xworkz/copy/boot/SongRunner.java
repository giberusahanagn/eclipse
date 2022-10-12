package com.xworkz.copy.boot;

import com.xworkz.copy.program.Song;

public class SongRunner {
	public static void main(String[] args) {
		
		Song ref=new Song();
		System.out.println(ref.name);
		System.out.println(ref.lang);
		System.out.println(ref.lyrics);
		System.out.println(ref.type);
		System.out.println(ref.singer);
		ref.name="Seeta Ramam";
		ref.lang="Telugu";
		ref.lyrics="Sa re ga ma";
		ref.type="Love Confession";
		ref.singer="Ramya Behara";
		
		
		System.out.println("-----------");
		System.out.println(ref.name);
		System.out.println(ref.lang);
		System.out.println(ref.lyrics);
		System.out.println(ref.type);
		System.out.println(ref.singer);
	}

}
