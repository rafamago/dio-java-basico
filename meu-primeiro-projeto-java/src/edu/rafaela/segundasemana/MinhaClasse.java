

public class MinhaClasse {

    public static void main(String[] args){
        String primeiroNome = "Rafaela";
        String segundoNome = "Maria";
        
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resuldado do método" +  primeiroNome.concat(" ").concat(segundoNome);
 
    }
}