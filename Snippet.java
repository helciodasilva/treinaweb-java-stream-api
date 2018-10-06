
public class Snippet {
	
	private static void java7() {
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(22);
		VerificadorMaioridade verificador = new VerificadorMaioridadePessoa();
		boolean resultado = verificador.ehMaiorDeIdade(pessoa);
	}

	private static void java8() {
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(22);
		VerificadorMaioridade verificador = (Pessoa p) -> p.getIdade() >= 18;
		boolean resultado = verificador.ehMaiorDeIdade(pessoa);
	}

}
