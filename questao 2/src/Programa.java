import java.util.Scanner;

public class Programa {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Carro carro1 = new Carro("chumbo","versa",0,300);
		
		carro1.ligar();

		System.out.print("acelerada velocidade: ");
		carro1.acelerar(scan.nextInt());
		
		System.out.println("velocidade atual:" + carro1.getVelocidadeAtual());
	}
}