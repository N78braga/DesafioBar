package aplicacaoBar;

import java.util.Locale;
import java.util.Scanner;

import entitiesBar.Biil;

public class DesafioBar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Biil bar = new Biil();

		System.out.print("Sexo: ");
		bar.gender = (Character.toUpperCase(sc.next().charAt(0)));

		// loop de repetição para válidação do sexo.
		while (bar.gender != 'M' && bar.gender != 'F') {
			System.out.print("Sexo inválido! Favor digite um sexo válido: ");
			bar.gender = (Character.toUpperCase(sc.next().charAt(0)));
		}

		// scopu de atribição de quatitativos de consumo
		System.out.print("Quantidade de cervejas: ");
		bar.beer = sc.nextInt();

		System.out.print("Quantidades de refrigerantes: ");
		bar.softDrink = sc.nextInt();

		System.out.print("Quantidades de espetinhos: ");
		bar.barbecue = sc.nextInt();

		// condição do pagamento total.
		System.out.println("RELATÓTRIO:");
		if (bar.feeding() < 30.00) {
			System.out.printf("Consumo = R$ %.2f \n", bar.feeding());
			System.out.printf("Couvert = R$ %.2f \n", bar.cover());
			System.out.printf("Ingresso = R$ %.2f \n", bar.ticket());
			System.out.println("");
			System.out.printf("Total a pagar: R$ %.2f\n", bar.total());
		} else {
			System.out.printf("Consumo = R$ %.2f \n", bar.feeding());
			System.out.println("Isento de Couvert");
			System.out.printf("Ingresso = R$ %.2f \n", bar.ticket());
			System.out.println("");
			System.out.printf("Total a pagar: R$ %.2f\n", bar.total());

		}

		sc.close();

	}

}
