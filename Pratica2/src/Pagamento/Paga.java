package Pagamento;

import java.util.Scanner;

public class Paga {

	public static void main(String[] args) {
		
		Scanner Entra = new Scanner(System.in);
		
		Double Tgasto, Vista, Par2x, pag, pg3x, OpPag, alt1;
		int Op, Op1=0,i=1;
		
		do{
			
		System.out.println("\nValor a ser pago: " );
		Tgasto=Entra.nextDouble();
		
		
		System.out.println("1 - À Vista: a vista com 10% de desconto");
		System.out.println("2 - Parcelado 2x: em duas vezes");
		System.out.println("3 - Parcelado de 3x até 6x: de 3 até 6 vezes com 3% de juros ao mês");
		System.out.println("4 - Sair ");
		System.out.print("Opção: ");
		Op=Entra.nextInt();
		
		switch(Op) {
			case 1:
				
				Vista=Tgasto*0.9;
				System.out.printf("Valor à Vista:"+ Vista);
			break;
			
			case 2:
				
				Par2x=Tgasto/2;
				System.out.printf("Valor de cada parcela de 2x é: " + Par2x);
				 
			break;
			case 3:
				
				System.out.println("1- Parcelado de 3x");
				System.out.println("2- Parcelado de 4x");
				System.out.println("3- Parcelado de 5x");
				System.out.println("4- Parcelado de 6x");
				System.out.println();
				Op1=Entra.nextInt();
				
				switch(Op1) {
				case 1:
					alt1=Tgasto*0.03;
					pg3x=(Tgasto+alt1)/3;
					System.out.printf("Valor de cada parcela de 3x é: " + pg3x);
					 
				break;
				case 2:
					alt1=Tgasto*0.03;
					pg3x=(Tgasto+alt1)/4;;
					System.out.printf("Valor de cada parcela de 4x é: " + pg3x);
					
				break;
				case 3:
					alt1=Tgasto*0.03;
					pg3x=(Tgasto+alt1)/5;;
					System.out.printf("Valor de cada parcela de 5x é: " + pg3x);
					
				break;
				case 4:
					alt1=Tgasto*0.03;
					pg3x=(Tgasto+alt1)/6;;
					System.out.printf("Valor de cada parcela de 6x é: " + pg3x);
					 
				break;
					
				default:
	      			System.out.println("Opção Invalido");
	    	  	
	      		break;
				}
				
			break;
			case 4:
				System.out.println("Sair");
				 
			break;
			
			default:
      			System.out.println("Opção Invalido");
    	  	
      			break;
			} 
		} while (Tgasto!=-1);
	}

}