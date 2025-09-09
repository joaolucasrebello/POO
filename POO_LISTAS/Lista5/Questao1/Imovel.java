package POO_LISTAS.Lista5.Questao1;

public class Imovel {
    private String endereco;
    private double area;
    private FinalidadeImovel finalidade;
    private Bairro bairro;

    public Imovel(String endereco, double area) {
        this.endereco = endereco;
        setArea(area);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area <= 0) {
            throw new IllegalArgumentException("Área deve ser maior que Zero");
        }
        this.area = area;
    }

    public FinalidadeImovel getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(FinalidadeImovel finalidade) {
        this.finalidade = finalidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public double calcularIptu() {
        if (bairro == null) {
            throw new IllegalArgumentException("Não é possível calcular IPTU sem definir o bairro.");
        }
        if (bairro.getCoeficienteIptu() < 0) {
            throw new IllegalArgumentException("Coeficiente do bairro não pode ser negativo.");
        }
        if (finalidade == null) {
            throw new IllegalArgumentException("Não é possível calcular IPTU sem definir a finalidade do imóvel.");
        }

        double iptuBase = 0.0;

        switch (finalidade) {
            case RESIDENCIAL:
                iptuBase = area * 1.00;
                break;
            case COMERCIAL:
                if (area <= 100) {
                    iptuBase = 500.00;
                } else if (area <= 400) {
                    iptuBase = 1000.00;
                } else {
                    iptuBase = area * 2.55;
                }
                break;
            case INDUSTRIAL:
                if (area <= 2000) {
                    iptuBase = 1000.00;
                } else {
                    iptuBase = area * 0.55;
                }
                break;
        }
        return iptuBase * bairro.getCoeficienteIptu();
    }
}
