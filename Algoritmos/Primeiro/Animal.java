public class Animal {

    private String nome;
    private int idade;
    
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    } 

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String emitirSom(){
        return "som";
    } 

    @Override
    public String toString(){
        return "Nome: " + this.nome + " \n idade: " + this.idade;
    }
}