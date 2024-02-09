package com.teachmeskills.lesson10.model;

import java.util.Objects;

public abstract class BaseCard {

    protected int cvc;
    protected String cardNumber;
    protected double currentAmount;

    public BaseCard(int cvc, String cardNumber, double currentAmount) {
        this.cvc = cvc;
        this.cardNumber = cardNumber;
        this.currentAmount = currentAmount;
    }

    public int getCvc() {
        return cvc;
    }
    public void setCvc(int cvc) {
        this.cvc = cvc;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public double getCurrentAmount() {
        return currentAmount;
    }
    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCard baseCard = (BaseCard) o;
        return cvc == baseCard.cvc && Objects.equals(cardNumber, baseCard.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvc, cardNumber);
    }
}
