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
        int media= ((primeira*2+segunda*3+terceira*5)/10);
        System.out.println("Sua media é igual a :");
        System.out.println(media);
        
    }
}
