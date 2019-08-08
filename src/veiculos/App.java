package veiculos;

import java.util.Scanner;

public class App extends veiculo{

	private static final String String = null;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Montando o veiculo: ");
		
		System.out.println("");
		System.out.println("Seu veiculo é um: ");
		System.out.println("1 - Carro");
		System.out.println("2 - Moto");
		System.out.println("3 - Caminhão");
		
		System.out.println("");
		System.out.print("Digite o número correspondente ao teu veiculo: ");
		int vei = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Qual a marca do veiculo: ");
		String m = sc.nextLine();
		System.out.print("Qual o modelo do veiculo: ");
		String mo = sc.nextLine();
		System.out.print("Qual a cor do veiculo: ");
		String c = sc.nextLine();
		System.out.print("Qual tipo de combústivel utiliza seu veiculo (Gasolina/Etanol/Diesel): ");
		String co = sc.nextLine();
		System.out.print("Qual a quantidade do tanque de combustivel do seu veiculo: ");
		int qtd = sc.nextInt();
		
		Carro car1 = new Carro(m, mo, c, qtd, co);
		
		System.out.println(car1.getTanque());
		
		veiculo v1 = new veiculo();

		System.out.println("Marca: " + car1.getMarca());
		System.out.println("Modelo: " + car1.getModelo());
		System.out.println("Cor: " + car1.getCor());
		System.out.println("Combustivel: " + car1.getCombus());
		System.out.println("Qtd do tanque: " + car1.getQtdTanque() + "L");
		
		System.out.println("");
		System.out.println("Agora com o carro criado, qual será a sua ação: ");
		System.out.println("1 - Ligar o veiculo");
		System.out.println("2 - Desligar o veiculo");
		System.out.println("3 - Acelerar o veiculo");
		System.out.println("4 - Abastecer o veiculo");
		System.out.println("5 - Trocar o Pneu");
		System.out.println("6 - Sair");
		
		System.out.print("Digite o número da ação desejada: ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			
		}
		
		
		
		sc.close();
	}

}
