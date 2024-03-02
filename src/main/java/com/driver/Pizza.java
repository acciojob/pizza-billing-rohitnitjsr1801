package com.driver;

public class Pizza {

    public int ToppingPrice;

    public boolean toppingFlag=true;
    public int paperBagPrice=0;
    public boolean extraCheeseFlag=true;

    public boolean isExtraCheeseFlag=false;
    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        if(isVeg){
            this.ToppingPrice=70;
            price+=300;
            bill="Base Price Of The Pizza: 300\n";
        }else {
            this.ToppingPrice=120;
            price+=400;
            bill="Base Price Of The Pizza: 400\n";
        }

        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(extraCheeseFlag)
        {
            this.price += 80;
            extraCheeseFlag=false;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        if(toppingFlag)
        {
            this.price+=this.ToppingPrice;
            toppingFlag=false;
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(paperBagPrice==0)
        {
            this.price+=20;
            paperBagPrice=20;
        }
        // your code goes here
    }

    public String getBill(){
        if(!extraCheeseFlag)
        {
            bill += "Extra Cheese Added: 80" + "\n";
        }
        if(!toppingFlag)
        {
            bill += "Extra Toppings Added: " + ToppingPrice + "\n";
        }

        // your code goes here
        if(paperBagPrice!=0)
        {
            bill += "Paperbag Added: " + paperBagPrice + "\n";
        }

        bill += "Total Price: " + price + "\n";

        return this.bill;
    }
}
