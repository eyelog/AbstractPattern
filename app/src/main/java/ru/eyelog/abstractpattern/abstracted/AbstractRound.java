package ru.eyelog.abstractpattern.abstracted;

public abstract class AbstractRound {

    final static int FLEX_VALUE = 5;

    String val;
    int tempTail;

    // Притаскиваем сюда данные и применяем к местным переменным
    void setValues(String val){
        this.val = val;
        tempTail = Integer.parseInt(val.substring(val.length()-1));
    }

    // Этим методом пользуемся в классах наследниках.
    abstract public String roundIt();
}
