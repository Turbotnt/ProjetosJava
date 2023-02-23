
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        Pessoa pessoa1=new Pessoa(1487, "José Martinho de Barros");
        Pessoa pessoa2=new Pessoa(2586, "Antero José de Macedo");
        
        System.out.println("O nome da pessoa é "+pessoa1.getNome()+" e o seu código é "+pessoa1.getCodigo()+".");
        System.out.println("Quanto ao "+pessoa2.getNome()+", seu código é o "+pessoa2.getCodigo()+".");
    }
}
