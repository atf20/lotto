package org.kkywalk2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("구입금액을 입력해 주세요.");

        //구매금액만큼 반복구입후, 출력하는 코드
        LottoMachine lottoMachine = new LottoMachine();
        lottoMachine.purchaseLotto(scanner.nextInt());
        lottoMachine.printLotto();

        System.out.print("\n");
        System.out.println("지난주 당첨번호를 입력해 주세요.");

        //당첨번호를 구입했던 번호들과 비교하는 코드
        ArrayList<Integer> winNumbers = new ArrayList<Integer>();      
        for(int i = 0; i <= 5; i++)
        {
            winNumbers.add(scanner.nextInt());
            /* 입력시 한줄에 ","  표시 방법 모르겠음
            if(i != 5)
            {
                System.out.print(", ");
            } 
            */
        }
        System.out.print("\n");
        scanner.close();
        lottoMachine.confirmLotto(winNumbers);


    }
}