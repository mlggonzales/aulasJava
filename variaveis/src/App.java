// Classe precisa ter o mesmo nome do arquivo
public class App {

    // Toda classe precisa de um main, que é o ponto de partida para executar o código (primeiro método)
    public static void main(String[] args) throws Exception {
        // Tipos de variáveis:

        // 1. Inteiros: 
        //   a. byte (-128 até 127)
        byte numeroByte = 2;
        //   b. short (-32768 até 32767)
        short numeroShort = 2000;
        //   c. int (-2147483648 até 2147483647)
        int numeroInt = 40000;
        //   d. long (-9223372036854775808 até 9223372036854775807)
        long numeroLong = 9223372036854775807l; //obs: deve acrescentar l no final do número  

        // 2. Ponto Flutuante (valores com casas decimais):
        //   a. float 
        float numeroFloat = 70.7f; // obs: deve acrescentar f no final do número 
        //   b. double (muitas casas depois da virgula, não precisa do f no final)
        double numeroDouble = 3.14161920839484293134883243;

        // 3. Caractere (salva apenas 1 caractere - letras, -, *, $, etc - deve estar entre '')
        char valorChar = '$';
        char valorCharDois = 'A';

        // 4. Boleano (true or false)
        boolean valorBoolean = true;

        // 5. String (será um objeto, deve estar entre "")
        String valorString = "Maria Luiza";

        // Maneiras de printar as variáveis no terminal (concatenação)
        System.out.println("A " + valorString + " tem " + numeroFloat + " e nasceu em " + numeroShort);
        System.out.format("A %s tem %f e nasceu em %s.\n", valorString, numeroFloat, numeroShort); //obs: o format nao pula uma linha automaticamente, deve colocar \n para pular.
        String texto1 = "A " + valorString + " tem " + numeroFloat + " e nasceu em " + numeroShort;
        String texto2 = String.format("A %s tem %f e nasceu em %s.", valorString, numeroFloat, numeroShort);
        System.out.println(texto1);
        System.out.println(texto2);

        //Executar mensagem na forma de erro:
        System.err.println(valorString);
    }
}
