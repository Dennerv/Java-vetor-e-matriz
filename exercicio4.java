package vetorematrz;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
*/
		
		float [][] m1 = new float[2][2];
		float [][] m2 = new float[2][2];
		float [][] m3 = new float[2][2];
		int op;
		Scanner ler = new Scanner(System.in);
		
		
		for(int x=0;x<2;x++) {
			for(int y=0;y<2;y++) {
				System.out.println("\nm1 = "+x+" e "+y);
				m1[x][y] = ler.nextInt();
				System.out.println("\nm2 = "+x+" e "+y);
				m2[x][y] = ler.nextInt();
			}
		}
		System.out.println(" (1) para somar duas matrizes \n (2) para subtrair a primeira matriz"
				+ "\n (3) para adicionar constante as duas matrizes \n (4) para imprimir as matrizes\n");
		
		System.out.println("Escolha uma das op��es acima: ");
		op = ler.nextInt();
		
				switch(op) {
				
				case 1: 

					for(int x=0;x<2;x++) {
						for(int y=0;y<2;y++) {
							m3[x][y] = m1[x][y]+m2[x][y];
							System.out.println("["+m3[x][y]+"]");
						}
						System.out.println("\n");
					}
						
					break;
				case 2: 
					for(int x=0;x<2;x++) {
						for(int y=0;y<2;y++) {
							m3[x][y] = m1[x][y]-m2[x][y];
							System.out.println("["+m3[x][y]+"]");
						}
					}
					break;
				case 3: 
					System.out.println("Escreva um valor para matriz 1: ");
					m1[0][0] = ler.nextFloat();
					System.out.println("Escreva um valor para matriz 2: ");
					m2[0][1] = ler.nextFloat();
					break;
				case 4:
					for(int x=0;x<2;x++) { //linha 
						for(int y=0;y<2;y++) {  // coluna     (faz o loop ate preencher as dois espa�os de linha e coluna)
						System.out.println("["+m1[x][y]+"]");
						}
						System.out.println("\n");
					}
					break;
			    default: 
			    	System.out.println("\n Op��o invalida!");
					
				}
			}
			
		
		
		
		
	}
	


