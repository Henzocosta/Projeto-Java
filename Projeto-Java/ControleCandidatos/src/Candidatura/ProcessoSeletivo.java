package Candidatura;

import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	 
	String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

	 for(String candidato : candidatos) {
		 entrandoEmContato(candidato);
	 }
  }
  static void entrandoEmContato (String candidato) {
	  int tentativaRealizadas = 1;
	  boolean continuarTentando = true;
	  boolean atendeu = false;
	  do {
		  atendeu = atender();
		  continuarTentando = !atendeu;
		  
		  if(continuarTentando) {
			  tentativaRealizadas++;
		  }else {
			  System.out.println("Contato realizado com sucesso!");
		  }
		  
		  
	  }while(continuarTentando && tentativaRealizadas <3);
	  
	  if(atendeu) {
		  System.out.println("Conseguimos contato com o canditado " + candidato + " na " + tentativaRealizadas + " tentativa");
	  } else {
		  System.out.println("Nao conseguimos contato com o cadidato " + candidato + " numero maximo de tentativas: " + tentativaRealizadas );
	  }
  }
	 
  
  // metodo auxiliar
  static boolean atender() {
	  return new Random().nextInt(3)==1;
  }
  static void imprimirSelecionados() {
		 String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		 
		 System.out.println("Imprimindo a lista de candidatos informacando o indice do elemento");
		 for(int indice=0; indice<candidatos.length; indice++) {
			 System.out.println("O candidato de nº " + (indice+1) + " e " + candidatos[indice]);
		 }
		 
		 System.out.println("Forma abreviada de interacao for each");
		 
		 for(String candidato : candidatos) {
			 System.out.println("O candidato selecionado foi: " + candidato);
		 }
  }
 static void selecaoDeCandidatos() {
  			
	// Array com a lista de candidatos

	 String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
	 
  			int candidatosSelecionados = 0; 
  			int candidatoAtual = 0;
  			double salarioBase = 2000.0;
  			
  			while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
  				String candidato = candidatos[candidatoAtual];
  				double salarioPretendido = valorPretendido();
  				
  				System.out.println("O candidato " + candidato + " solicitou esta valor de salario: " + salarioPretendido);
  				if(salarioBase >= salarioPretendido) {
  					System.out.println("O canditado: " + candidato + " foi selecionado");
  					candidatoAtual++;
  				} 
  				candidatoAtual++;	
  			}
  			System.out.println();
  			
  			System.out.println("Candidatos Selecionados: " + candidatosSelecionados);
  			System.out.println("Candidatos Atuais: " + candidatoAtual);
  			
  			System.out.println();
  }
 
  static double valorPretendido() {
  			return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }
  static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
	  
	  if(salarioBase > salarioPretendido) {
		  System.out.println("Ligar para Candidato ");
	  }
	  	else if(salarioBase == salarioPretendido) {
		  System.out.println("Ligar para Canditado com contra proposta");
	  	}
	  	else {
	  		System.out.println("Aguardando Resultado dos demais canditados!");
	  	}
  }
}	
