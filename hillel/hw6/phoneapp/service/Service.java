package edu.hillel.hw6.phoneapp.service;

import edu.hillel.hw6.phoneapp.model.Abonent;

public interface Service {

    Abonent[] createDefaultArr();
    void abWichTimeExceeds(Abonent[] abonents, int cityCallTime);
    void abWichUseInterCom(Abonent[] abonents);
    void abAlphSort(Abonent[] abonents);
    void selectSubWithMaxTraff(Abonent[] abonents);


}
