//Scrieti un program care sa  
// a.  sorteze un array de numere naturale. (ex {8, 4, 9,1, 2, 222})
//        - folosind bubble sort si java

//        b.  dupa ce s-a efectuat sortarea verificati daca exista in acea lista sortata
//        deja un numar n=? - folosind binary search si java 





public class BubbleSortAndBinarySearch {
    public static void main(String args[] ) {

        int[] myArray=new int [] {100,4,8,1,2,222};
        int n=6;
        //int arr[]; int n = arr.length;  echivalent cu: int[] myArray=new int [] {1,23,4}; int n=6; ???????
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)

                if (myArray[j] > myArray[j+1])
                {
                    // swap myArray[j+1] and myArray[i]
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
        for (int i=0; i<n; ++i)
            System.out.print(myArray[i] + " ");
        System.out.println();





        // binary search m-am insipirat de pe net si am facut ceva dar nu e corect
        int r=5;
        int x=10;
       int mijloc=5;
        if(r>=1){
            int mijloc= 1 + (r-1)/2; // daca elementul este chiar mijlocul
            if (myArray[mijloc]==x)
                return mijloc;
            //daca elementul este mai mic decat mijlocul,poate fi prezent doar in subarray
        }
        if (myArray[mijloc]>x)
            return mijloc - 1;
        else
            return mijloc + 1;


        int result=3;
                if (result == -1)
                    System.out.println("Elementul nu este present");
                else
                    System.out.println("Element se afla la indexul " + result);


    }
}
