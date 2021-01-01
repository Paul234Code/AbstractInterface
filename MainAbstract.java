package com.abstract_;

public class MainAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loup loup = new Loup("Gris bleuté", 20);
		loup.boire();
		loup.manger();
		loup.deplacement();
		loup.crier();
		System.out.println(loup.toString());
		Rintintin boby = new Chien("Gris bleute",30);
		System.out.println("-------------les methodes de l'interface----------------------------:");
		boby.faireLechouille();
		boby.faireLeBeau();
		boby.faireCalin();
		
		

	}

}
