import java.util.Collections;
import java.util.Scanner;

public class LojaVirtual {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do Limite: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.println("Descriçāo do Produto: ");
            String descricao = leitura.next();

            System.out.println("Valor da Compra: ");
            Double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if(compraRealizada){
                System.out.println("Compra Realizada com Sucesso!");
                System.out.println("Para sair digite 0 ou 1 para continuar comprando");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                   break;
            }
        }

        System.out.println("********************");
        System.out.println("COMPRAS REALIZADAS: \n ");

        Collections.sort(cartao.getCompras());

        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("******************** \n");

        System.out.println("Saldo do Cartāo: " + cartao.getSaldo());

    }
}
