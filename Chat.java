package com.abstract_;

public class Chat extends Felin{

	/**
	 * 
	 */
	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}
	Chat(String couleur, int poids){
		this.couleur= couleur;
		this.poids= poids;
	}

	@Override
	void crier() {
		// TODO Auto-generated method stub
		System.out.println("Je miaule sur les toits !");
	}

}
