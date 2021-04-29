package primeiroTrabalhoJava;

import	java.util.Scanner;
public class Poligonos {
	public static void main(String[]args) {
		
		
		for(int i = 1; i < 10;) {
		
		System.out.println("Selecione um polígono digitando seu número \n");
		
		System.out.println("  Retângulo     01 ");
		System.out.println("  Paralelograma 02 ");
		System.out.println("  Trapézio      03 ");
		System.out.println("  Losango       04 ");
		System.out.println("  Sair          09 ");
	
		Scanner dado = new Scanner(System.in);
		
		 float dadoEntrada = dado.nextInt();
		 
		
		
	
	
	if(dadoEntrada == 01) {
		System.out.println("Imforme a base do  retângulo ");
		float baseQuadrado = dado.nextFloat();
		System.out.println("Informe a altura do  retângulo ");
		float alturaQuadrado = dado.nextFloat();
	    float area = baseQuadrado * alturaQuadrado;
		System.out.println("Área do quadrado é "+area+" centimentros ");
	}else if(dadoEntrada ==02) {
		System.out.println("Informe a base do paralelograma");
		float base = dado.nextFloat();
		System.out.println("Informe a altura do paralelograma");
		float altura = dado.nextFloat();
		float area = base * altura;
		System.out.println("A área total é "+area+" centimentros ");
	}else if(dadoEntrada ==03) {
		System.out.println("Informe a base maior do trapézio ");
		float baseMaior = dado.nextFloat();
		System.out.println("Informe a base menor do trapézio");
		float baseMenor = dado.nextFloat();
		System.out.println("Informe a altura do trapésio ");
		float altura = dado.nextFloat();
		float area = (baseMaior + baseMenor) * altura/2; 
		System.out.println("A área total do trapézio é: "+area+" centimentros ");
	}else if(dadoEntrada ==04) {
		System.out.println("Informe diagonal maior do losango");
		float diagonalMaior = dado.nextFloat();
		System.out.println("Informe a diagonal menor do losango");
		float diagonalMenor = dado.nextFloat();
		float area = diagonalMaior * diagonalMenor / 2;
		System.out.println("Total da área é: "+area+" centimentros ");
	}else if(dadoEntrada == 9) {
		System.exit(0);
	}	else {
		System.out.println("Dado inválido");
		
	}
		
		}	
		
	}	
		
		
		
		
		
		
		
	}
	
	  
	
	
	


