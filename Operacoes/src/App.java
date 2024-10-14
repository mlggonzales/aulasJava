import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // Deixa o usuário dizer o número
        String numeroAString = JOptionPane.showInputDialog(null, "Escolha um número:");
        int numeroA = Integer.parseInt(numeroAString);
        String numeroBString = JOptionPane.showInputDialog(null, "Escolha outro número:");
        int numeroB = Integer.parseInt(numeroBString);

        // Soma
        int resultadoSoma = numeroA + numeroB; 
        //Subtracao
        int resultadoSubtracao = numeroA - numeroB;
        // Multiplicação
        int resultadoMultiplicacao = numeroA * numeroB; 
        // Divisao (troca o tipo de variavel por ser divisao nao exata e adiciona (double) depois do =)
        double resultadoDivisao = (double) numeroA / numeroB; 
        //Resto da divisão
        int resultadoResto = numeroA % numeroB; 
 
        // Imprimir todos os valores em uma mesma tela:
        JOptionPane.showMessageDialog(null, "Os número digitados foram: " + numeroA + " e " + numeroB + ".\n" + 
        "A soma entre eles é: " + resultadoSoma + ".\n" + "A subtração entre eles é: " + resultadoSubtracao + ".\n" + 
        "A multiplicacao entre eles é: " + resultadoMultiplicacao + ".\n" + "A divisão entre eles é: " + resultadoDivisao + ".\n" +
        "O resto da divisão entre eles é: " + resultadoResto + ".\n"
        );

        //Incremento
        int contador = 0;
        contador++; // É igual a contador = contador + 1;
        //JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador--; // É igual a contador = contador - 1;
        //JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador += 8; // É igual a contador = contador + 8;
        //JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador -= 8; // É igual a contador = contador - 8;
        //JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        // Todos os operadores funcionam, não apenas o + e -
        
        // Funções matemáticas da classe math
        // Deixa o usuário dizer o número
        String numeroCString = JOptionPane.showInputDialog(null, "Escolha um número negativo:");
        int numeroC = Integer.parseInt(numeroCString);
        String numeroDString = JOptionPane.showInputDialog(null, "Escolha um número positivo:");
        int numeroD = Integer.parseInt(numeroDString);

        // Número Absoluto
        int resultadoAbs = Math.abs(numeroC);
        //JOptionPane.showMessageDialog(null, resultadoAbs);
        
        // Potência
        int resultadoPow = (int) Math.pow(numeroC,numeroD);
        //JOptionPane.showMessageDialog(null, resultadoPow);

        // Raíz quadrada
        double resultadoSqrt = (double) Math.sqrt(numeroD);
        //JOptionPane.showMessageDialog(null, resultadoSqrt);

        // Arredondar para cima
        double resultadoArrCima = Math.ceil(resultadoSqrt);
        //JOptionPane.showMessageDialog(null, resultadoArrCima);

        // Arredondar para baixo
        double resultadoArrBaixo = Math.floor(resultadoSqrt);
        //JOptionPane.showMessageDialog(null, resultadoArrBaixo);

        // Valor mínimo
        double resultadoMin = Math.min(numeroC,numeroD);
        //JOptionPane.showMessageDialog(null, resultadoMin);

        // Valor máximo
        double resultadoMax = Math.max(numeroC,numeroD);
        //JOptionPane.showMessageDialog(null, resultadoMax);

        // Imprimir todos os valores em uma mesma tela:
        JOptionPane.showMessageDialog(null, "Os número digitados foram: " + numeroC + " e " + numeroD + ".\n" + 
        "O absoluto do primeiro número digitado é: " + resultadoAbs + ".\n" + 
        "O primeiro número digitado elevado à potência do segundo número é: " + resultadoPow + ".\n" + 
        "A raiz quadrada do segundo número é: " + resultadoSqrt + ".\n" + 
        "A raiz do segundo número arredondada para cima é: " + resultadoArrCima + ".\n" + 
        "A raiz do segundo número arredondada para baixo é: " + resultadoArrBaixo + ".\n" +
        "O menor número entre eles é: " + resultadoMin + ".\n" + 
        "O maior número entre eles é: " + resultadoMax + ".\n"
        );

    }
}
