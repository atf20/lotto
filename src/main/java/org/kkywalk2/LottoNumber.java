package org.kkywalk2;

import java.util.ArrayList;
import java.util.Collections;

public class LottoNumber {
    
    ArrayList<Integer> allNumbersList = new ArrayList<Integer>();
    ArrayList<Integer> sixNumbersList = new ArrayList<Integer>();
    public LottoNumber()
    {
        for(int num = 1; num <= 45; num++)
        {
            allNumbersList.add(num);
        }
        Collections.shuffle(allNumbersList);
        for(int i = 0; i <= 5; i++)
        {
            sixNumbersList.add(allNumbersList.get(i));
        }
        Collections.sort(sixNumbersList);
    }

    public void printSixNumbers()
    {
        System.out.print("[");
        for(int i = 0; i < sixNumbersList.size(); i++)
        {
            System.out.print(sixNumbersList.get(i).toString());
            if(i == (sixNumbersList.size()-1))
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
