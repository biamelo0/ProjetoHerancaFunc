package HerançaProdu;

public class Principal {

	public static void main(String[] args) {
		
		Produto Produto = new Produto(34245, "camisa",3432);
		System.out.println("Produto:");
		System.out.println("Id : " + Produto.getId());
		System.out.println("Nome : " + Produto.getNome());
		System.out.println("Telefone"+ Produto.getPreco());
		
		Sorvete Sorvete = new Sorvete(34245, "camisa",3432,320);
		System.out.println("Sorvete:");
		System.out.println("Id : " + Sorvete.getId());
		System.out.println("Nome : " + Sorvete.getNome());
		System.out.println("Telefone"+ Sorvete.getPreco());
		System.out.println("tempAdequada"+ Sorvete.getPreco());
		
		Camisa Camisa = new Camisa(34245, "camisa",3432,"azul","algodao","22.22");
		System.out.println("Camisa:");
		System.out.println("Id : " + Camisa.getId());
		System.out.println("Nome : " + Camisa.getNome());
		System.out.println("Telefone"+ Camisa.getPreco());
		System.out.println("Cor : " + Camisa.getCor());
		System.out.println("Tecido: "+ Camisa.getTecido());
		System.out.println("Tamanho: "+ Camisa.getTamanho());
		
		
		

	}

}
