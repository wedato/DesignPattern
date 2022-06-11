package ct.exo3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var montre = new Montre();
        System.out.println("1 pour changer de mode");
        System.out.println("2 pour avancer");
        System.out.println("3 pour avancerapide");
        System.out.println("other pour exit");
        while (true){
            Scanner sc = new Scanner(System.in);


            int press = sc.nextInt();
            if (press == 1 ) {
                montre.pressButtonMode();
                System.out.println(montre.getMode());
            }
            else if (press == 2) {
                montre.pressButtonAvance();
            }
            else if (press == 3)
                montre.pressButtonRapideAvance();
            else
                break;

        }

    }
}
