public class Hanoi {
    public int solucionarTorreHanoi(int qtdDiscos) {
        if (qtdDiscos <= 0) {
            return 0;
        }
        else {
            return (int) Math.pow(2, (double) qtdDiscos) - 1;
        }


    }
}
