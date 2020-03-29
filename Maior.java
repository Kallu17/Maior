import java.util.Scanner;

public class Maior {
    public static void main(String[] args){
        System.out.println("Idade: ");
        int idade = new Scanner(System.in).nextInt();
        
        if(idade >= 18){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Você é menor de idade!");
        }
    }
}
