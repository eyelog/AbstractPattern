package ru.eyelog.abstractpattern.classic;

public class RoundClass {

    private final static int FLEX_VALUE = 5;

    public RoundClass() {
    }

    public int roundDexUp(int val){
        String stTemp = String.valueOf(val);
        int out = Integer.parseInt(stTemp.substring(0, stTemp.length()-1)) * 10 + 10;
        return out;
    }

    public int roundDexDown(int val){
        String stTemp = String.valueOf(val);
        int out = Integer.parseInt(stTemp.substring(0, stTemp.length()-1)) * 10;
        return out;
    }

    public int roundDexFlex(int val){
        String stTemp = String.valueOf(val);
        int tempTail = Integer.parseInt(stTemp.substring(stTemp.length()-1));
        int out;

        if(tempTail>0&&tempTail<FLEX_VALUE){
            out = Integer.parseInt(stTemp.substring(0, stTemp.length()-1)) * 10;
        }else if(tempTail>=FLEX_VALUE&&tempTail<=9){
            out = Integer.parseInt(stTemp.substring(0, stTemp.length()-1)) * 10 + 10;
        }else {
            // if 0
            out = val;
        }

        return out;
    }
}
