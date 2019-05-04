public class Ex7 {


    public static void main(String[] args) {
        int n = 5, numar = 1, suma = 0, cifra, cifra2, cifra3;


        for (int i = 1; i <= n; i++) {
            numar = numar * 3;
        }
        numar = numar * 2;
        System.out.println(numar);

        cifra = numar % 10;
        cifra2 = numar % 100 / 10;
        cifra3 = numar / 100;

        suma = cifra + cifra2 + cifra3;
        System.out.println(suma);
    }
}
