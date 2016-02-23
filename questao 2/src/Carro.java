public class Carro {
	private String cor;
	private String modelo;
	private int vAtual;
	private int vMaxima;

	public Carro(String cor, String modelo, int velocidadeAtual, int velocidadeMaxima) {
		this.cor = cor;
		this.modelo = modelo;
		this.vAtual = velocidadeAtual;
		this.vMaxima = velocidadeMaxima;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getVelocidadeAtual() {
		return vAtual;
	}
	
	public void setVelocidadeAtual(int vAtual) {
		this.vAtual = vAtual;
	}
	
	public int getVelocidadeMaxima() {
		return vMaxima;
	}
	
	public void setVelocidadeMaxima(int vMaxima) {
		this.vMaxima = vMaxima;
	}

	public void ligar(){
		System.out.println("carro ligado");
	}
	
	public void acelerar(int vAceleracao){
		vAtual = vAtual + vAceleracao;

		if (vAtual > vMaxima){
			System.out.println("Velocidade atual ultrapassou a máxima.");
		}
	}
}