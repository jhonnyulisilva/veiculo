package veiculos;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class App extends veiculo{

	private static final String String = null;

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		ModelandoCarro mc = new ModelandoCarro();
		ModelandoMoto mm = new ModelandoMoto();
		ModelandoCaminhao mc1 = new ModelandoCaminhao();
		
		System.out.println("Montando o veiculo: ");

		System.out.println("");
		System.out.println("Seu veiculo é um: ");
		System.out.println("1 - Carro");
		System.out.println("2 - Moto");
		System.out.println("3 - Caminhão");

		System.out.println("");
		System.out.print("Digite o número correspondente ao teu veiculo: ");
		int vei = sc.nextInt();
		
		Carro car1 = new Carro();
		Moto mt1 = new Moto();
		Caminhao c1 = new Caminhao();
		
		switch(vei) {
		case 1:
			mc.ModelandoC();
			break;
		case 2:
			mm.ModelandoM();	
			break;
		case 3:
			mc1.ModelandoCa();
			break;
		}
		
			

		boolean acao = true;
		boolean t = true;
		car1.setTanque(getQtdTanque());
		mt1.setTanque(getQtdTanque());
		c1.setTanque(getQtdTanque());
		do {
			
			System.out.println("");
			if (t == true) {
				System.out.println("Agora com o veiculo criado, qual será a sua ação: ");
				Thread.sleep(1000);
				t = false;
			}
			System.out.println("1 - Ligar o veiculo");
			System.out.println("2 - Desligar o veiculo");
			System.out.println("3 - Acelerar o veiculo");
			System.out.println("4 - Abastecer o veiculo");
			System.out.println("5 - Trocar o Pneu");
			System.out.println("6 - Sair");
			
			System.out.print("Digite o número da ação desejada: ");
			int a = sc.nextInt();
			System.out.println("");
			
			if(vei == 1) {
				switch(a) {
				case 1:
					try{
						car1.Ligar();
						Thread.sleep(2000); 
						}catch(Exception ex){
							
						}
					break;
				case 2:
					try{
						car1.Desligar();
						Thread.sleep(2000); 
						}catch(Exception ex){
							
						}
					break;
				case 3:
					try{
						car1.Acelerar();
						Thread.sleep(2000);
						}catch(Exception ex){
							
						}
					break;
				case 4:
					try{
						car1.Abastecer();
						Thread.sleep(2000);
						}catch(Exception ex){
							
						}
					break;
				case 5:
					try{
						car1.TrocarPneu();
						Thread.sleep(2000);
						}catch(Exception ex){
							
						}
					break;
				default:
					System.out.println("Agradecemos e tenha um otimo dia!");
					acao = false;
					break;
					
				}
			} else if (vei == 2) {
				switch(a) {
				case 1:
					try{
						mt1.Ligar();
						Thread.sleep(2000); 
						}catch(Exception ex){
							
						}
					break;
				case 2:
					try{
						mt1.Desligar();
						Thread.sleep(2000); 
						}catch(Exception ex){
							
						}
					break;
				case 3:
					try{
						mt1.Acelerar();
						Thread.sleep(2000);
						}catch(Exception ex){
							
						}
					break;
				case 4:
					try{
						mt1.Abastecer();
						Thread.sleep(2000);
						}catch(Exception ex){
							
						}
					break;
				case 5:
					try{
						mt1.TrocarPneu();
						Thread.sleep(2000);
						}catch(Exception ex){
							
						}
					break;
				default:
					System.out.println("Agradecemos e tenha um otimo dia!");
					acao = false;
					break;
					
				}
			} else if (vei == 3) {
				switch(a) {
				case 1:
					try{
						c1.Ligar();
						Thread.sleep(2000); 
						}catch(Exception ex){
							
						}
					break;
				case 2:
					try{
						c1.Desligar();
						Thread.sleep(2000); 
						}catch(Exception ex){
							
						}
					break;
				case 3:
					try{
						c1.Acelerar();
						Thread.sleep(2000);
						}catch(Exception ex){
							
						}
					break;
				case 4:
					try{
						c1.Abastecer();
						Thread.sleep(2000);
						}catch(Exception ex){
							
						}
					break;
				case 5:
					try{
						c1.TrocarPneu();
						Thread.sleep(2000);
						}catch(Exception ex){
							
						}
					break;
				default:
					System.out.println("Agradecemos e tenha um otimo dia!");
					acao = false;
					break;
					
				}				
			} else {
				System.out.println("Valor invalido!");
			}
			
		} while (acao == true);
		
		sc.close();
	}

}
