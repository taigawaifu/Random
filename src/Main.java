import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ThreadLocalRandom gerador = ThreadLocalRandom.current();

        int TamanhoNome = gerador.nextInt(3,10);
        int Sobrenome = gerador.nextInt(3,10);

        char PrimeiraLetranome = (char) gerador.nextInt(65,90);
        char PrimeiraLetraSobremno = (char) gerador.nextInt(65,90);

        StringBuilder nome = new StringBuilder().append((PrimeiraLetranome));
        StringBuilder SobreNome = new StringBuilder().append(PrimeiraLetranome);

        for(int i = 1 ; i< TamanhoNome; i++){
            char letra = (char) gerador.nextInt(97,122);
            nome.append(letra);
        }

        for(int i = 1 ; i < Sobrenome ; i++){
         char letra = (char) gerador.nextInt(97,122);

        }
        System.out.println(nome + "" + SobreNome);


    }

}