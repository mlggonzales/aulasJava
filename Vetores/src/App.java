import java.util.Arrays;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Vetores = Array -> Armazena vários valores do MESMO TIPO
        // tipo[] nomeVariavel = new tipo[tamanho] 
        // obs: arrays começam em 0
        String[] nomes = new String[5];
        // Preenchendo o vetor:
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "José";
        nomes[3] = "Carla";
        nomes[4] = "Luis";

        // Imprimindo os nomes:
        for (int i = 0; i < 5; i++) {
            //System.out.print(nomes[i] + " ");
        }
        
        // Preenchendo o vetor ao iniciar o array
        String[] nomes1 = new String[]{
            "João", "Maria", "José", "Carla", "Luis"
        };
        for (int j = 0; j < 5; j++) {
            //System.out.print(nomes1[j] + " ");
        }

        // Array tipo int 
        int[] numeros = new int[100];
        for (int k=0; k<numeros.length; k++) { // começa em 0 pq é a primeira posição de um vetor
            numeros[k] = k;
            //System.out.println(numeros[k]);
        }

        // Como descobrir tamanho do vetor
        //System.out.println(numeros.length);

        // Preenchendo utilizando uma classe (Arrays) e método (fill)
        Arrays.fill(numeros, 0); // Preenche o vetor inteiro com o número 0
        //System.out.println(Arrays.toString(numeros)); //Imprime todo o vetor em forma de string
        
        // Exemplo: *******
        String[] opcoes = new String[]{
            "Jogo LoL", 
            "Série GoT",
            "Filme Vingadores",
            "Sair"
        };

        int opcaoEscolhida = 0;

        while (opcaoEscolhida != 3) {
            opcaoEscolhida = JOptionPane.showOptionDialog(null, "O que você deseja assistir?", "DevFlix", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, 0);
            System.out.println("Opção escolhida: " + opcaoEscolhida);
        
            if (opcaoEscolhida != 3){
                String mensagem = "Você assistiu " + opcoes[opcaoEscolhida];
                JOptionPane.showMessageDialog(null, mensagem);
            }
    
        }
        
    }
}
