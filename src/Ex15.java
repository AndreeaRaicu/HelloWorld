//15. se dau doua numere n si m, scrieti un program care afiseaza "true" sau "false" (daca n este inversul lui m).
// exemplu: n = 12, m = 21 => true; n = 10, m = 1 => false
public class Ex15{
    public static void main(String[] args){
        int n=31;
        int m=13;
        int i=0;
        while (n!=0){
            i=i*10+n%10;
            n=n/10;
        };
        if(m==i)


            System.out.println("true");

        else{
            System.out.println("false");

        }

    }
}
