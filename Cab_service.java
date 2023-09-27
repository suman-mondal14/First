package First;

import java.util.*;

public class Cab_service {
    String taxi_no, name;
    int distance;
    double bill;

    Cab_service()   //default constructor
    {
        taxi_no="";
        name="";
        distance=0;
        bill=0.0;
    }

    //Input()
    void input()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Taxi No. :: ");
            taxi_no = sc.next();
            System.out.print("Enter Name :: ");
            name = sc.next();
            System.out.print("Distance (Kms):: ");
            distance = sc.nextInt();
        }
    }

    double calculation()
    {

        if(distance<=1)
            bill = distance*25;
        else if(distance<=5)
            bill = (1*25) + (distance-1)*30;
        else if(distance<=10)
            bill = (1*25) + (4*30) + (distance-5)*35;
        else if(distance<=20)
            bill = (1*25) + (4*30) + (5*35) + (distance-10)*40;
        else
            bill = (1*25) + (4*30) + (5*35) + (10*40) + (distance-20)*45;

        return bill;

    }

    void display()
    {
        System.out.println("Taxi No.\tName\tDistance(Km)\tBill Amount");
        System.out.print(taxi_no+"\t"+name+"\t"+distance+"\t"+bill);
    }
   
     public static void main(String[] args)
    {
        Cab_service ob = new Cab_service();
        ob.input();
        ob.calculation();
        ob.display();
    }
}


