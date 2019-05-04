//12. se da un numar 0 <= n <= 11 (lunile anului, unde 0 -> ianuarie, etc). afisati un mesaj spunand in ce anotimp e luna reprezentata de n.
//        la fel, scrieti ambele variante (switch si if).
public class Ex12VariantaSwitch {
    public static void main(String[] args) {
        int n = 12;
        switch (n) {

            case 12:
            case 1:

            case 2:
                System.out.println("iarna");
                break;


            case 3:

            case 4:

            case 5:
                System.out.println("primavara");
                break;

            case 6:

            case 7:

            case 8:
                System.out.println("vara");
                break;

            case 9:

            case 10:

            case 11:
                System.out.println("toamna");
                break;

            default:
                System.out.println("input incorect");

        }
    }
}
