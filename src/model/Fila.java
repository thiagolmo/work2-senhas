package model;

import java.util.ArrayList;

public class Fila {

	Item header;

	public Fila() {
		header = null;
	}

	// PARA TESTE
	public void insere(String tipo, String senha) {
		Item i = new Item(tipo, senha);
		if (header == null) {
			header = i;
		} else {
			Item aux = header;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(i);
		}
	}


		public void remover(int senha){
		Item ant = null;
		Item aux = header;
		
		if (header.getProximo()==null){
			header=null;}else{
		
		while(aux != null && Integer.parseInt(aux.getSenha()) != senha){
			ant=aux;
			aux=aux.getProximo();
		}
		if(aux==null){
			return;
		}
		if(ant==null){
			header=aux.getProximo();
		}else{
			ant.setProximo(aux.getProximo());
		
		}}}
	  
		 /* public void remover(String senha) {
			  	Item ant = null;
		        Item aux = this.header;
		        while(aux!=null && aux.getSenha()!=senha){
		        	ant=aux;
		        	aux=aux.getProximo();
		        }
		        if (aux!=null){
		        	if (ant==null){
		        		this.header=aux.getProximo();
		        		}else{
		        			ant.getProximo()=aux.getProximo();
		        			
		        		}
		        	
		        	};
		        	
		        }*/
		        
		        
		        
		  
	 

	public boolean vazia() {
		return (header == null);
	}

	public Item verificarProxSenha() {
		int status = 0;
		if (vazia()) {
			return null;

		} else {

			Item aux = header;
			while (aux != null && aux.getTipo() == "NORMAL") {
				aux = aux.getProximo();
			}
			if (aux != null) {
				status = 1;
				return aux;
			}
			if (status == 0) {
				aux = header;
				while (aux != null && aux.getTipo() != "NORMAL") {
					aux = aux.getProximo();
				}
				return aux;
			}

		}
		return null;
	}

	// PARA TESTE
	public void imprimir() {
		if (vazia()){
			return;
		}else{
		Item aux = header;
		System.out.println("TIPO: " + aux.getTipo());
		System.out.println("SENHA: " + aux.getSenha());
		aux = header.getProximo();
		while (aux != null) {
			System.out.println("TIPO: " + aux.getTipo());
			System.out.println("SENHA: " + aux.getSenha());
			aux = aux.getProximo();
		}
	}
}}
