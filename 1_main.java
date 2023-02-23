import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        
        String gatoa, gatob, gatoc, gatod;

        Gato gato1=new Gato("branco","macho","pretos",2);
        Gato gato2=new Gato("preto","fêmea","pretos",3);
        Gato gato3=new Gato("marrom","macho","azuis",4);
        Gato gato4=new Gato("cinza","fêmea","verdes",1);
        
        System.out.println("Digite o nome do primeiro gato: ");
        gatoa=ler.nextLine();
        System.out.println("Digite o nome do segundo gato: ");
        gatob=ler.nextLine();
        System.out.println("Digite o nome do terceiro gato: ");
        gatoc=ler.nextLine();
        System.out.println("Digite o nome do quarto gato: ");
        gatod=ler.nextLine();
        
        System.out.println("Eu tenho um gato siamês "+gato1.getSexo()+" chamado "+gatoa+", de cor "+gato1.getCor()+", com belos olhos "+gato1.getOlhos()+" e com "+gato1.getIdade()+" anos de idade.");
        System.out.println("Já o meu gato persa é "+gato2.getSexo()+" chamado "+gatob+", de cor "+gato2.getCor()+", com um par de olhos "+gato2.getOlhos()+" e com "+gato2.getIdade()+" anos de idade.");
        System.out.println("Também tenho um gato ragdol "+gato3.getSexo()+" chamado "+gatoc+", de cor "+gato3.getCor()+", com olhos "+gato3.getOlhos()+" e com "+gato3.getIdade()+" anos de idade.");
        System.out.println("Por fim, o meu gato viralatas é "+gato4.getSexo()+" chamado "+gatod+", de cor "+gato4.getCor()+", tem olhos "+gato4.getOlhos()+" e tem apenas "+gato4.getIdade()+" anos de idade.");
    }
}


