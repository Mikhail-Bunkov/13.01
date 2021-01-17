package geekbrains.offless5;

import java.util.Random;
import java.util.Scanner;

public class Room {
    public int price;
    public int capacity;
    public String category;
    private int password;
    public  void printRoomInfo()
    {
        System.out.println("Цена: "+price);
        System.out.println("Категория: "+category);
        System.out.println("Максимальная вместимость(количество живущих человек оказывает влияние на цену): "+capacity);
        System.out.println("К каждому номеру будет выдана своя индивидуальная карта с паролем.");
    }

    public int changePrice(int humans)
    {
        boolean errorInd=false;
        if(humans>capacity)
        {
            System.out.println("Столько людей не поместится в наш номер");
            errorInd = true;
            return price;

        }
        if (humans>0&& humans <3)
        {
            return price;
        }
        if (humans>=3&& humans <capacity)
        {
            return price+price/(capacity-humans);//надо переделать формулу
        }
        else{
            return price*2;
        }
    }
    private  int passwordGenerator()
    {
        do {
            Random random = new Random();
            password = random.nextInt() * 10000000;//стоит переделать формулу рандома и условия
        }while (password/3 ==0 || password/11 ==0 || password/4 ==0);
        System.out.println("Пароль сгенерирован.");
        return password;
    }
    public int passwordGetToCard(boolean rootToGetPassword)
    {
        if (!rootToGetPassword)
        {
            System.exit(1);//вписать что делать, при отсутствии права получить пароль на карту( почему )
        }
        return passwordGenerator();
    }


}
