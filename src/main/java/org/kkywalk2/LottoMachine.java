package org.kkywalk2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMachine{

    int coinMoney;
    int countPurchase;
    static final int EACH_PRICE = 1000;

    ArrayList<LottoNumber> lottoNumbers = new ArrayList<LottoNumber>();
    ArrayList<Integer> winNumbers;
    
    public LottoMachine (){

    }

    public void purchaseLotto(int coinMoney)
    {
        this.coinMoney = coinMoney;
        this.countPurchase = this.coinMoney / EACH_PRICE;
        System.out.println( countPurchase + "개를 구매했습니다.");

        //로또 한줄짜리 클래스 만들고, 리스트형태로 생성, countPurchase 개수만큼
        for(int i = 0; i < countPurchase; i++)
        {
            lottoNumbers.add(new LottoNumber());
        }
    }
    
    public void printLotto()
    {
        for (LottoNumber iLottoNumber : lottoNumbers)
        {
            iLottoNumber.printSixNumbers();
            System.out.print("\n");
        }
    }

    public void confirmLotto(ArrayList<Integer> winNumbers)
    {
        this.winNumbers = winNumbers;

        //당첨숫자 개수별 횟수 저장하는 부분
        int[] matchCountArray = new int[6];
        for (LottoNumber iLottoNumber : lottoNumbers)
        {
            //당첨 가능한 최대 경우 수(1~6: 6개)만큼 사이즈 갖는 배열([0~5]: 6개) 만들어, 인덱스([0~5])별 누적치 계산
            int matchIndex = 0;//사용할 인덱스 변수 초기화
            for(int i = 0; i < winNumbers.size(); i++)
            {
                //한 라인의 앞에 6개까지 숫자만 검사한다,
                ArrayList<Integer> sixNumbers = new ArrayList<Integer>();
                for(int n = 0; n < 6; n++)
                {
                    sixNumbers.add(iLottoNumber.allNumbers.get(n));
                }
                if(sixNumbers.contains(this.winNumbers.get(i)))
                {
                    matchIndex++;//당첨숫자 포함되어 있을때 마다, 인덱스 증가
                }
                sixNumbers = null;// 중간과정 사용된 리스트의 메모리 해제
            }
            if(matchIndex != 0)
            {
                matchCountArray[matchIndex-1]++;//해당 인덱스에 위치한 값이 라인마다 누적
            }
        }


        //당첨숫자 3개 이상부터 출력하는 부분
        System.out.print("당첨 통계\n");
        System.out.print("---------\n");
        System.out.print("3개 일치(5000원)-" + matchCountArray[2] +"\n");
        System.out.print("4개 일치(50000원)-" + matchCountArray[3] +"\n");
        System.out.print("5개 일치(1500000원)-" + matchCountArray[4] +"\n");
        System.out.print("6개 일치(2000000000원)-" + matchCountArray[5] +"\n");
        int sumWinMoney = 5000 * matchCountArray[2] + 50000 * matchCountArray[3] + 1500000 * matchCountArray[4] + 2000000000 * matchCountArray[5];
        float ratioGain = sumWinMoney / (float)this.coinMoney;
        System.out.print("총 수익률은 " + String.format("%.2f", ratioGain) + "입니다." +"\n");

    }




}