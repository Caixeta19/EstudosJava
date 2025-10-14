//Crie uma classe Pessoa com os atributos nome, idade e profissao.
//Em seguida, crie um objeto dessa classe e exiba suas informações.
package Basico;
public class Pessoa {

    private String nome;
    private int idade;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void exibirInfo() {
        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos e trabalho como " + profissao);
    }
}
