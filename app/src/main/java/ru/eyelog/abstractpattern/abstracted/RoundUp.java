package ru.eyelog.abstractpattern.abstracted;

public class RoundUp extends AbstractRound {

    @Override
    public String roundIt() {
        int out = Integer.parseInt(stTemp.substring(0, stTemp.length()-1)) * 10 + 10;
        return String.valueOf(out);
    }
}
