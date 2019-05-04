//Scrieti un program care sa  
// a.  sorteze un array de numere naturale. (ex {8, 4, 9,1, 2, 222})
//        - folosind bubble sort si java

//        b.  dupa ce s-a efectuat sortarea verificati daca exista in acea lista sortata
//        deja un numar n=? - folosind binary search si java 
public class Bubble{
    public static void main(String[] args){

        int[] myArray = new int[] {8,4,9,1,2,222};
        int temp=0;
        int n=5;
        for(int i=0;i<n;i++)
            for(int j=1;j<(n-i);j++)
                if(myArray[j-1]>myArray[j]) {
                    temp = myArray[j - 1];
                    myArray[j-1]=myArray[j];
                    myArray[j]=temp;
                }
        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
    }
}
