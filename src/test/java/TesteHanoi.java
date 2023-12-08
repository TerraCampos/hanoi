import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteHanoi {


    @Test
    @DisplayName("Teste com 1 disco")
    public void testeUmDisco() throws NumeroNegativoException {
        Hanoi problema = new Hanoi();
        assertEquals(problema.solucionarTorreHanoi(1), 1);
    }

    @Test
    @DisplayName("Teste com 2 discos")
    public void testeDoisDiscos() throws NumeroNegativoException {
        Hanoi problema = new Hanoi();
        assertEquals(problema.solucionarTorreHanoi(2), 3);
    }

    @Test
    @DisplayName("Teste com 3 discos")
    public void testeTresDiscos() throws NumeroNegativoException {
        Hanoi problema = new Hanoi();
        assertEquals(problema.solucionarTorreHanoi(3), 7);
    }

    @Test
    @DisplayName("Teste com 4 discos")
    public void testeQuatroDiscos() throws NumeroNegativoException {
        Hanoi problema = new Hanoi();
        assertEquals(problema.solucionarTorreHanoi(4), 15);
    }

    @Test
    @DisplayName("Teste com 15 discos")
    public void testeMutiosDiscos() throws NumeroNegativoException {
        Hanoi problema = new Hanoi();
        assertEquals(problema.solucionarTorreHanoi(15), 32767);
    }

    @Test
    @DisplayName("Teste com 16 discos (assertNotEquals)")
    public void testeMuitosDiscosFalso() throws NumeroNegativoException {
        Hanoi problema = new Hanoi();
        assertNotEquals(problema.solucionarTorreHanoi(16), 40000);
    }

    @Test
    @DisplayName("Teste com nenhum disco (zero)")
    public void testeZero() throws NumeroNegativoException {
        Hanoi problema = new Hanoi();
        assertEquals(problema.solucionarTorreHanoi(0), 0);
    }

    @Test
    @DisplayName("Teste com entrada inválida (número negativo)")
    public void testeNegativo() throws NumeroNegativoException {
        Hanoi problema = new Hanoi();
        try {
            problema.solucionarTorreHanoi(-1);
            fail();
        }
        catch (Exception NumeroNegativoException) {
            System.out.println(NumeroNegativoException.toString());
            assertTrue(true);
        }
    }

}