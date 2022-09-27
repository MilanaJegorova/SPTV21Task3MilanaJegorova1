package sptv21task3milanajegorova1;

import java.util.Scanner;

public class SPTV21Task3MilanaJegorova1 {

    
    public static void main(String[] args) {
        int birtyear1 = 19;
        int birthyear2 = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваше имя: ");
        String firstname = scanner.nextLine();
        System.out.print("Ваша фамилия: ");
        String lastname = scanner.nextLine();
        System.out.print("Ваш личный номер: ");
        String mynumber = scanner.nextLine();
        if (mynumber.substring(0,1) == "u") {
            System.out.println(birthyear2);
        }
        System.out.println(firstname+" "+lastname+" родился "+mynumber.substring(5,7)+" "+birthyear2+mynumber.substring(1,3)+" года");
    }
    
}