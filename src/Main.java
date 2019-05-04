1.

public class Main {


    public static void main(String[] args) {


        // 1. sa se scrie un program folosind o structura repetitiva, care sa afiseze urmatorul rezultat
//# ##  ###   ####   ###  ##  #


        int n = 4;
        int k = 1;
        boolean crestere = true;

        while (k > 0) {
            for (int i = 0; i < k; i++)
                System.out.print("#");

            System.out.print(" ");
            if (crestere == true) {
                if (k < n) {
                    k++;
                } else {
                    k--;
                    crestere = false;
                }
            } else
                k--;
        }
    }
}


