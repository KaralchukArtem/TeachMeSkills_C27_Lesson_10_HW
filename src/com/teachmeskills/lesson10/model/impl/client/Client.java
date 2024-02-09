package com.teachmeskills.lesson10.model.impl.client;

import com.teachmeskills.lesson10.model.BaseCard;

import java.util.ArrayList;
import com.teachmeskills.lesson10.fabric.WalletFabric;
import com.teachmeskills.lesson10.service.WalletOperationService;

public class Client{

    private String name;
    private int age;
    private String contry;
    private ArrayList<BaseCard> wallet = new ArrayList<>();
    private WalletOperationService walletOperationService = new WalletOperationService();

    public Client(String name, int age, String contry) {
        this.name = name;
        this.age = age;
        this.contry = contry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }
    public ArrayList<BaseCard> getWallet() {
        return wallet;
    }
    public void setWallet(int count) {
        WalletFabric walletFabric = new WalletFabric();
        this.wallet.add(walletFabric.createCard(count));
    }
    public void showCard(ArrayList<BaseCard> wallet){
        if(wallet.size() > 0 ){
            walletOperationService.showCard(wallet);
        }else {
            System.out.println("У вас нет карт в кошельке");
        }
    }
    public void searchForTheSameCards(ArrayList<BaseCard> wallet){
        walletOperationService.searchForTheSameCards(wallet);
    }

    public void switchCard(Client client,int count){
        walletOperationService.switchCard(client,count);
    }
}
