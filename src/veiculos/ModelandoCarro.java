package veiculos;

import java.util.Scanner;

public class ModelandoCarro {

	public void ModelandoC() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("");
		System.out.print("Qual a marca do Carro: ");
		String m = sc.nextLine();
		m = m.toUpperCase();
		System.out.print("Qual o modelo do Carro: ");
		String mo = sc.nextLine();
		mo = mo.toUpperCase();
		System.out.print("Qual a cor do Carro: ");
		String c = sc.nextLine();
		c = c.toUpperCase();
		System.out.print("Qual tipo de combústivel utiliza seu Carro (Gasolina/Etanol/Diesel): ");
		String co = sc.nextLine();
		co = co.toUpperCase();
		System.out.print("Qual a quantidade de litros de combustivel do seu Carro: ");
		int qtd = sc.nextInt();
		
		Carro car1 = new Carro(m, mo, c, qtd, co);

		System.out.println("");
		System.out.println("Marca: " + car1.getMarca());
		System.out.println("Modelo: " + car1.getModelo());
		System.out.println("Cor: " + car1.getCor());
		System.out.println("Combustivel: " + car1.getCombus());
		System.out.println("Qtd do tanque: " + car1.getQtdTanque() + "L");
		
	}

}
