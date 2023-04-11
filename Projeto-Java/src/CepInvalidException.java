

public class CepInvalidException extends Exception {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("65173040");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            // TODO Auto-generated catch block
            System.out.println("O Cep nao corresponde as regras de negocio!");
        }
    }


    static String formatarCep(String cep) throws CepInvalidException{
        if(cep.length() !=8){
           
            throw new CepInvalidException();
        }
            //Simulando um cep formatado
            return "65.173-040";  
    }     
        
}
