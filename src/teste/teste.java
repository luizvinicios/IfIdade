package teste;
import trabalho.metodo;
import java.util.Scanner;

public class teste {
public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    metodo p1 = new metodo();
    System.out.println("Digite seu nome: ");
    p1.setNome(ler.nextLine());
    System.out.println("Digite sua idade: ");
    p1.setIdade(ler.nextDouble());
    System.out.println("Digite seu peso: ");
    p1.setPeso(ler.nextDouble());
    System.out.println(p1.toString());



}   
}
