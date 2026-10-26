package com.codegnan.app.javaapp04;

public class BlackFridaySale implements GetDiscount{
    @Override
    public double discountAmount(double amount) {
          var discountMrp = 0.0;
          var discount = 25.0;
          var dicountMrp = (amount * discount)/100;
          return dicountMrp;
    }
}
