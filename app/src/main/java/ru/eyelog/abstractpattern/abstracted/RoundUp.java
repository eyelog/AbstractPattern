package ru.eyelog.abstractpattern.abstracted;

public class RoundUp extends AbstractRound {

    @Override
    public String roundIt() {
        int out = Integer.parseInt(val.substring(0, val.length()-1)) * 10 + 10;
        return String.valueOf(out);
    }
}
