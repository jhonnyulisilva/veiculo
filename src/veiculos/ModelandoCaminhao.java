package veiculos;

import java.util.Scanner;

public class ModelandoCaminhao {

public void ModelandoCa() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("");
		System.out.print("Qual a marca do Caminh�o: ");
		String m = sc.nextLine();
		m = m.toUpperCase();
		System.out.print("Qual o modelo do Caminh�o: ");
		String mo = sc.nextLine();
		mo = mo.toUpperCase();
		System.out.print("Qual a cor do Caminh�o: ");
		String c = sc.nextLine();
		c = c.toUpperCase();
		System.out.print("Qual tipo de comb�stivel utiliza seu Caminh�o (Gasolina/Etanol/Diesel): ");
		String co = sc.nextLine();
		co = co.toUpperCase();
		System.out.print("Qual a quantidade de litros de combustivel do seu Caminh�o: ");
		int qtd = sc.nextInt();
		
		Caminhao c1 = new Caminhao(m, mo, c, qtd, co);

		System.out.println("");
		System.out.println("Marca: " + c1.getMarca());
		System.out.println("Modelo: " + c1.getModelo());
		System.out.println("Cor: " + c1.getCor());
		System.out.println("Combustivel: " + c1.getCombus());
		System.out.println("Qtd do tanque: " + c1.getQtdTanque() + "L");
		
	}
	
}
