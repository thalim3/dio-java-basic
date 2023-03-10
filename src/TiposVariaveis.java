public class TiposVariaveis {
    /*
    Os oito tipos primitivos em Java são:
    int, byte, short, long, float, double, boolean e char.
    Esses tipos não são considerados objetos e portanto representam valores brutos.
    Eles são armazenados diretamente na pilha de memória.
    (Memory stack).

    O número mais comum utilizado é o do tipo int.

    Declaração de Variáveis:
    tipo de dado + identificação + valor atribuído.
    Exemplo: double salarioMinimo = 2500;
    */
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        // TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
    }
}