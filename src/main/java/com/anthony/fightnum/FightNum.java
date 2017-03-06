package com.anthony.fightnum;

/**
 * Created by CHENDONG239 on 2017-03-06.
 * 计算魔灵需要战斗次数
 */
public class FightNum {
    public static int getFightNum(int star, int curLevel, int curExp, int fightExp) {
        curExp += LevelUpExp.toCurLevelExp(star, curLevel);
        int leftExp = LevelUpExp.totalExp[star - 1] - curExp;
        return leftExp / fightExp + 1;
    }
}
