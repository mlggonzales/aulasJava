import java.util.Random;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Mostra um número aleatório entre 0 e 1 
        double numero0e1 = Math.random();
        //JOptionPane.showMessageDialog(null, numero0e1);
    
        // Numero inteiro aleatório
        int numeroIntAle = 1 + (int) (Math.random() * 10); //Número aleatório entre 1 e 10
        //JOptionPane.showMessageDialog(null, numeroIntAle);

        // Usando a classe (objeto) Random
        Random gerador = new Random();
        int numero = gerador.nextInt(10) + 1; //Número aleatório entre 1 e 10
        //JOptionPane.showMessageDialog(null, numero);

        // Para testar o algoritmo e sempre gerar o mesmo número (seed)
        Random geradorNovo = new Random(6);
        int numeroNovo = geradorNovo.nextInt(10) + 1; //Número aleatório entre 1 e 10
        //JOptionPane.showMessageDialog(null, numeroNovo);

        //Exemplo
        Random geradorEx = new Random();
        int facesDado = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas faces tem o dado?"));
        int resultado = 1 + gerador.nextInt(facesDado);
        JOptionPane.showMessageDialog(null, "Você tirou o número " + resultado + " no dado.");
    }
}
