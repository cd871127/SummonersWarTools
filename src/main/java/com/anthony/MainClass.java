package com.anthony;

import com.anthony.fightnum.FightNum;


/**
 * Created by CHENDONG239 on 2017-03-06.
 */
public class MainClass {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String inputStr=scanner.nextLine();
//        System.out.println(inputStr);
//        int star, int curLevel, int curExp, int fightExp
        String inputStr = "2,1,0,2552";
        String param[] = inputStr.split(",");
        int star = Integer.valueOf(param[0]);
        int curLevel = Integer.valueOf(param[1]);
        int curExp = Integer.valueOf(param[2]);
        int fightExp = Integer.valueOf(param[3]);

        int res = FightNum.getFightNum(star, curLevel, curExp, fightExp);
        System.out.println(res);
    }
}
