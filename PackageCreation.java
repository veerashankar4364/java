package com.myjavaintro;

public class PackageCreation {
	static String CountryName="nani";
	static int CountryCode=+22;
	int JerseyNo=10;
	String PlayerName="Dni";
	public static void main(String[] args) {
		CountryCode= +91;
		CountryName="India";
		PackageCreation n1= new PackageCreation();
		n1.JerseyNo=7;
		n1.PlayerName="Dhoni";
		System.out.println("the country name is " +CountryName);
		System.out.println("the country id is " +CountryCode);
		System.out.println("JersyNo is "+n1.JerseyNo);
		System.out.println("PlayerName is "+n1.PlayerName);
		
		CountryCode= +91;
		CountryName="India";
		PackageCreation n2= new PackageCreation();
		n2.JerseyNo=18;
		n2.PlayerName="kohli";
		System.out.println("the country name is " +CountryName);
		System.out.println("the country id is " +CountryCode);
		System.out.println("JersyNo is "+n2.JerseyNo);
		System.out.println("PlayerName is "+n2.PlayerName);
		
		CountryCode= +92;
		CountryName="Bharat";
		PackageCreation n3= new PackageCreation();
		n3.JerseyNo=45;
		n3.PlayerName="Rohit  Sharma";
		System.out.println("the country name is " +CountryName);
		System.out.println("the country id is " +CountryCode);
		System.out.println("JersyNo is "+n3.JerseyNo);
		System.out.println("PlayerName is "+n3.PlayerName);
		
		CountryCode= +92;
		CountryName="India";
		PackageCreation n4= new PackageCreation();
		n4.JerseyNo=1;
		n4.PlayerName="boom";
		System.out.println("the country name is " +CountryName);
		System.out.println("the country id is " +CountryCode);
		System.out.println("JersyNo is "+n4.JerseyNo);
		System.out.println("PlayerName is "+n4.PlayerName);
	}
}