package Basico;

public class CarroMain {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("Volkswagen");
        carro.setModelo("Jetta GLI");
        carro.setAno(2026);

        carro.exibirInfo();
    }
}
