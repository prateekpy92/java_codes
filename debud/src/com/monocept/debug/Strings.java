package com.monocept.debug;

public class Strings {

	public static void main(java.lang.String[] args) {
		
String firstName = "Prateek";
StringBuffer middleName = new StringBuffer("P");
StringBuilder lastName = new StringBuilder("Y");
concat1(middleName);
concat2(lastName);
concat3(firstName);

System.out.println(middleName);
System.out.println(lastName);
System.out.println(firstName);
			}
private static void concat3(String firstName) {
firstName = firstName + " Bijapur";
				}

				private static void concat2(StringBuilder lastName) {
	lastName.append(" Babaleshwar");
				}

				private static void concat1(StringBuffer middleName) {
	middleName.append(" Prateek");
				}

	}


