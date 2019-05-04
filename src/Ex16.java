//16.
public class Ex16 {
    public static void main(String[] args) {
        int n = 1234;
        int s = 0;
        int i=0;
        int elementul_curent = 0;
        while(n!=0){
            elementul_curent = n % 10;
            i++;
            if (i % 2 == 0)
                s = s + elementul_curent;
            n = n / 10;
        }

        System.out.println(s);
    }
}
