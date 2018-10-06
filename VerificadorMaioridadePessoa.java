
public class VerificadorMaioridadePessoa implements VerificadorMaioridade {

	public boolean ehMaiorDeIdade(Pessoa p) {
		return p.getIdade() >= 18;
	}
}