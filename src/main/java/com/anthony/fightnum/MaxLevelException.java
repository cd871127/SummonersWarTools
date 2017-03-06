package com.anthony.fightnum;

/**
 * Created by CHENDONG239 on 2017-03-06.
 */
public class MaxLevelException extends Exception {
    public MaxLevelException() {
        super("current level is out of range!");
    }
}
