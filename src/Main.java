public class Main {
    public static void main(String[] args) {
        FabricaVeiculo fabricaCarro = new FabricaCarro();
        FabricaVeiculo fabricaMoto = new FabricaMoto();

        Veiculo meuCarro = fabricaCarro.criarVeiculo();
        Veiculo minhaMoto = fabricaMoto.criarVeiculo();

        meuCarro.acelerar();
        meuCarro.virar();
        meuCarro.frear();

        minhaMoto.acelerar();
        minhaMoto.virar();
        minhaMoto.frear();
    }
}
