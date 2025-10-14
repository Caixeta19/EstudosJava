///Classe Pessoa
/// Crie uma classe Pessoa com os atributos nome, idade e email.
/// Crie métodos para definir e mostrar os dados.
/// No main, instancie duas pessoas e exiba seus dados.
package Intermediario;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirDadosPessoais(){
        System.out.println("\n Dados Pessoais" );
        System.out.println("Nome:" + nome );
        System.out.println("Idade:" + idade );
        System.out.println( "Email:" + email);

    }


}
