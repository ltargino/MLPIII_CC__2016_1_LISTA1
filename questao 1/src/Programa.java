import java.util.Scanner;

public class Programa {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Fatura faturateste = new Fatura("1","fatura de teste",0,0);

		System.out.println("Fatura atual:"+faturateste.getValorFatura());

		System.out.println("Quantidade:");
		faturateste.setqtdItem(scan.nextInt());
		System.out.println("Valor:");
		faturateste.setprecoItem(scan.nextDouble());

		//System.out.println("Fatura atual:"+faturateste.getValorFatura());
	}
}