import java.util.Scanner;

/*
* File: MainConsole.java
* Author: Molnár Csenge Anna
* Copyright: 2023, Molnár Csenge Anna
* Group: Szoft I-1 N
* Date: 2023-02-20
* Github: https://github.com/Verfarkas02/
* Licenc: GNU GPL
*/
public class MainConsole {
    public MainConsole(){
        task();
        about();
        doit();
    }
    private void task(){
        System.out.println("Feladat 0358 Megoldás");
        System.out.println("Lelepi területe");
    }
    private void about(){
        System.out.println("Molnar Csenge Anna");
        System.out.println("Szoft I-1-N");
        System.out.println("2023-02-20");
    }
    private String input(String msg){
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        return value;

    }

    private void doit(){
        String aside =input("A oldal:");
        String bside =input("B oldal:");
        String cside =input("C oldal:");

        double a =Double.parseDouble(aside);
        double b =Double.parseDouble(bside);
        double c =Double.parseDouble(cside);

        Lelepi lelepi = new Lelepi();
        
        System.out.println(lelepi.calcArea(a, b, c));
        
    }
    
    
}
