package HerançaFunc;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		
		Funcionario Funcionario = new Funcionario("Beatriz", "12345678", 20000, "99877383", "Rua dos bobos", "01/03/1998");
		System.out.println("Funcionario: ");
		System.out.println("Nome: " + Funcionario.getNome());
		System.out.println("Matricula: " + Funcionario.getMatricula());
		System.out.println("Salario: "+ Funcionario.getSalario());
		System.out.println("Telefone: "+ Funcionario.getTelefone());
		System.out.println("Endereço: " + Funcionario.getNome());
		System.out.println("Data de nascimento: "+ Funcionario.getTelefone());
		
		Administrador Administrador = new Administrador("Beatriz", "12345678",0, "122 123 234 22", "738399303","wiwijw", 8273839);
		System.out.println("Administrador: ");
		System.out.println("Nome: " + Administrador.getNome());
		System.out.println("Matricula: " + Administrador.getMatricula());
		System.out.println("Salario: "+ Administrador.getSalario());
		System.out.println("Telefone: "+ Administrador.getTelefone());
		System.out.println("Endereço: " + Administrador.getNome());
		System.out.println("Data de nascimento: "+ Administrador.getTelefone());
		System.out.println("Cra: "+ Administrador.getCra());
		
		Engenheiro Engenheiro = new Engenheiro("Beatriz", "12345678", 20000, "99877383", "Rua dos bobos", "01/03/1998",3889342);
		System.out.println("Engenheiro: ");
		System.out.println("Nome: " + Engenheiro.getNome());
		System.out.println("Matricula: " + Engenheiro.getMatricula());
		System.out.println("Salario: "+ Engenheiro.getSalario());
		System.out.println("Telefone: "+ Engenheiro.getTelefone());
		System.out.println("Endereço: " + Engenheiro.getNome());
		System.out.println("Data de nascimento: "+ Engenheiro.getTelefone());
		System.out.println("numCrea: "+ Engenheiro.getNumCrea());
		
		Medico Medico = new Medico("Beatriz", "12345678", 20000, "99877383", "Rua dos bobos", "01/03/1998",3889342);
		System.out.println("Medico: ");
		System.out.println("Nome: " + Medico.getNome());
		System.out.println("Matricula: " + Medico.getMatricula());
		System.out.println("Salario: "+ Medico.getSalario());
		System.out.println("Telefone: "+ Medico.getTelefone());
		System.out.println("Endereço: " + Medico.getNome());
		System.out.println("Data de nascimento: "+ Medico.getTelefone());
		System.out.println("numCrm: "+ Medico.getCrm());
		
		
		

	}

}
