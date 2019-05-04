public class Ex4 {


    public static void main(String[] args) {
        int p = 0,imp=0, n = 9;
        int[] secondArray = new int[]{2, 6, 8, 3, 4, 9, 11,13,17};

        for (int i = 0; i < n; i++) {
            if (secondArray[i] % 2 != 0) {
                imp++;
                //System.out.println(imp);
            } else
                p++;
            //System.out.println(p);
        }
        System.out.println("IMPAR = " +imp);
        System.out.println("PAR = " +p);
    }
}
