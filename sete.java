import java.util.Scanner;

public class sete {
    public static void main(String[] args) throws Exception {
        
        int l, result;
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o valor da lateral do quadrado! ");
        l = leia.nextInt();
        result = l * l;
        System.out.println("A area do quadrado e: " + result * 2);
    }
    
}
        