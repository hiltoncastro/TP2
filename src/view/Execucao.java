package view;

import model.Pessoa;

public class Execucao {
	
	public static void main(String[] args) 
	{
        // TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Hilton Pereira de Castro Junior");
		pessoa.setEndereco("Rua Jose Garcia Terra 209");
		pessoa.setBairro("Jardim Lisboa");
		pessoa.setCep("03675-000");
		pessoa.setCidade("Sao Paulo");
		pessoa.setEstado("Sao Paulo");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getBairro());
		System.out.println(pessoa.getCep());
		System.out.println(pessoa.getCidade());
		System.out.println(pessoa.getEstado());
	}
}
		