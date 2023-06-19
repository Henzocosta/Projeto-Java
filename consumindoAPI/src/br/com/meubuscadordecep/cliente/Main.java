package br.com.meubuscadordecep.cliente;

import br.com.meubuscadordecep.dominio.Endereco;
import br.com.meubuscadordecep.viacep.ServicoDoCep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.print("Infome seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoDoCep.buscaEnderecoPelo(cep);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());


    }
}
