package com.jhonny.concept;

public class Main {
	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		p.empilhar(10);
		p.empilhar(12);
		p.empilhar(23);
		p.desempilha();
		
		System.out.println(p.verTopo());
		
	}
}
