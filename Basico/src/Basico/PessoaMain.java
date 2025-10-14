package Basico;

public class PessoaMain {
    public static void main(String[] args) {
      Pessoa pessoa = new Pessoa();

      pessoa.setNome("Guilherme Caixeta");
      pessoa.setIdade(20);
      pessoa.setProfissao("Engenheiro de Software");

      pessoa.exibirInfo();

    }
}
