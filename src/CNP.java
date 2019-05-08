//19. se da un numar care reprezeinta CNP-ul unei persoane si are urmatorul format => SAALLZZJJNNNC. sa se scrie un program
// care afiseaza sexul, luna si anul nasterii unei, stiind ca :
//        S => sexul : masculin / feminin
//        1 / 2 - nascuti intre 1 ianuarie 1900 si 31 decembrie 1999
//        3 / 4 - nascuti intre 1 ianuarie 1800 si 31 decembrie 1899
//        5 / 6 - nascuti intre 1 ianuarie 2000 si 31 decembrie 2099
//        7 / 8 - pentru persoanele straine rezidente in Romania.

//        AA => numar format din 2 cifre si reprezinta ultimele 2 cifre din anul nasterii
//        LL => luna (exemplu 05 => mai)
//        ZZ => ziua (exemplu 09 = 9)
//        exemplu : cnp = 1900510...... se va afisa mesajul "baiat nascut pe 10 mai 1990"
//        cnp = 2890205...... se va afisa mesajul "fata nascuta pe 5 februarie 1989"




public class CNP{

    public static void main(String args[] ) {
       String CNP="1900510";
       String[] myString=CNP.split("");

       if (myString[0]=="1")
           System.out.print("baiat nascut pe ");
       else
           System.out.print("fata nascuta pe ");

     if(myString[5]=="0")
           System.out.print(myString[6]);
       else
           System.out.print(myString[5] + myString[6]);


       if(myString[3]=="0" && myString[4]=="1") {
           System.out.print(" ianuarie ");
       }
     else    if
            (myString[3] == "0" && myString[4] == "2") {
            System.out.print(" februarie ");
        }
     else   if
            (myString[3] == "0" && myString[4] == "3") {
            System.out.print(" martie ");
        }
       else if
            (myString[3] == "0" && myString[4] == "4") {
            System.out.print(" aprilie ");
        }
       else  if
            ( myString[3].equals("0") && myString[4].equals("5")) {
            System.out.print("mai ");
        }
       else if
            (myString[3] == "0" && myString[4] == "6") {
            System.out.print(" iunie ");
        }
       else  if
            (myString[3] == "0" && myString[4] == "7") {
            System.out.print(" iulie ");
        }
       else  if (myString[3] == "0" && myString[4] == "8") {
            System.out.print(" august ");
        }
       else   if
            (myString[3] == "0" && myString[4] == "9") {
            System.out.print(" septembrie");
        }
       else   if
            (myString[3] == "1" && myString[4] == "0") {
            System.out.print(" octombrie ");
        }
       else   if
            (myString[3] == "1" && myString[4] == "1") {
            System.out.print(" noiembrie ");
        }
       else   if
            (myString[3] == "1" && myString[4] == "2") {
            System.out.print("decembrie ");
        }


          // -----------------------------


     System.out.print(  "19" + myString[1] +myString[2]);
    }
    }