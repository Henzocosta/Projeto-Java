package MSN;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMessenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		/*MSNMessenger msn = new MSNMessenger();
		System.out.println("MSN");
		
		msn.enviarMensagem();
		msn.receberMensagem();
			
		System.out.println("FACEBOOK");
		FacebookMessenger face = new FacebookMessenger();
		
		face.enviarMensagem();
		face.receberMensagem();
		
		System.out.println("TELEGRAM");
		TelegramMessenger telegram = new TelegramMessenger();
		
		telegram.enviarMensagem();
		telegram.receberMensagem();
		*/
		
	
		
		ServicoMensagemInstantanea smi = null;

		
		String appEscolhido = "Facebook";

		
		if(appEscolhido.equals("MSN")) { 
			smi = new MSNMessenger();
		} else if(appEscolhido.equals("Facebook")) {
			smi = new FacebookMessenger();
		} else if(appEscolhido.equals("Telegram")) {
			smi = new TelegramMessenger();
		}
		
		
		
		smi.enviarMensagem();
		smi.receberMensagem();
			

			
		
	}
}
