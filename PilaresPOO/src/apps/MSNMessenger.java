package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
	
	@Override
	public void enviarMensagem() {
		validarConectandoInternet();
		System.out.println("Envia mensagem pelo MSN");
	}
	@Override
	public void receberMensagem() {
		System.out.println("Recebe mensagem pelo MSN");
	}
}
