/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author tran Hoang Phuc
 */
public class Bus extends Car implements ICar{
    private int number;
    
    public Bus() {
    }

    public Bus(int number) {
        this.number = number;
    }

    public Bus(String maker, int price, int number) {
        super(maker, price);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    

    @Override
    public String toString() {
        return super.toString() + ", " + number;
    }

    @Override
    public void setData() {
        super.setMaker("BS" + super.getMaker());
        super.setPrice(50 + super.getPrice());
    }

    @Override
    public int getValue() {
        if (super.getPrice() < 500)
            return 10 + number;
        else
            return 15 + number;
    }

    @Override
    public int speed() {
        if (super.getPrice() > 300 && super.getPrice() < 500 && number < 20)
            return 3000;
        else
            return 2500;
    }

    @Override
    public String format() {
        char[] str = super.getMaker().toCharArray();
        boolean found = false;
        for (int i = 0; i < str.length; i++) {
            if (!found && Character.isLetter(str[i])) {
                str[i] = Character.toUpperCase(str[i]);
                found = true;
            } else if (Character.isWhitespace(str[i]) || str[i] == '.' || str[i] == '\'') { 
                found = false;
            }
        }
        return String.valueOf(str);
    }   
}
