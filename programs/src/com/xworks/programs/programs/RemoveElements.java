package com.xworks.programs.programs;

public class RemoveElements {
	public static void Remove(char[] name, int length) {
		int compare = 0;
		int index;
		if (name.length != 0 && length > 2) {
			for (index = 0; index < name.length; index++) {
				for (; compare < index; compare++) {
					if (name[index] == name[compare]) {
						break;
					}
				}
				if (compare == index) {
					name[compare++] = name[index];
				}
			}

			
		}
		System.out.println(name);
	}

}
