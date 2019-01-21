package ru.eyelog.abstractpattern.abstracted;

public class RoundDown extends AbstractRound {

    @Override
    public String roundIt() {
        int out = Integer.parseInt(val.substring(0, val.length()-1)) * 10;
        return String.valueOf(out);
    }
}
