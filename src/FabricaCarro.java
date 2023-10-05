public class FabricaCarro implements FabricaVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        System.out.println("Fabricando um novo carro.");
        return new Carro();
    }
}
