package vetorematrz;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		int[][] matriz = new int [3][3];
		int cont = 0;
		
		
		Scanner ler = new Scanner(System.in);
		
		for(int x=0;x<3;x++) {
			for (int y=0;y<3;y++) {
				System.out.println("Digite um valor: ");
				matriz[x][y] = ler.nextInt();
				if (matriz[x][y]>10) {
					cont++;
				}
			}
		
		}
		System.out.println("A quantidade de valores maiores que 10 é "+cont);
	}

}
