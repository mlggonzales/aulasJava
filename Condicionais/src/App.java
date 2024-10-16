import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        boolean estaChovendo = false;
        boolean temGuardaChuva = true;
        
        // Condicional: if
        
        if (estaChovendo == true && temGuardaChuva == true) {
            System.out.println("Foi preparado");
        } else if (estaChovendo == true && temGuardaChuva == false){
            System.out.println("Está molhando");
        } else {
            System.out.println("Não está chovendo");
        }

        // Operador condicional ternário: (permite if e else em uma linha)
        String levaGuardaChuva = (estaChovendo == true)? "Leve um guarda chuva" : "Não leve um guarda chuva" ;
        System.out.println(levaGuardaChuva);
        // Operador é igual a:
        //if (estaChovendo == true) {
        //    System.out.println("Leve um guarda chuva");
        //} else{
        //    System.out.println("Não leve um guarda chuva");
        //}
        
        // Condicional: Switch Case
        switch (estaChovendo) {
            case true:
                System.out.println("Leve um guarda chuva");
                break;
            // caso tenha mais opções, adicionar mais:
            //case true:
            //    System.out.println("Leve um guarda chuva");
            //    break;
            default:
                System.out.println("Não leve um guarda chuva");
                break;
        } 

        // exemplo de uso sem o break:
        int diaDaSemana = 3;
        /*
            1 domingo e 1 sabado -> Final de Semana
            2, 3, 4, 5, 6 (segunda a sexta) -> Dia de Semana
         */
        switch (diaDaSemana) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de Semana");
                break;
        }
        
        // usando imagens:
        String personagem = JOptionPane.showInputDialog(null, "Digite um personagem do Dragon Ball:");
        String nomeImagem = " ";
        String origem = " ";

        switch (personagem) {
            case "Bulma":
                origem = "Planeta Terra";
                nomeImagem = "bulma-icone";
                break;
            case "Goku":
                origem = "Planeta Sayajin";
                nomeImagem = "goku-icone";
                break;
            case "Kuririn":
                origem = "Planeta Terra";
                nomeImagem = "kuririn-icone";
                break;
            case "Piccolo":
                origem = "Planeta Nomekusaijin";
                nomeImagem = "piccolo-icone";
                break;
            case "Vegeta":
                origem = "Planeta Sayajin";
                nomeImagem = "vegeta-icone";
                break;
        
            default:
                origem = "Desconhecida";
                nomeImagem = "default";
                break;
        }
        String caminhoImagem = String.format("C:/Users/Coord Facilities LON/VSCode JAVA/Aulas JAVA/Condicionais/src/Imagens/%s.png", nomeImagem);
        // objeto:
        ImageIcon icone = new ImageIcon(caminhoImagem);
        
        String informacoesPersonagem = String.format("Personagem: %s\n Origem: %s.", personagem, origem);
        JOptionPane.showConfirmDialog(null, informacoesPersonagem, "Descrição", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone);
    }
}
