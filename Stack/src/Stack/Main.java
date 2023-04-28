package Stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<Carro> stackCarro = new Stack<>();
		
		// Em pilhas o metodo push e usada para adicao de objeto.
		stackCarro.push(new Carro("Golf"));
		stackCarro.push(new Carro("Celta"));
		stackCarro.push(new Carro("Vectra GTX"));
		System.out.println(stackCarro);
		
		System.out.println("----------");
		
		System.out.println(stackCarro.pop()); // Em pilhas o metodo pop e usado para,
		// remocao de objetos e etc.
		System.out.println(stackCarro);
		
		System.out.println("----------");
		
		System.out.println(stackCarro.peek()); // Em pilhas o metodo peek ele e usado
		// para pegar, mostrar o topo,  mas nao o retira o objeto da pilha.
		System.out.println(stackCarro);
		
		System.out.println("----------");
		
		System.out.println(stackCarro.empty()); // Em pilhas e todos os outros o medoto
		// isEmpty ou empty e usado para verificar se a pilha esta vazia.
		// OBS: empty usa o metodo boolean para lhe da o retorno.
		
		
	}
}
