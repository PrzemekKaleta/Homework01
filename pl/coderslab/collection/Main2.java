package pl.coderslab.collection;

/*    liczby zmiennoprzecinkowe (5.65 , 123.123)
    liczby w notacji naukowej ( 5.4325e+04 ; 2.0000342E-06)
    datę w formacie dd/mm/yyyy
    datę w formacie yyyy-mm-dd - gdzie rok jest powyżej 2000*/

public class Main2 {

String reg1 = "[\\d]+\\.[\\d]+";
String reg2 = "\\d\\.[\\d]+[eE][\\+-]\\d{2}";
String reg3 = "((0[1-9])|([1,2][0-9])|(3[0,1]))\\/((0[1-9])|(1[0-2]))\\/([0-9]{4})";
String reg4 = "([2-9][0-9]{3})\\/((0[1-9])|(1[0-2]))\\/((0[1-9])|([1,2][0-9])|(3[0,1]))";

//pominołem zabezpieczenie przed możliwością wpisania dodatkowych dni w miesiacach które są krótsze

}
