package com.techlabs.models;

public class HashSet {

	public static void main(String[] args) {
		HashSet<String> set =new HashSet<String>();
		
		        
		        String str1 = new String("lmn");
		        System.out.println("str1 hashCode: " + str1.hashCode());
		        set.add(str1);
		        System.out.println("str1 hashCode after adding to set: " + str1.hashCode());

		        String str2 = new String("abc");
		        System.out.println("str2 hashCode: " + str2.hashCode());
		        set.add(str2);
		        System.out.println("str2 hashCode after adding to set: " + str2.hashCode());

		        String str3 = new String("xyz");
		        System.out.println("str3 hashCode: " + str3.hashCode());
		        set.add(str3);
		        System.out.println("str3 hashCode after adding to set: " + str3.hashCode());

		        System.out.println("HashSet: " + set);
		        System.out.println("Size of HashSet: " + set.size());
		    }
		


	}


