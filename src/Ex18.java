//18. se da un caracter n (char). sa afiseze daca
//n este o litera ce reprezinta punctele cardinale.
public class Ex18 {
    public static void main(String[]args){

        char n = 'S';
        boolean isCardinal=  n=='N' | n=='S' | n=='V' | n=='E' ;
        if(isCardinal)
            System.out.println("n este o litera ce reprezinta punctele cardinale");
        else
            System.out.println("incorect");
    }
}
