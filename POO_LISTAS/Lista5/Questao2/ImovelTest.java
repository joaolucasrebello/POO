package POO_LISTAS.Lista5.Questao2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImovelTest {

    @Test
    void testAreaNegativaLancaExcecao() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Imovel("Rua A, 123", -5.0);
        });
        assertEquals("Área deve ser maior que Zero", exception.getMessage());
    }

    @Test
    void testCalcularIptuSemBairroLancaExcecao() {
        Imovel imovel = new Imovel("Rua B, 456", 100.0);
        imovel.setFinalidade(FinalidadeImovel.RESIDENCIAL);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            imovel.calcularIptu();
        });
        assertEquals("Não é possível calcular IPTU sem definir o bairro.", exception.getMessage());
    }

    @Test
    void testCalcularIptuSemFinalidadeLancaExcecao() {
        Imovel imovel = new Imovel("Rua C, 789", 250.0);
        imovel.setBairro(new Bairro("Centro", 1.0));
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            imovel.calcularIptu();
        });
        assertEquals("Não é possível calcular IPTU sem definir a finalidade do imóvel.", exception.getMessage());
    }

    @Test
    void testCalcularIptuBairroCoeficienteNegativoLancaExcecao() {
        Imovel imovel = new Imovel("Rua D, 101", 100.0);
        imovel.setBairro(new Bairro("Bairro Ruim", -0.5));
        imovel.setFinalidade(FinalidadeImovel.RESIDENCIAL);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            imovel.calcularIptu();
        });
        assertEquals("Coeficiente do bairro não pode ser negativo.", exception.getMessage());
    }

    @Test
    void testCalcularIptuResidencial() {
        Imovel imovel = new Imovel("Rua E, 202", 400.0);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(FinalidadeImovel.RESIDENCIAL);
        assertEquals(400.00, imovel.calcularIptu(), 0.01);
    }

    @Test
    void testCalcularIptuComercialAte100m2() {
        Imovel imovel = new Imovel("Rua F, 303", 80.0);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(FinalidadeImovel.COMERCIAL);
        assertEquals(500.00, imovel.calcularIptu(), 0.01);
    }

    @Test
    void testCalcularIptuComercialEntre100e400m2() {
        Imovel imovel = new Imovel("Rua G, 404", 250.0);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(FinalidadeImovel.COMERCIAL);
        assertEquals(1000.00, imovel.calcularIptu(), 0.01);
    }

    @Test
    void testCalcularIptuComercialAcima400m2() {
        Imovel imovel = new Imovel("Rua H, 505", 500.0);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(FinalidadeImovel.COMERCIAL);
        assertEquals(1275.00, imovel.calcularIptu(), 0.01);
    }

    @Test
    void testCalcularIptuIndustrialAte2000m2() {
        Imovel imovel = new Imovel("Rua I, 606", 2000.0);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(FinalidadeImovel.INDUSTRIAL);
        assertEquals(1000.00, imovel.calcularIptu(), 0.01);
    }

    @Test
    void testCalcularIptuIndustrialAcima2000m2() {
        Imovel imovel = new Imovel("Rua J, 707", 3000.0);
        imovel.setBairro(new Bairro("Centro", 1.0));
        imovel.setFinalidade(FinalidadeImovel.INDUSTRIAL);
        assertEquals(1650.00, imovel.calcularIptu(), 0.01);
    }

    @Test
    void testCalcularIptuComCoeficiente() {
        Imovel imovel = new Imovel("Rua K, 808", 500.0);
        imovel.setBairro(new Bairro("Bairro Nobre", 2.5));
        imovel.setFinalidade(FinalidadeImovel.RESIDENCIAL);
        assertEquals(1250.00, imovel.calcularIptu(), 0.01);
    }
}

