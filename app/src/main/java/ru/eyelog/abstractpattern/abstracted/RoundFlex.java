package ru.eyelog.abstractpattern.abstracted;

public class RoundFlex extends AbstractRound {

    @Override
    public String roundIt() {
        int out;

        if(tempTail>0&&tempTail<FLEX_VALUE){
            out = Integer.parseInt(val.substring(0, val.length()-1)) * 10;
        }else if(tempTail>=FLEX_VALUE&&tempTail<=9){
            out = Integer.parseInt(val.substring(0, val.length()-1)) * 10 + 10;
        }else {
            // if 0
            out = Integer.parseInt(val);
        }

        return String.valueOf(out);
    }
}
