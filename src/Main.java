import com.teachmeskills.lesson10.model.BaseCard;
import com.teachmeskills.lesson10.model.impl.client.Client;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Client client = new Client("tema", 21, "Minsk");
        ArrayList<BaseCard> wallet = client.getWallet();

        client.showCard(wallet);
        boolean t = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Если хотите добавить карту нажмите 1, нет - 2");
            switch (scanner.nextInt()) {
                case 1: {
                    System.out.println("Выбирите карту 1,2,3");
                    client.switchCard(client, scanner.nextInt());
                    break;
                }
                case 2: {
                    client.showCard(wallet);
                    client.searchForTheSameCards(wallet);
                    t = false;
                }
            }
        } while (t);
    }
}