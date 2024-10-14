import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Declarando variáries
        int numero;
        String jogo;
        String valor; // Variável criada pois não estava reconhecendo a linha jogo = leitor.nextLine();

        // Criando uma classe 
        Scanner leitor = new Scanner(System.in); //leitor das variáveis
        // Definindo que os separadores é: ';' ou \r ou \n
        leitor.useDelimiter("[;\r\n]+");

        // Aparece na tela para digitar o número 
        System.out.println("Digite um número:");
        numero = leitor.nextInt();
        System.out.println("Digite um jogo:");
        valor = leitor.nextLine();
        jogo = leitor.nextLine();
        System.out.println("O jogo é " + jogo + " e o número é " + numero);

        // Adendo: ao juntar uma string "2" com o numero 1, resulta em 21 e nao 3 pois é concatenação
        // Para converter uma String em um inteiro faça:
        // int jogo = Integer.parseInt()

        // Para ler o valor usando uma interface gráfica
        String filme = JOptionPane.showInputDialog(null, "Qual seu filme favorito?", "Título", JOptionPane.QUESTION_MESSAGE);
        System.out.println("Meu filme favorito é: " + filme);
        // Sempre retorna string, para retornar outra variável:
        String teste = JOptionPane.showInputDialog(null, "Escolha um número");
        // Testando o valor teste como String
        teste = teste + 2;
        System.out.println(teste);
        // Testando o valor numeroteste (teste como int) 
        int numeroteste = Integer.parseInt(teste);
        numeroteste = numeroteste + 2;
        System.out.println(numeroteste);
        // Imprimir os valores teste e numeroteste em uma janela:
        JOptionPane.showMessageDialog(null, "O número como String é: " + teste + " e o número como Int é: " + numeroteste);
    }
}
