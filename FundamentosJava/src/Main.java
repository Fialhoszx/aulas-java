
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
//		int x = 100;
//		double y = 200.3;
//
//		int a = 0;
//		double b = 0;
//
//		short z = (short) 100000;
//
//		a = (int) y; // Casting implicit
//		b = x;
//
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println('x' + 'y');
//		System.out.println(z+"\n");
//
//		int idadePessoa = 60;
//
//		if (idadePessoa < 18) {
//			System.out.println("Voc� n�o pode beber!");
//		} else if (idadePessoa >= 60) {
//			System.out.println("Voc� � muito velho! Pare de beber!");
//		} else {
//			System.out.println("Voc� pode beber!");
//		}
//
//		System.out.println("Voc� tem " + idadePessoa + " anos \n");
//
//		int dia = 10;
//
//		switch (dia) {
//		case 1:
//			System.out.println("Hoje � domingo");
//			break;
//		case 2:
//			System.out.println("Hoje � segunda-feira");
//			break;
//		case 3:
//			System.out.println("Hoje � ter�a-feira");
//			break;
//		case 4:
//			System.out.println("Hoje � quarta-feira");
//			break;
//		case 5:
//			System.out.println("Hoje � quinta-feira");
//			break;
//		case 6:
//			System.out.println("Hoje � sexta-feira");
//			break;
//		case 7:
//			System.out.println("Hoje � s�bado");
//			break;
//		default:
//			System.out.println("Esse dia n�o existe! T� maluco p�");
//		}
//		
//		char caractere = '2';
//		
//		switch(caractere) {
//		case 'a':
//			System.out.println("Primeira letra do alfabeto");
//			break;
//		case 'b':
//			System.out.println("Bobo");
//			break;
//		default:
//			System.out.println("Some daqui meu");
//		}
//		
//		String farol = "Laranja";
//		
//		switch(farol) {
//		case "Verde":
//			System.out.println("Prossiga");
//			break;
//		case "Amarelo":
//			System.out.println("Aten��o!");
//			break;
//		case "Vermelho":
//			System.out.println("Pare!");
//			break;
//		default:
//			System.out.println("Que cor � essa ai? Conhe�o n�o");
//		}
//
//		int x = 0;
//
//		while (x < 10) {
//			x = x + 1;
//			System.out.println(x);
//		}
//
//		int x = 0;
//
//		do {
//			x = x + 1;
//			System.out.println(x);
//		} while (x < 10);
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o n�mero que voc� deseja saber a tabuada");
		int x = entrada.nextInt();
		
		for(int y=1; y<=10; y++) {
			System.out.println(x + " x "+ y + " = "+ x*y);
		}
		

	}

}