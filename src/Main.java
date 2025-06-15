public class Main {
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros(null);

        numeros.adiconarNumero(10);
        numeros.adiconarNumero(5);
        numeros.adiconarNumero(20);

        System.out.println("Números: " + numeros.exibirLista());
        System.out.println("Soma: " + numeros.calularSoma());
        System.out.println("Maior: " + numeros.encontrarMaiorNumero());
        System.out.println("Menor: " + numeros.encontrarMenorNumero());
    }
}
