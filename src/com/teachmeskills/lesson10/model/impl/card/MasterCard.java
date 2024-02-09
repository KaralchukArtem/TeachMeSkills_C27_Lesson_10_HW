package com.teachmeskills.lesson10.model.impl.card;

import com.teachmeskills.lesson10.model.BaseCard;

public class MasterCard extends BaseCard {
    public MasterCard(int cvc, String cardNumber, double currentAmount) {
        super(cvc, cardNumber, currentAmount);
    }

    @Override
    public String toString() {
        return "MasterCard " +
                "cvc=" + cvc +
                ", cardNumber='" + cardNumber + '\'' +
                ", currentAmount=" + currentAmount;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
