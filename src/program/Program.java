package program;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int n, seqn, cont = 0;
		
		System.out.print("insira de qual numero você quer contar os multiplos: ");
		n = entrada.nextInt();
		
		System.out.print("Informe quantos numeros tem na sequência que você quer contar: ");
		seqn = entrada.nextInt();
		
		int sequencia[] = new int[seqn];
		
		for (int i = 0; i<sequencia.length ; i++) {
			System.out.print("Insira o "+(i+1)+" numero da sua sequência: ");
			sequencia[i] = entrada.nextInt();
		}
		
		int termosmp [] = new int [seqn];
		
		for (int i = 0; i<sequencia.length ; i++) {
			if (sequencia[i]%n == 0) {
				cont++;
				termosmp[i] = sequencia[i];
			}
		}
		
				
		
		System.out.println("A sua sequencia possui "+cont+" número(s) multiplos de "+n+" .");
		System.out.print("Sendo ele(s):");
		for (int i= 0; i<sequencia.length; i++) {
			if(termosmp[i] != 0) {
			System.out.print(" "+termosmp[i]);
			}
		}
	}

}