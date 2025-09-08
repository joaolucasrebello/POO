package POO_LISTAS.Lista4.Questao2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import POO_LISTAS.Lista4.Questao2.Funcionario;
import POO_LISTAS.Lista4.Questao2.FaixaIrpf;

public class FuncionarioTest {

    @Test
    void testFaixaPrimeira() {
        Funcionario f = new Funcionario("João", 850);
        assertEquals(FaixaIrpf.PRIMEIRA, f.identificarFaixaIrpf());
        assertEquals(0.00, f.calcularIrpf(), 0.01);
    }

    @Test
    void testFaixaSegunda() {
        Funcionario f = new Funcionario("Maria", 2000);
        assertEquals(FaixaIrpf.SEGUNDA, f.identificarFaixaIrpf());
        assertEquals(7.20, f.calcularIrpf(), 0.01);
    }

    @Test
    void testFaixaTerceira() {
        Funcionario f1 = new Funcionario("Pedro", 2826.66);
        assertEquals(FaixaIrpf.TERCEIRA, f1.identificarFaixaIrpf());
        assertEquals(69.20, f1.calcularIrpf(), 0.01);

        Funcionario f2 = new Funcionario("Ana", 3000);
        assertEquals(FaixaIrpf.TERCEIRA, f2.identificarFaixaIrpf());
        assertEquals(95.20, f2.calcularIrpf(), 0.01);
    }

    @Test
    void testFaixaQuarta() {
        Funcionario f = new Funcionario("Lucas", 4000);
        assertEquals(FaixaIrpf.QUARTA, f.identificarFaixaIrpf());
        assertEquals(263.87, f.calcularIrpf(), 0.01);
    }

    @Test
    void testFaixaQuinta() {
        Funcionario f = new Funcionario("Carla", 5000);
        assertEquals(FaixaIrpf.QUINTA, f.identificarFaixaIrpf());
        assertEquals(505.64, f.calcularIrpf(), 0.01);
    }

    @Test
    void testSalarioInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Funcionario("Erro", -100));
    }
}
