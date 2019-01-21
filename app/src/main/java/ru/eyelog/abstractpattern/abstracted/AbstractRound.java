package ru.eyelog.abstractpattern.abstracted;

public abstract class AbstractRound {

    final static int FLEX_VALUE = 5;

    int val;
    String stTemp;
    int tempTail;

    void setValues(int val){
        this.val = val;
        stTemp = String.valueOf(val);
        tempTail = Integer.parseInt(stTemp.substring(stTemp.length()-1));
    }

    abstract public String roundIt();
}
