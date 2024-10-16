public class App {
    public static void main(String[] args) throws Exception {

        // Operadores relacionais:
        // >=
        // <=
        // ==
        // != 

        // Operadores lógicos (tabela verdade):
        // && and (e)  
        // || or (ou)
        // ! not (negação, não)

        // Exemplo:

        String usuario = "mlgg1"; 
        String senha = "1234567"; 


        String usuarioCorreto = "mlgg";
        String senhaCorreta = "12345";

        boolean login = (usuarioCorreto==usuario) || (senhaCorreta==senha); 
        System.out.println(login);

    }
}
