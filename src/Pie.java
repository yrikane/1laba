import Filings.*;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Pie implements Nutritions {
    private filing filing;
    static int count = 0;

    public Pie(){
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите начинку для пирога");
        System.out.println("1. Шоколадная");
        System.out.println("2. Вишневая");
        System.out.println("3. Клубничная");

        while(true) {
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    filing = new Chocolate();
                    break;
                    case 2:
                    filing = new Cherry();
                    break;
                case 3:
                    filing = new Strawberry();
                    break;
                    default:
                    System.out.println("хаха лейм по цифре не попал лол");
            }
            if(choice < 4 && choice > 0)            {
                break;            }
        }
    }

    public void setFiling()
{
    Scanner in = new Scanner(System.in);

    int choice = in.nextInt();
    System.out.println("Выберите начинку для пирога");
    System.out.println("1. Шоколадная");
    System.out.println("2. Вишневая");
    System.out.println("3. Клубничная");

    switch(choice)
    {
        case 1:
            filing = new Chocolate();
            break;
        case 2:
            filing = new Cherry();
            break;
        case 3:
            filing = new Strawberry();
            break;
        default:
            System.out.println("Ошибка");
            break;

    }

}

    @Override
    public int CalculateCalories() {
        return filing.calories;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Pie pie = (Pie) obj;
        return filing.equals(pie.filing);
    }
}


