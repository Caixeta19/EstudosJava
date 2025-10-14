package Intermediario;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Guilherme Caixeta");
        pessoa.setIdade(20);
        pessoa.setEmail("guilhermecaixeta85@gmail.com");

         pessoa.exibirDadosPessoais();

         Pessoa pessoa1 = new Pessoa();

         pessoa1.setNome("Beatriz");
         pessoa1.setIdade(56);
         pessoa1.setEmail("beatrizqueiroz27@gmail.com");

         pessoa1.exibirDadosPessoais();


    }


}
