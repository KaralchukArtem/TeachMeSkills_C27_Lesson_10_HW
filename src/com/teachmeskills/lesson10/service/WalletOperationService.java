package com.teachmeskills.lesson10.service;

import com.teachmeskills.lesson10.model.BaseCard;
import com.teachmeskills.lesson10.model.impl.client.Client;

import java.util.ArrayList;
import java.util.Objects;

public class WalletOperationService {

    public void showCard(ArrayList<BaseCard> wallet) {
        for (BaseCard agr : wallet)
            System.out.println(agr.toString());
        System.out.println("");
    }

    public void searchForTheSameCards(ArrayList<BaseCard> wallet) {
        int count = 0;
        for (int i = 0; i < wallet.size(); i++) {
            for (int j = i + 1; j < wallet.size(); j++) {
                if (wallet.get(i).equals(wallet.get(j))) {
                    count++;
                    System.out.println(count);
                }
            }
            if (Objects.equals(count, wallet.size() - 1)) {
                count++;
                break;
            }
        }
        System.out.println(count);
    }

    public void switchCard(Client client, int count) {
        switch (count) {
            case 1:
                client.setWallet(count);
                break;
            case 2:
                client.setWallet(count);
                break;
            case 3:
                client.setWallet(count);
                break;
        }
    }
}
