package com.abstract_;

public class Lion extends Felin{

	@Override
	void crier() {
		// TODO Auto-generated method stub
		System.out.println("Je rugis dans la savane !");
	}

	/**
	 * 
	 */
	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}
	Lion (String couleur, int poids){
		this.couleur = couleur;
		this.poids= poids;
	}

}
