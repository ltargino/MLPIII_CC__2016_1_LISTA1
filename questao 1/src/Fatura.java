public class Fatura {
	private String numero;
	private String descricao;
	private int qtdItem;
	private double precoItem;

	public Fatura(String numero, String descricao, int qtdItem, double valorItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.qtdItem = qtdItem;
		this.precoItem = valorItem;
	}

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getqtdItem() {
		return qtdItem;
	}
	
	public void setqtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}
	
	public double getprecoItem() {
		return precoItem;
	}
	
	public void setprecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	
	public double getValorFatura(){
		double valorFatura = 0;
		
		if (precoItem < 0){
			precoItem = 0;
		}

		valorFatura = precoItem * qtdItem;

		if (valorFatura < 0){
			valorFatura = 0;
		}
		
		return valorFatura;
	}
	
}