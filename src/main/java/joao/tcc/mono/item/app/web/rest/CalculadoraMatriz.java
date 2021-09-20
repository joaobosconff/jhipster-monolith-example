package joao.tcc.mono.item.app.web.rest;

import java.util.Random;

public class CalculadoraMatriz {
	
	public static void init(int linha) {
	
	    int coluna = linha;

		    //Instancia da classe que gerara os numeros aleatorios;
		    Random r = new Random();

		    //Declarando 3 arrays bidimensionais(matrizes);
		    int A[][] = new int[linha][coluna];
		    int B[][] = new int[linha][coluna];
		    int Soma[][] = new int[linha][coluna];
		    int Sub[][] = new int[linha][coluna];
		    int Mult[][] = new int[linha][coluna];

		    //Gerando a Matriz A LxCo Aij, com i e j valores iguais e sendo gerados aleatoriamente :
		    System.out.println(" A matriz 'A' é: ");
		    for (int l = 0; l < linha; l++) {
		        for (int co = 0; co < coluna; co++) {
		            A[l][co] = r.nextInt(9) + 1;
		            System.out.print(A[l][co] + " ");
		        }
		        System.out.println("");
		    }
		    System.out.println("_______________");

		    //Gerando a Matriz B LxCo Bij, com i e j valores iguais e sendo gerados aleatoriamente :
		    System.out.println("A matriz 'B' é: ");
		    for (int l = 0; l < linha; l++) {
		        for (int co = 0; co < coluna; co++) {
		            B[l][co] = r.nextInt(9) + 1;
		            System.out.print(B[l][co] + " ");
		        }
		        System.out.println("");
		    }
		    System.out.println("______________________________");

		    //Vou efetuar a soma das matrizes A e B;
		    System.out.println("A soma das matrizes A e B é: ");
		    for (int l = 0; l < linha; l++) {
		        for (int co = 0; co < coluna; co++) {
		            Soma[l][co] = A[l][co] + B[l][co];
		            System.out.print(Soma[l][co] + " ");
		        }
		        System.out.println("");
		    }
		    System.out.println("______________________________");

		    //Vou efetuar a subtração das matrizes A e B;
		    System.out.println(" A subtração das matrizes A e B é: ");
		    for (int l = 0; l < linha; l++) {
		        for (int co = 0; co < coluna; co++) {
		            Sub[l][co] = A[l][co] - B[l][co];
		            System.out.print(Sub[l][co] + " ");
		        }
		        System.out.println("");
		    }
		    System.out.println("______________________________");

		    //Vou efetuar a multiplicação das matrizes A e B;
		    System.out.println(" A multiplicação das matrizes A e B é: ");
		    for (int l = 0; l < linha; l++) {
		        for (int co = 0; co < coluna; co++) {
		            Mult[l][co] = A[l][co] * B[l][co];
		            System.out.print(Mult[l][co] + " ");
		        }
		        System.out.println("");
		    }
	}

}
