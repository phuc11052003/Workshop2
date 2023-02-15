/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author tran Hoang Phuc
 */
public class SpecCar extends Car implements ICar {

    private int type;

    public SpecCar() {
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + type;
    }

    @Override
    public void setData() {
        super.setMaker("XZ" + super.getMaker());
        super.setPrice(20 + super.getPrice());
    }

    @Override
    public int getValue() {
        if (type < 7) {
            return 10 + super.getPrice();
        } else {
            return 15 + super.getPrice();
        }
    }

    @Override
    public int speed() {
        if (super.getPrice() > 500 && type > 7) {
            return 4000;
        } else {
            return 3500;
        }
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
