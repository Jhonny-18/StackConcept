package com.jhonny.concept;

import java.util.Stack;

public class Pilha {
	private Stack<Integer> pilha;

	public Pilha() {
		pilha = new Stack<>();
	}
	
	public void empilhar(int number) {
		pilha.push(number);
		System.out.println("Elemento empilhado");
	}
	
	public int desempilha() {
		if(!pilha.isEmpty()) {
			int removeElemento = pilha.pop();
			System.out.println("Elemento foi desempilhado");
			return removeElemento;
		}else {
			System.out.println("A pilha está vazia");
			return 0;
		}
	}
	public int verTopo() {
		if(!pilha.isEmpty()){
			return pilha.peek();
		}else {
			System.out.println("Sua pilha está vazia");
			return 0;
		}
	}
	
	public boolean pilhaVazia() {
		return pilha.isEmpty();
	}
}
