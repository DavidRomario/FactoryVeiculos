public class FabricaMoto implements FabricaVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        System.out.println("Fabricando uma nova moto.");
        return new Moto();
    }
}
