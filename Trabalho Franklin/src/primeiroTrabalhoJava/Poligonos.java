package primeiroTrabalhoJava;

import	java.util.Scanner;
public class Poligonos {
	public static void main(String[]args) {
		
		
		for(int i = 1; i < 10;) {
		
		System.out.println("Selecione um pol�gono digitando seu n�mero \n");
		
		System.out.println("  Ret�ngulo     01 ");
		System.out.println("  Paralelograma 02 ");
		System.out.println("  Trap�zio      03 ");
		System.out.println("  Losango       04 ");
		System.out.println("  Sair          09 ");
	
		Scanner dado = new Scanner(System.in);
		
		 float dadoEntrada = dado.nextInt();
		 
		
		
	
	
	if(dadoEntrada == 01) {
		System.out.println("Imforme a base do  ret�ngulo ");
		float baseQuadrado = dado.nextFloat();
		System.out.println("Informe a altura do  ret�ngulo ");
		float alturaQuadrado = dado.nextFloat();
	    float area = baseQuadrado * alturaQuadrado;
		System.out.println("�rea do quadrado � "+area+" centimentros ");
	}else if(dadoEntrada ==02) {
		System.out.println("Informe a base do paralelograma");
		float base = dado.nextFloat();
		System.out.println("Informe a altura do paralelograma");
		float altura = dado.nextFloat();
		float area = base * altura;
		System.out.println("A �rea total � "+area+" centimentros ");
	}else if(dadoEntrada ==03) {
		System.out.println("Informe a base maior do trap�zio ");
		float baseMaior = dado.nextFloat();
		System.out.println("Informe a base menor do trap�zio");
		float baseMenor = dado.nextFloat();
		System.out.println("Informe a altura do trap�sio ");
		float altura = dado.nextFloat();
		float area = (baseMaior + baseMenor) * altura/2; 
		System.out.println("A �rea total do trap�zio �: "+area+" centimentros ");
	}else if(dadoEntrada ==04) {
		System.out.println("Informe diagonal maior do losango");
		float diagonalMaior = dado.nextFloat();
		System.out.println("Informe a diagonal menor do losango");
		float diagonalMenor = dado.nextFloat();
		float area = diagonalMaior * diagonalMenor / 2;
		System.out.println("Total da �rea �: "+area+" centimentros ");
	}else if(dadoEntrada == 9) {
		System.exit(0);
	}	else {
		System.out.println("Dado inv�lido");
		
	}
		
		}	
		
	}	
		
		
		
		
		
		
		
	}
	
	  
	
	
	


