package com.actividades.evaluables.actividad4;

import java.util.Scanner;

public class BatallaNavalSimplificada {

	public static void main(String[] args) {
		
		
		
		//0.COLORES
		
		
		final String RESET="\u001B[0m";
		final String ROJO="\u001B[31m";
		final String AZUL="\u001B[36m";
		
		
		
		//1.Creación del tablero
		
	
		
		String[][] tablero= {
				
				{"0","0","0","0","0"},
				{"0","0","0","0","0"},
				{"0","0","0","0","0"},
				{"0","0","0","0","0"},
				{"0","0","0","0","0"}
				
		};
		
		
		String[][] tableroMaquina= {
				
				{"1","0","0","0","0"},
				{"0","0","0","0","1"},
				{"0","0","0","0","0"},
				{"0","0","1","0","0"},
				{"0","0","0","0","0"}
				
		};
		
		
		
		
		//2.Juego del Usuario
		
		
		
		int max_intentos=10;
		int tocado=0;
		Scanner escaner=new Scanner(System.in);
		
		
			System.out.println("\n             !BIENVENIDO GRUMETE!");
	
			System.out.printf("\n     +------ TABLERO BATALLA NAVAL ------+");
			System.out.printf("\n     |                                   |\n");
	
		
		
		for(int fila=0; fila<tablero.length;fila++) {
			
			System.out.printf("  f%1d",fila);
			System.out.printf(" |\t\t");
			for(int columna=0;columna<tablero.length;columna++) {
				
			
				System.out.printf(tablero[fila][columna]+"  ");
				
			}
			
			System.out.printf("          |");
			System.out.print("\n");
			
		}
		
			System.out.printf("     |                                   |\n");
			System.out.printf("     +-----------------------------------+\n");	
		
		
		
		
		
	
		
		do {
			
			System.out.println("\n\tIntroduce las coordenadas \n\tpara disparar a un barco:"
					
					+"\n\tPrimero la fila y luego la columna (empezando por 0)");
		
		
			int coordenadaFila= escaner.nextInt();
			int coordenadaColumna=escaner.nextInt();
			
			max_intentos-=1;
		
			if((coordenadaFila<5&&coordenadaFila>=0)&&(coordenadaColumna<5&&coordenadaColumna>=0)) {
			if(tableroMaquina[coordenadaFila][coordenadaColumna].equals("1")){
			
				tocado=tocado+1;
			
				System.out.println("\t\t  ¡Tocado!");
				
				tablero[coordenadaFila][coordenadaColumna]=ROJO+"x"+RESET;
				
				

				System.out.printf("\n     +------ TABLERO BATALLA NAVAL ------+");
				System.out.printf("\n     |                                   |\n");
				
			
			for(int fila=0; fila<tablero.length;fila++) {
				
				System.out.printf("  f%1d",fila);
				System.out.printf(" |\t\t");
				
				for(int columna=0;columna<tablero.length;columna++) {
					
					System.out.printf(tablero[fila][columna]+"  ");
					
				}
				
				System.out.printf("          |");
				System.out.print("\n");
			}
			
			System.out.printf("     |                                   |\n");
			System.out.printf("     +-----------------------------------+\n");	
			
			
		}else {
			
				System.out.println("\t\t  Agua :(");
			
				tablero[coordenadaFila][coordenadaColumna]=AZUL+"~"+RESET;
				
				

				System.out.printf("\n     +------ TABLERO BATALLA NAVAL ------+");
				System.out.printf("\n     |                                   |\n");
				
			
				for(int fila=0; fila<tablero.length;fila++) {
				
					System.out.printf("  f%1d",fila);
					System.out.printf(" |\t\t");
					
					for(int columna=0;columna<tablero.length;columna++) {
					
						System.out.printf(tablero[fila][columna]+"  ");
				}
					
				System.out.printf("          |");
				System.out.print("\n");	
				
				}
		
				System.out.printf("     |                                   |\n");
				System.out.printf("     +-----------------------------------+\n");	
				
				
				
				
		};}else {System.out.println("Estas coordenadas no son validas, pierdes un turno");}
		
		}while(tocado<3&&(max_intentos>0&&max_intentos<10));
		
		
		
		
		
		//3.Condiciones 
		
		if(max_intentos==0&&tocado<3) {
			
			
			System.out.println("\n\tGAME OVER");
			System.out.println("\tPosiciones Reales:");
			
			
			
			System.out.printf("\n     +------ TABLERO BATALLA NAVAL ------+");
			System.out.printf("\n     |                                   |\n");
			
		
			
			for(int fila=0; fila<tableroMaquina.length;fila++) {
				
				System.out.printf("  f%1d",fila);
				System.out.printf(" |\t\t");
				
				for(int columna=0;columna<tableroMaquina.length;columna++) {
				
					System.out.printf(tableroMaquina[fila][columna]+"  ");
					
				}
				
				System.out.printf("          |");
				System.out.print("\n");
				
			}
			
			
			
				System.out.printf("     |                                   |\n");
				System.out.printf("     +-----------------------------------+\n");	
			
			
		};
		
		
		
		if(tocado==3&&max_intentos>0) {
			
			System.out.println("\n\t\t ¡VICTORIA!");
		
		};
		
		
		
		
		escaner.close();
		
	
		
	}
	


}
