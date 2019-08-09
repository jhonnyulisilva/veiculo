package veiculos;

public class veiculo {
	
	protected static String marca;
	protected static String modelo;
	protected static String cor;
	protected static int QtdTanque;
	protected static String combus;
	protected static boolean status;
	
	public veiculo() {
		
	}
	
	public veiculo(String marca, String modelo, String cor, int qtdTanque, String combus) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.QtdTanque = qtdTanque;
		this.combus = combus;
		this.status = false;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public static int getQtdTanque() {
		return QtdTanque;
	}

	public void setQtdTanque(int qtdTanque) {
		this.QtdTanque = qtdTanque;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCombus() {
		return combus;
	}

	public void setCombus(String combus) {
		this.combus = combus;
	}

}
