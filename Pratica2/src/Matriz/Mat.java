package Matriz;

public class Mat {

	public static void main(String[] args) {
		int[][] matriz =new int[50][50];
		
		int impar=1;
		for(int linha=0;linha<50;linha++){
			for(int coluna=0;coluna<50;coluna++) {
				matriz[linha][coluna]=impar;
				if(linha == coluna) {
					System.out.printf("%d\t", matriz[linha][coluna]);
				}	
				else
					System.out.printf("0\t");
				impar+=2;
				
			}
			System.out.printf("\n");
		}
	}

}
