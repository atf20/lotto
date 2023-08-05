package org.kkywalk2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMachine{

    int coinMoney;
    int countPurchase;
    static final int EACH_PRICE = 1000;

    ArrayList<LottoNumber> lottoNumberlist = new ArrayList<LottoNumber>();
    
    public LottoMachine (){

    }

    public void purchaseLotto()
    {
        System.out.println("구입금액을 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);
        this.coinMoney = scanner.nextInt();
        this.countPurchase = this.coinMoney / EACH_PRICE;
        System.out.println( countPurchase + "개를 구매했습니다.");

        //로또 한줄짜리 클래스 만들고, 리스트형태로 생성, countPurchase 개수만큼
        for(int i = 0; i < countPurchase; i++)
        {
            lottoNumberlist.add(new LottoNumber());
        }
    }
    
    public void printLotto()
    {
        for (LottoNumber iLottoNumber : lottoNumberlist)
        {
            iLottoNumber.printSixNumbers();
            System.out.print("\n");
        }
    }

}