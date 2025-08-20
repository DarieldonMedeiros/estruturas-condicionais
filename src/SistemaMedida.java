public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        String resultado = switch (sigla){
          case "P" -> "PEQUENO";
          case "M" -> "MÉDIO";
          case "G" -> "GRANDE";
          default -> "INDEFINIDO";
        };

        System.out.println(resultado);
    }
}
