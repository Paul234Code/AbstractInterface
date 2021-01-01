package com.abstract_;

public class Tigre extends Felin {

	@Override
	void crier() {
		// TODO Auto-generated method stub
		System.out.println("Je grogne très fort !");
	}

	/**
	 * 
	 */
	public Tigre() {
		super();
		// TODO Auto-generated constructor stub
	}
	Tigre( String couleur, int poids){
		this.couleur= couleur;
		this.poids=poids;
	}

}
