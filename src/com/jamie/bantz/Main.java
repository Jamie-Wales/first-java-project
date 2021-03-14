package com.jamie.bantz;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a product price and quantity");
        int price = scanner.nextInt();
        System.out.println("Thanks for adding a price please enter a qty");
        int quantity = scanner.nextInt();
        Item item = new Item(price, quantity);
        System.out.println("to get total please type getprice");
        String input = scanner.next();
        Boolean getPrice =  input.equals("getprice");
        while (getPrice){
                System.out.println(item.getPrice());
                break;
        }
        }
    }

