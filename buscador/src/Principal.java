import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultacep = new ConsultaCep();


        System.out.println("Digite seu CEP: ");
        var cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultacep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvarJson(novoEndereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }
    }
}
