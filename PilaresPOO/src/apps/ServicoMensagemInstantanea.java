package apps;

//a classe MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {
	// A classe abstract, tem metodo abstratos e nao se tem um corpo, logo elas se encerram com um ";"
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	// Esse metodo protected somento os filhos e classe do mesmo pacote podem acessar
	protected void validarConectandoInternet() {
		System.out.println("Validando Conexao a Internet");
	}
	}
