package geekbrains.offless5;

import java.util.Random;
import java.util.Scanner;

public class Resident {
    private int money;
    private int numberOfHumans;
    private int id;
    public Resident(){
        Scanner scanner = new Scanner(System.in);
        setMoney(scanner.nextInt());
        System.out.println("На балансе: "+getMoney());
        setNumberOfHumans(scanner.nextInt());
        System.out.println("Количество людей, которые будут жить в номере:"+ getNumberOfHumans());
        setId();
        System.out.println("Ваш индитификационный номер: "+getId());

    }
    public void setMoney(int money)
    {
        this.money=money;
    }
    public int getMoney(){
        return money;
    }
    public void setNumberOfHumans(int numberOfHumans)
    {
        this.numberOfHumans=numberOfHumans;
    }
    public int getNumberOfHumans(){
        return numberOfHumans;
    }
    public void setId()
    {
        do {
            Random random = new Random();
            id = random.nextInt() * 10000000;//стоит переделать формулу рандома и условия
        }while (id/3 ==0 || id/11 ==0 || id/4 ==0);
    }
    public int getId(){

        return id;
    }
}
