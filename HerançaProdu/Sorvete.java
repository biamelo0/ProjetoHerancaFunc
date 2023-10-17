package HerançaProdu;

public class Sorvete extends Produto{
	private double tempAdequeada;

	public Sorvete(long id, String nome, double preco, double tempAdequeada) {
		super(id, nome, preco);
		this.tempAdequeada = tempAdequeada;
	}

	public double getTempAdequeada() {
		return tempAdequeada;
	}

	public void setTempAdequeada(double tempAdequeada) {
		this.tempAdequeada = tempAdequeada;
	}
	
	

}
