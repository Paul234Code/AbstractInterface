package com.abstract_;

public class Chien extends Calin implements Rintintin{

	@Override
	void crier() {
		System.out.println("j'abois woow woow");
		// TODO Auto-generated method stub
		
	}
	public Chien() {
		super();
		// TODO Auto-generated constructor stub
	}
	Chien (String couleur, int poids){
		this.couleur= couleur;
		this.poids= poids;
	}
	public void faireCalin() {
		System.out.println("Je te fais un GROS CÂLIN");
	}
	public void faireLechouille() {
		System.out.println("Je fais le beau !");
	}
	public void faireLeBeau() {
		System.out.println("Je fais de grosses léchouilles...");
		
	}

	
}
