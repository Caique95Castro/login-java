import java.util.Scanner;

public class Login{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        String log = "caique";
        String password = "12345";
        String login, senha;

        boolean taCerto = false;

        

       

        do{
            System.out.println("Digite o login: ");
            login = input.next();

            System.out.println("Digite a senha: ");
            senha = input.next();

            if(login.equalsIgnoreCase(log) && senha.equals(password)){
                System.out.println("Bem vindo ao sistema");
                taCerto = true;
            }else{
                System.out.println("Login ou senha estao incorretos. Tente novamente.");
            }
        }while(!taCerto);
    }
}