package ru.eyelog.abstractpattern.abstracted;

public class RoundDown extends AbstractRound {

    @Override
    public String roundIt() {
        int out = Integer.parseInt(stTemp.substring(0, stTemp.length()-1)) * 10;
        return String.valueOf(out);
    }
}
