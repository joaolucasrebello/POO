package POO_LISTAS.Lista2.Questao1;

public class Pessoa{
      private String nome;
      private double altura;
      private double peso;

      public String getNome() {
            return nome;
      }
      public void setNome(String nome) {
               if (nome == null || nome.isEmpty() || nome.isBlank()) {
                throw new IllegalArgumentException("Nome deve ser definido.");
            }
            if (nome.length() < 3) {
                throw new IllegalArgumentException("Nome deve ter pelo menos 3 caracteres.");
            }
            if (nome.length() > 50) {
                throw new IllegalArgumentException("Nome não pode ter mais de 50 caracteres.");
            }
            if (!nome.matches("[a-zA-Z\\s]+")) {
                throw new IllegalArgumentException("Nome deve conter apenas letras e espaços.");
            }
            this.nome = nome;
      }
      public double getAltura() {
            return altura;
      }
      public void setAltura(double altura) {
            if (altura <= 0) {
                throw new IllegalArgumentException("Altura deve ser um valor positivo.");
            }
            if (altura > 3) {
                throw new IllegalArgumentException("Altura não pode ser maior que 3 metros.");
            }
            if (altura < 0.2) {
                throw new IllegalArgumentException("Altura não pode ser menor que 0.2 metros.");
            }
            if (Double.isNaN(altura) || Double.isInfinite(altura)) {
                throw new IllegalArgumentException("Altura deve ser um número válido.");
            }
            this.altura = altura;
      }
      public double getPeso() {
            return peso;
      }
      public void setPeso(double peso) {
            if (peso <= 0) {
                throw new IllegalArgumentException("Peso deve ser um valor positivo.");
            }
            if (peso > 500) {
                throw new IllegalArgumentException("Peso não pode ser maior que 500 kg.");
            }
            if (peso < 10) {
                throw new IllegalArgumentException("Peso não pode ser menor que 10 kg.");
            }
            if (Double.isNaN(peso) || Double.isInfinite(peso)) {
                throw new IllegalArgumentException("Peso deve ser um número válido.");
            }
            this.peso = peso;
      }
      public double calcularIMC() {
            return peso / (altura * altura);
      }

}