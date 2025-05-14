public class TransporteFactory {
    public static Transporte criar(TipoTransporte tipo) {
        switch (tipo) {
            case BIKE:
                return new Transporte("Bike", "destravar e pedalar");
            case MOTO:
                return new Transporte("Moto", "pegar a chave e ligar a moto");
            case ONIBUS:
                return new Transporte("Onibus", "entrar, pagar a passagem e sentar");
            case CARRO:
                return new Transporte("Carro", "pegar a chave e ligar o carro")
            default:
                throw new IllegalArgumentException("Tipo de Transporte desconhecido");
        }
    }
}