public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando");
    }

    @Override
    public void virar() {
        System.out.println("Carro virando");
    }
}