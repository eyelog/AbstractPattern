package ru.eyelog.abstractpattern.classic;

class RoundClass {

    private final static int FLEX_VALUE = 5;

    RoundClass() {
    }

    // Тут простая логика.
    int roundDexUp(String val){
        return Integer.parseInt(val.substring(0, val.length()-1)) * 10 + 10;
    }

    int roundDexDown(String val){
        return Integer.parseInt(val.substring(0, val.length()-1)) * 10;
    }

    int roundDexFlex(String val){
        int tempTail = Integer.parseInt(val.substring(val.length()-1));
        int out;

        if(tempTail>0&&tempTail<FLEX_VALUE){
            out = Integer.parseInt(val.substring(0, val.length()-1)) * 10;
        }else if(tempTail>=FLEX_VALUE&&tempTail<=9){
            out = Integer.parseInt(val.substring(0, val.length()-1)) * 10 + 10;
        }else {
            // if 0
            out = Integer.parseInt(val);
        }

        return out;
    }
}
