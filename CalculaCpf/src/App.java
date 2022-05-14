import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);

        String cpf = sc.next();

        if (CpfValidation.isValid(cpf)) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }


    }
}
