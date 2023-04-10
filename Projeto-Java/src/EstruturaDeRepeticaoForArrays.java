public class EstruturaDeRepeticaoForArrays {
    public static void main(String[] args) {
       
       // Em Array o indice inicia em 0
        String alunos[] = {"Henzo" ,"Isac", "Esmeralda"};

            for(int x=0; x<alunos.length; x++){
                System.out.println("O aluno no indice X=" + x + " é " + alunos[x]);
            }

            System.out.println();
            // Forma abreviada de se usar o for.

            for(String aluno : alunos){
                System.out.println("Nome do Aluno é: " + aluno);
            }

            System.out.println();
            // break e continue 

            // O comando break ele significa "parar", logo ele interrompe o laço 
            // O comando continue ele significa "continuar", logo ele interrompe somente a interacao atual

            // exemplo break abaixo

            for(int numero=1; numero <=5; numero++){
                if(numero==3){
                    break;
                }
                
                System.out.println(numero);
            }
            System.out.println();

            // exemplo continue abaixo

            for(int numero=1; numero <=5; numero++){
                if(numero==3){
                    continue;
                }
                
                System.out.println(numero);
            }
    }   
}
