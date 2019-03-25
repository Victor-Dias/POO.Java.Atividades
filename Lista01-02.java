import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o ano do seu nascimento :");
        int idade = s.nextInt();
        System.out.println("A sua idade atual é igual a:");
        int resultado = Math.abs(idade-2019);
        System.out.println(resultado);
    }
}
