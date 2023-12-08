public class Hanoi {
    public int solucionarTorreHanoi(int qtdDiscos) throws NumeroNegativoException {
        if (qtdDiscos < 0) {
            throw new NumeroNegativoException("Quantidade inválida de discos inserida");
        }
        else {
            return (int) Math.pow(2, (double) qtdDiscos) - 1;
        }
    }
}
