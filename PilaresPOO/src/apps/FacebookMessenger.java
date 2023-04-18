package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectandoInternet();
		System.out.println("Envia mensagem pelo Facebook");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebe mensagem pelo Facebook");
		
	}
	
}

