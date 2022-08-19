public class App {
    public static void main(String[] args) throws Exception {
            // IPhone 12, tela de 6.1'", 256 gb
            // Galaxy Note 20 Ultra, tela de 6.9", 256 gb
            // Xiaomi Mi 11 Pro, tela de 6.81", 128 gb
            // <tipoVariavel> nomeVariavel = valor; 

            // Declarando um ojeto do tipo Celular = Instanciando um objeto
            Celular celularA = new Celular();
            celularA.nome = "IPhone 12";
            celularA.tamanhoTela = 6.1f;
            celularA.espacoArmazenamento = 256;
            celularA.sistemaOperacional = "ïOS";

            Celular celularB = new Celular();
            celularB.nome = "Galaxy Note 20 Ultra";
            celularB.tamanhoTela = 6.9f;
            celularB.espacoArmazenamento = 256;
            celularB.sistemaOperacional = "Android";

            Celular celularC;
            celularC = new Celular();
            celularC.nome = "Xiaomi Mi 11 Pro";
            celularC.tamanhoTela = 6.81f;
            celularC.espacoArmazenamento = 128;
            celularC.sistemaOperacional = "Android";


            //"Celular "+ celularA.nome + " com tela de  " + celularA.tamanhoTela + ", com " + celularA.espacoArmazenamento + "gb e S.O. " + celularA.sistemaOperacional + "."
            System.out.format("Celular %s com tela de %.1f, com %dgb e S.O. %s\n",  celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
            System.out.format("Celular %s com tela de %.1f, com %dgb e S.O. %s\n",  celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
            System.out.format("Celular %s com tela de %.2f, com %dgb e S.O. %s",  celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);



    }
}
