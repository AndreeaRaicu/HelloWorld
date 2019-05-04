 public class Ex3 {


    public static void main(String[] args) {
        int n = 7;
        int max = 0;
        int[] secondArray = new int[]{2, 6, 8, 3, 4, 9, 11};
        for (int i = 0; i < n; i++) {
            if (secondArray[i] % 2 != 0) {
                if (secondArray[i] > max) {
                    max = secondArray[i];
                }
            }

        }
        if(max==0)
            System.out.println("no");
        else
            System.out.println(max);

    }
}


