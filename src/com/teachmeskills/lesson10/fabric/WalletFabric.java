package com.teachmeskills.lesson10.fabric;

import com.teachmeskills.lesson10.model.BaseCard;
import com.teachmeskills.lesson10.model.impl.card.BelCard;
import com.teachmeskills.lesson10.model.impl.card.MasterCard;
import com.teachmeskills.lesson10.model.impl.card.VisaCard;

public class WalletFabric {
        public BaseCard createCard(int count){
            switch (count){
                case 1: return new BelCard(1111,"123",0);
                case 2: return new MasterCard(2222,"345",0);
                case 3: return new VisaCard(3333,"567",0);
            }
            return null;
        }
}
