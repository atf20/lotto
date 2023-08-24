package org.kkywalk2;

import java.util.ArrayList;
import java.util.Collections;

public class LottoNumber {
    
    ArrayList<Integer> allNumbers = new ArrayList<Integer>();

    public LottoNumber()
    {
        //45개 숫자 만들어 순서 섞는다.
        for(int num = 1; num <= 45; num++)
        {
            allNumbers.add(num);
        }
        Collections.shuffle(allNumbers);

        //앞에서 6개까지만 따로 저장하고, 오름차순 정렬 한다
        ArrayList<Integer> sixNumbers = new ArrayList<Integer>();
        for(int i = 0; i <= 5; i++)
        {
            sixNumbers.add(allNumbers.get(i));
        }
        Collections.sort(sixNumbers);

        //그 결과를 원래 리스트의 앞에서 6개까지 대체시킨다.
        for(int i = 0; i <= 5; i++)
        {
            allNumbers.set(i, sixNumbers.get(i));
        }
        sixNumbers = null;// 중간과정 사용된 리스트(sixNumbers)의 메모리 해제
    }

    public void printSixNumbers()
    {
        //원래 리스트의 앞에서 6개까지만 출력한다.
        System.out.print("[");
        for(int i = 0; i < 6; i++)
        {
            System.out.print(allNumbers.get(i).toString());
            if(i == 5)
            {
                System.out.print("]");
            }
            else
            {
                System.out.print(", ");
            }
        }

    }

}
