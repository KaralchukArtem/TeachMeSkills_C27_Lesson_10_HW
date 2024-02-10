package com.teachmeskills.lesson10.service;

import com.teachmeskills.lesson10.model.BaseCard;
import com.teachmeskills.lesson10.model.impl.client.Client;

import java.util.ArrayList;

public class WalletOperationService {

    public void showCard(ArrayList<BaseCard> wallet) {
        for (BaseCard agr : wallet)
            System.out.println(agr.toString());
    }

    public void searchForTheSameCards(ArrayList<BaseCard> wallet) {
        int count = 0;
        boolean[] booleans = new boolean[wallet.size()];
        for (boolean agr : booleans) {
            agr = false;
        }
        for (int i = 0; i < wallet.size(); i++) {
            for (int j = i + 1; j < wallet.size(); j++) {
                if (wallet.get(i).equals(wallet.get(j))) {
                    booleans[i] = true;
                    booleans[j] = true;
                }
            }
        }
        for (boolean agr : booleans) {
            if (agr) count++;
        }
        System.out.println("У вас - " + count + " одинаковых карт");
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
