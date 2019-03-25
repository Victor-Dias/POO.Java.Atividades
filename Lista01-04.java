import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota :");
        int primeira = s.nextInt();
        System.out.println("Digite a segunda nota :");
        int segunda = s.nextInt();
        System.out.println("Digite a terceira nota :");
        int terceira = s.nextInt();
        System.out.println("Digite a quarta nota :");
        int quarta = s.nextInt();
        int media= ((primeira+segunda+terceira+quarta)/4);
        System.out.println("Sua media é igual a :");
        System.out.println(media);
        if (media>=7){
          System.out.println("Aluno Aprovado");
        }
        else if (media<7 && media>=5){
          System.out.println("Aluno Final");
        }
        else{
          System.out.println("Aluno Reprovado");
        }
        
    }
}
