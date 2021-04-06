package edu.hillel.hw6.phoneapp.model;

public interface AbonentArray {

    int getSize();
    int getFreeSize();
    Class getArrayType();
    Abonent getAbonentAtArr(int index);
    boolean insertAbonentToArr(Abonent abonent, int index);
    Abonent removeAbonentFromArr(int index);


}
