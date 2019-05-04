//Problema 11 varianta cu switch
public class Ex11 {
    public static void main(String[] args) {
        //     11. sa da un numar 0 <= n <= 9 (intre 0 si 9). afisati un mesaj spunand ce numar reprezinta (zero, unu, etc) sau "numar gresit" pentru cazul cand n este in afara intervalului.
        //   pentru problema 11, trebuie sa scrieti 2 variante ale programului. una folosind if-esle, una folosind switch.
        int n = 11;
        String cifraString;

        switch (n) {
            case 1:
                cifraString = "unu";
                break;
            case 2:
                cifraString = "doi";
                break;
            case 3:
                cifraString = "trei";
                break;
            case 4:
                cifraString = "patru";
                break;
            case 5:
                cifraString = "cinci";
                break;
            case 6:
                cifraString = "sase";
                break;
            case 7:
                cifraString = "sapte";
                break;
            case 8:
                cifraString = "opt";
                break;
            case 9:
                cifraString = "noua";
                break;
            case 10:
                cifraString = "zece";
                break;
            default:
                cifraString = "numar gresit";
                break;
        }
        System.out.println(cifraString);
    }
}
