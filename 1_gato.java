public class Gato{
    private String cor;
    private String sexo;
    private String olhos;
    private int idade;
    
    public Gato(String cor, String sexo, String olhos, int idade){
        this.cor=cor;
        this.sexo=sexo;
        this.olhos=olhos;
        this.idade=idade;
    }
    
    public String getCor(){
        return cor;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public String getOlhos(){
        return olhos;
    }
    
    public int getIdade(){
        return idade;
    }
}