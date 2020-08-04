package array;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		String name= "le  vAn      luYen";
		int n = name.length();
		name.trim();
		while (name.indexOf("  ") != -1) {
			name = name.replaceAll("  "," ");
		}
		String temp[]= name.split(" ");
		name="";
		for (int i = 0; i < temp.length; i++) {
            name += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1).toLowerCase();
            if (i < temp.length ) 
                name += " ";
        }
		  System.out.println(name);
	
	}

}
