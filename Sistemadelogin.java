import java.util.Scanner;

public class Sistemadelogin {
    
    public static void main(String[] args) {
        
        String loginCorreto = "java8";              //Login e senha definidos
        String senhaCorreta = "java8";

                                                    // Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

                                                    // Variáveis para armazenar as tentativas
        int tentativas = 3;
        boolean loginValido = false;

                                                    // Loop de tentativas
        while (tentativas > 0) {
                                                    // Solicitar login e senha
            System.out.print("Digite o login: ");
            String login = scanner.nextLine();
            
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

                                                    // Verificar se o login e a senha estão corretos
            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                loginValido = true;
                break;                              // Sai do loop se o login for válido
            } else {
                                                     // Se os dados estiverem errados, diminuir o número de tentativas
                tentativas--;
                System.out.println("Login ou senha incorretos! Você tem " + tentativas + " tentativa(s) restante(s).");
            }
        }

                                                    // Mensagem final
        if (loginValido) {
            System.out.println("Acesso permitido! Bem-vindo ao sistema.");
        } else {
            System.out.println("Número de tentativas excedido. Acesso bloqueado.");
        }

                                                    // Fechar o scanner
        scanner.close();
    }
}
