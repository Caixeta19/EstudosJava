//Crie uma classe Carro com os atributos marca, modelo e ano.
//Adicione um método exibirInfo() que mostre as informações do carro.
package Basico;
public class Carro {

    private String marca;
    private String modelo;
    private  int ano;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirInfo(){
        System.out.println("O carro de marca " + marca + " e modelo " + modelo + " com o ano de fabricação " + ano + " está a venda");
    }

}
