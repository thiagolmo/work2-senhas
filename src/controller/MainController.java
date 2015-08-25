package controller;

import javax.swing.JLabel;

import model.Fila;
import model.Item;
import view.MainWindow;


public class MainController {
	
	
	Fila fila = new Fila();
    MainWindow view;
	int senhaAtual=0;
	
	public MainController (){
		
	}
	
	public void retirarSenhaNormal (){
		fila.insere("NORMAL",Integer.toString(senhaAtual));
		atualizarSenhaAtual();
		
	
		
	}
	
	public void retirarSenhaPreferencial(){
		fila.insere("PRIOR",Integer.toString(senhaAtual));
		atualizarSenhaAtual();
	}
	
	public void chamarSenha (){
			if (fila.vazia()){
			System.out.println("Vazio!");
		}else{
		System.out.println(fila.verificarProxSenha().getSenha()+"-"+fila.verificarProxSenha().getTipo());
		fila.remover(Integer.parseInt(fila.verificarProxSenha().getSenha()));
		
		
		
		
		
		
		}}

	
	
	public void atualizarSenhaAtual(){
		senhaAtual=senhaAtual+1;
	}
	
	

}
