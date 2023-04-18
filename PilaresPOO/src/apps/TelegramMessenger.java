package apps;

public class TelegramMessenger extends ServicoMensagemInstantanea{
	
	@Override
	public void enviarMensagem() {
		validarConectandoInternet();
		System.out.println("Envia mensagem pelo Telegram");
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebe mensagem pelo Telegram");
	}
	
}
