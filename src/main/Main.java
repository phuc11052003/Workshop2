/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import data.Bus;
import data.SpecCar;
import java.util.Scanner;

/**
 *
 * @author tran Hoang Phuc
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String maker;
        int price;
        int type;
        int number;
        System.out.print("Enter maker: ");
        maker = sc.nextLine();
        System.out.print("Enter price: ");
        price = Integer.parseInt(sc.nextLine());
        System.out.print("Enter type: ");
        type = Integer.parseInt(sc.nextLine());
        System.out.print("Enter number: ");
        number = Integer.parseInt(sc.nextLine());

        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.println("4. Test speed()");
        System.out.println("5. Test format()");
        System.out.println("Enter TC");
        System.out.print("(1,2,3,4,5): ");
            SpecCar c1 = new SpecCar(maker, price, type);
            Bus c2 = new Bus(maker, price, number);
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                 System.out.println(c1);
                 System.out.println(c2);
                break;
            case 2:
                c1.setData();
                c2.setData();
                System.out.println(c1.getMaker() + ", " + c1.getPrice());
                System.out.println(c2.getMaker() + ", " + c2.getPrice());
                break;
            case 3:
                System.out.println(c1.getValue());
                System.out.println(c2.getValue());
                break;
            case 4:
                System.out.println(c1.speed());
                System.out.println(c2.speed());
                break;
            case 5:
                System.out.println(c1.format());
                break;
            default:
                System.out.println("Invalid value.");
                break;
        }
    }

    
   
}
