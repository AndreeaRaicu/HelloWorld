public class Ex10 {
    public static void main(String[] args) {
        int suma=0;
        int[] secondArray =new int[] {2,3,4,5,6,7,8,10,12};
        int counter=0;
        int n=9;

        for (int i=0; i<n ;i++  ) {

            if (secondArray[i]%2==0)
            {
                if(counter<5) {
                    suma = suma + secondArray[i];
                    counter++;
                }
            }
        }


        System.out.println(suma);
    }
}
