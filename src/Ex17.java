//17. se da un numar n. sa se calculeze m unde m este suma cifrelor
//de pe pozitiile pare - suma cifrelor de pe pozitiile impare
public class Ex17 {
    public static void main(String[] args)  {
        int n=12345;
        int s = 0;
        int i=0;
        int elementul_curent = 0;
        while(n!=0){
            elementul_curent = n % 10;
            i++;
            if (i % 2 != 0)
                s = s + elementul_curent;
            n = n / 10;
        }

        System.out.println(s);
    }
}


