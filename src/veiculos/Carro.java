package veiculos;

import java.util.Scanner;

public class Carro extends veiculo implements IVeiculos {
	
	Scanner sc = new Scanner(System.in);

	private int Tanque = getQtdTanque();
	private Double kmPneu;
	
	public Carro(int tanque, Double kmPneu) {
		Tanque = tanque;
		this.kmPneu = kmPneu;
	}

	public int getTanque() {
		return Tanque;
	}

	public void setTanque(int tanque) {
		Tanque = tanque;
	}

	public Double getKmPneu() {
		return kmPneu;
	}

	public void setKmPneu(Double kmPneu) {
		this.kmPneu = kmPneu;
	}

	public Carro(String marca, String modelo, String cor, int qtdTanque, String combus) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.QtdTanque = qtdTanque;
		this.combus = combus;
		this.status = false;
	}
	
	@Override
	public void Ligar() {
		if (getStatus() == true) {
			System.out.println("O carro já está ligado!");
		} else {
			System.out.println("Carro Ligado!");
			setStatus(true);
		}
	}
	@Override
	public void Desligar() {
		if(getStatus() == false) {
			System.out.println("O carro já está desligado!");
		} else {
			System.out.println("Carro desligado!");
			setStatus(false);
		}
		
	}
	@Override
	public void Abastecer() {
		if (getTanque() >= getQtdTanque()) {
			System.out.println("O tanque já está cheio!");
		} else {
			System.out.print("Qual combustivel deseja colocar: (Gasolina/Etanol/Diesel)");
			String comb = sc.next();
			if (!comb.equals(getCombus())) {
				System.out.println("Esse carro não aceita o combustivel desejavel!");
				Abastecer();
			} else {
				AbastecerCombustivel(comb);
			}
		}
	}
	
	public void AbastecerCombustivel(String comb) {
			System.out.print("Quantos Litros deseja colocar: ");
			int lts = sc.nextInt();
			if(lts + Tanque >= getQtdTanque()) {
				System.out.println("O combustivel está a mais do que a quantidade que o Tanque aguenta, deseja continuar? (S/N)");
				String s = sc.next();
				if(s.equals("s")) {
					System.out.println("Você derramou combustivel no seu carro, Parabens!");
				} else {
					System.out.println("Seu tanque tem espaço apenas para " + (getQtdTanque()) + "Lts");
					System.out.println("Deseja abastecer novamente: (S/N)");
					s = sc.next();
					if(s.equals("s")) {
						AbastecerCombustivel(comb);
					}
				}
			}
	}
	
	@Override
	public void TrocarPneu() {
		System.out.println("Qual e a Kilometragem que percorreu com esses pneus? ");
		kmPneu = sc.nextDouble();
		if(kmPneu <= 35000) {
			System.out.println("Ainda não e necessario realizar a troca do Pneu, porém mesmo assim deseja trocar? (S/N)");
			String trocar = sc.next();
			if (trocar == "N" || trocar == "n") {
				System.out.println("Ok, muito obrigado, qualquer problema, iremos ajudar!!");
			}
		} else {
			System.out.println("Ok, é necessario realizar a troca do Pneu, o mesmo está muito gasto!");
			kmPneu = 0.0;
		}
	}
	@Override
	public void Acelerar() {
		
		if(getStatus() == false) {
			System.out.println("Não e possivel acelerar por conta do veiculo está desligado!");
		} else if (this.Tanque <= 0) {
			System.out.println("Não e possivel acelerar, por conta que não tem " + getCombus() + " no seu veiculo");
		} else if (getStatus() == true && this.Tanque > 0) {
			System.out.println("O veiculo está andando!");
			System.out.println("Você andou 10Km");
			System.out.println("Seu combustivel está " + (this.Tanque - 10) + "Lts");
		}
		
	}	
}
