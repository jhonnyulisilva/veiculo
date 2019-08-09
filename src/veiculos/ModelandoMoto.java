package veiculos;

import java.util.Scanner;

public class ModelandoMoto {

	public void ModelandoM() {

		Scanner sc = new Scanner(System.in);

		System.out.println("");
		System.out.print("Qual a marca da Moto: ");
		String m = sc.nextLine();
		m = m.toUpperCase();
		System.out.print("Qual o modelo da Moto: ");
		String mo = sc.nextLine();
		mo = mo.toUpperCase();
		System.out.print("Qual a cor da Moto: ");
		String c = sc.nextLine();
		c = c.toUpperCase();
		System.out.print("Qual tipo de combústivel utiliza sua Moto (Gasolina/Etanol/Diesel): ");
		String co = sc.nextLine();
		co = co.toUpperCase();
		System.out.print("Qual a quantidade de litros de combustivel da sua Moto: ");
		int qtd = sc.nextInt();

		Moto m1 = new Moto(m, mo, c, qtd, co);
		
		System.out.println("");
		System.out.println("Marca: " + m1.getMarca());
		System.out.println("Modelo: " + m1.getModelo());
		System.out.println("Cor: " + m1.getCor());
		System.out.println("Combustivel: " + m1.getCombus());
		System.out.println("Qtd do tanque: " + m1.getQtdTanque() + "L");

	}

}
