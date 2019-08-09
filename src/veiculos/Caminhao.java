package veiculos;

import java.util.Scanner;

public class Caminhao extends veiculo implements IVeiculos {
	
	Scanner sc = new Scanner(System.in);

	private int Tanque;
	private Double kmPneu;
	
	public Caminhao() {
		
	}
	
	public Caminhao(int tanque, Double kmPneu) {
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

	public Caminhao(String marca, String modelo, String cor, int qtdTanque, String combus) {
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
			System.out.println("O Caminhao j� est� ligado!");
		} else {
			System.out.println("Caminhao Ligado!");
			setStatus(true);
			setTanque(getQtdTanque());
		}
	}
	@Override
	public void Desligar() {
		if(getStatus() == false) {
			System.out.println("O Caminhao j� est� desligado!");
		} else {
			System.out.println("Caminhao desligado!");
			setStatus(false);
		}
		
	}
	@Override
	public void Abastecer() {
		if(getStatus() == true ) {
			System.out.println("O Caminh�o est� ligado, e necessario desligar para abastecer!");
		}else {
			if (getTanque() >= getQtdTanque()) {
				System.out.println("O tanque j� est� cheio!");
			} else {
				System.out.print("Qual combustivel deseja colocar: (Gasolina/Etanol/Diesel)");
				String comb = sc.next();
				comb = comb.toUpperCase();
				if (!comb.equals(getCombus())) {
					System.out.println("Esse Caminh�o n�o aceita o combustivel desejavel!");
					Abastecer();
				} else {
					AbastecerCombustivel(comb);
				}
			}
		}
	}
	
	public void AbastecerCombustivel(String comb) {
			System.out.print("Quantos Litros deseja colocar: ");
			int lts = sc.nextInt();
			if(lts + Tanque > getQtdTanque()) {
				System.out.println("O combustivel est� a mais do que a quantidade que o Tanque aguenta, deseja continuar? (S/N)");
				String s = sc.next();
				if(s.equals("s")) {
					System.out.println("Voc� derramou combustivel no seu Caminhao, Parabens!");
				} else {
					System.out.println("Seu tanque tem espa�o apenas para " + (getQtdTanque() - Tanque) + "Lts");
					System.out.println("Deseja abastecer novamente: (S/N)");
					s = sc.next();
					if(s.equals("s")) {
						AbastecerCombustivel(comb);
					}
				}
			} else {
				setTanque(Tanque + lts);
				System.out.println("Foi abastecido " + lts + "Lts de " + getCombus() + "em seu caminh�o!");
			}
	}
	
	@Override
	public void TrocarPneu() {
		System.out.println("Qual e a Kilometragem que percorreu com esses pneus? ");
		kmPneu = sc.nextDouble();
		if(kmPneu <= 35000) {
			System.out.println("Ainda n�o e necessario realizar a troca do Pneu, por�m mesmo assim deseja trocar?");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			System.out.println("");
			System.out.println("Digite o n�mero da a op��o desejada: ");
			int trocar = sc.nextInt();
			switch(trocar) {
			case 1: 
				System.out.println("Pneu Trocado com sucesso!");
				kmPneu = 0.0;
			default:
				System.out.println("Ok, muito obrigado, qualquer problema, iremos ajudar!!");
			}
			
		} else {
			System.out.println("Ok, � necessario realizar a troca do Pneu, o mesmo est� muito gasto!");
			System.out.println("Pneu trocado com sucesso!");
			kmPneu = 0.0;
		}
	}
	@Override
	public void Acelerar() {
		
		if(getStatus() == false) {
			System.out.println("N�o e possivel acelerar por conta do veiculo est� desligado!");
		} else if (this.Tanque <= 0) {
			System.out.println("N�o e possivel acelerar, por conta que n�o tem " + getCombus() + " no seu veiculo");
		} else if (getStatus() == true && this.Tanque > 0) {
			System.out.println("O veiculo est� andando!");
			System.out.println("Voc� andou 10Km");
			System.out.println("Seu combustivel est� " + (this.Tanque - 20) + "Lts");
			setTanque(Tanque - 20);
			kmPneu += 10;
		}
		
	}
}
