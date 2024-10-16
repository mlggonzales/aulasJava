public class App {
    public static void main(String[] args) throws Exception {
        
        int i = 1;
        int j = 1;

        // Estrutura de repetição: while -> verifica condição e executa
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
        
        // Estrutura de repetição: do while -> executa e depois verifica a condição
        do {
            System.out.println(j);
            j++;
        } while(j <= 3);

        // Estrutura de repetição: for -> condições ficam entre (condInicial; condDeParada; passo)
        for (int k = 1; k <= 3; k++) {
            System.out.println(k);
        }
    }
}
