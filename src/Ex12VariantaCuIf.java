//12. se da un numar 0 <= n <= 11 (lunile anului, unde 0 -> ianuarie, etc). afisati un mesaj spunand in ce anotimp e luna reprezentata de n.
//        la fel, scrieti ambele variante (switch si if).
public class Ex12VariantaCuIf {
    public static void main(String[] args) {

        int n = 7;

        boolean isSpring = n>2 && n<6;
        boolean isSummer = n>=6&& n<9;
        boolean isWinter=n<13 && n>0;


        if (isSpring) {
            System.out.println("primavara");
        } else if (isSummer) {
            System.out.println("vara");

        } else if (n >= 9 && n < 12) {
            System.out.println("toamna");

        } else if (isWinter) {
            System.out.println("iarna");
        } else {
            System.out.println("incorect");
        }


    }
}


