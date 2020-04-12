package machine;
import java.util.*;
class need {
    String meth() {
        Scanner obj1 = new Scanner(System.in);
        String a = obj1.nextLine();
        return a;

    }
}
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        need d = new need();
        int wat = 400;
        int mil = 540;
        int coff = 120;
        int disp = 9;
        int cas = 550;
        boolean v = true;
        while (v) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String act = d.meth();
            System.out.println();
            if (act == "exit") {
                break;
            } else {
                switch (act) {
                    case "buy":
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                        String ch = d.meth();
                        if (ch == "back") {
                            continue;
                        }
                        switch (ch) {
                            case "1":
                                if (wat - 250 > 0 && coff - 16 > 0 && disp - 1 > 0) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    System.out.println();
                                    wat = wat - 250;
                                    coff = coff - 16;
                                    disp = disp - 1;
                                    cas = cas + 4;
                                    break;
                                } else {
                                    System.out.print("Sorry, not enough ");
                                    if (wat - 250 < 0) {
                                        System.out.println("water!");
                                        System.out.println();
                                    } else if (coff - 16 < 0) {
                                        System.out.println(("coffee!"));
                                        System.out.println();
                                    } else if (disp - 1 < 0) {
                                        System.out.println("disposable cups!");
                                        System.out.println();
                                    }
                                    break;
                                }

                            case "2":
                                if (wat - 350 > 0 && mil - 75 > 0 && coff - 20 > 0 && disp - 1 > 0) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    System.out.println();
                                    wat = wat - 350;
                                    mil = mil - 75;
                                    coff = coff - 20;
                                    disp = disp - 1;
                                    cas = cas + 7;
                                    break;
                                } else {
                                    System.out.print("Sorry, not enough ");
                                    if (wat - 350 < 0) {
                                        System.out.println("water!");
                                        System.out.println();
                                    } else if (mil - 75 < 0) {
                                        System.out.println("milk!");
                                        System.out.println();
                                    } else if (coff - 20 < 0) {
                                        System.out.println(("coffee!"));
                                        System.out.println();
                                    } else if (disp - 1 < 0) {
                                        System.out.println("disposable cups!");
                                        System.out.println();
                                    }
                                    break;
                                }
                            case "3":
                                if (wat - 200 > 0 && mil - 100 > 0 && coff - 12 > 0 && disp - 1 > 0) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    System.out.println();
                                    wat = wat - 200;
                                    mil = mil - 100;
                                    coff = coff - 12;
                                    disp = disp - 1;
                                    cas = cas + 6;
                                    break;
                                } else {
                                    System.out.print("Sorry, not enough ");
                                    if (wat - 200 < 0) {
                                        System.out.println("water!");
                                        System.out.println();
                                    } else if (mil - 100 < 0) {
                                        System.out.println("milk!");
                                        System.out.println();
                                    } else if (coff - 12 < 0) {
                                        System.out.println(("coffee!"));
                                        System.out.println();
                                    } else if (disp - 1 < 0) {
                                        System.out.println("disposable cups!");
                                        System.out.println();
                                    }
                                    break;
                                }
                        }
                        continue;
                    case "fill":
                        System.out.println("Write how many ml of water do you want to add:");
                        String c = d.meth();
                        int wt = Integer.parseInt(c);
                        System.out.println("Write how many ml of milk do you want to add:");
                        String e = d.meth();
                        int ml = Integer.parseInt(e);
                        System.out.println("Write how many grams of coffee beans do you want to add:");
                        String f = d.meth();
                        int cf = Integer.parseInt(f);
                        System.out.println("Write how many disposable cups of coffee do you want to add:");
                        String g = d.meth();
                        int ds = Integer.parseInt(g);
                        System.out.println();
                        wat = wat + wt;
                        mil = mil + ml;
                        coff = coff + cf;
                        disp = disp + ds;
                        continue;
                    case "take":
                        System.out.print("I gave you $");
                        System.out.println(cas);
                        System.out.println();
                        cas = 0;
                        continue;
                    case "remaining":
                        System.out.println("The coffee machine has:");
                        System.out.print(wat);
                        System.out.println(" of water");
                        System.out.print(mil);
                        System.out.println(" of milk");
                        System.out.print(coff);
                        System.out.println(" of coffee beans");
                        System.out.print(disp);
                        System.out.println(" of disposable cups");
                        System.out.print("$");
                        System.out.print(cas);
                        System.out.println(" of money");
                        System.out.println();
                        continue;
                    case "exit":
                        v = false;
                        continue;


                }
            }
        }
    }
}
