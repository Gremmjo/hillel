package edu.hillel.hw5;

import java.time.LocalDate;

public class MainTest {

    public static void main(String[] args) {

        ListArrayCreator array = new ListArrayCreator(12);

        Student st1 = new Student(1,"Alex","Gordienko", "Valerievich",
                LocalDate.of(1998,3, 9), "Ilfa Petrova 12, 21"
               , 984364261L, "IT", 2, "KA - 21"  );
        Student st2 = new Student(2,"Konstantin","Nyamsty", "Evgenievich",
                LocalDate.of(1999,1, 21), "Vorobieva 3, 1b"
               , 684358061L, "IT", 1, "KA - 11"  );
        Student st3 = new Student(3,"Nikolay","Verbetskiy", "Ivanovich",
                LocalDate.of(1997,7, 10), "Jukova 17, 104"
               , 693377012L, "Marketing", 3, "M - 31"  );
        Student st4 = new Student(4,"Valeriy","Ryashencev", "Petrovich",
                LocalDate.of(1998,12, 1), "Govorova 4, 21a"
               , 6999234125L, "IT", 2, "KA - 21"  );
        Student st5 = new Student(5,"Alex","Kirilovskiy", "Alexeevich",
                LocalDate.of(1998,11, 5), "Glushko 25, 1"
               , 9123762145L, "IT", 2, "KA - 21"  );
        Student st6 = new Student(6,"Sergey","Belodonov", "Olegovich",
                LocalDate.of(1997,6, 19), "Ilfa Petrova 1, 42"
               , 6911225590L, "IT", 2, "KA - 21"  );
        Student st7 = new Student(7,"Vadim","Vernigorov", "Igorevich",
                LocalDate.of(1998,9, 29), "Koroleva 12, 1b"
                , 6833311199L, "IT", 1, "KA - 11"  );
        Student st8 = new Student(8,"Ivan","Iliechev", "Dmitrievich",
                LocalDate.of(1999,9, 9), "Levitana 21, 2a"
                , 9212478659L, "IT", 1, "KA - 11"  );
        Student st9 = new Student(9,"Valeriya","Tihonova", "Alexandrovna",
                LocalDate.of(1998,3, 9), "Zabolotnogo 1, 12a"
                , 612385311L, "IT", 1, "KA - 11"  );
        Student st10 = new Student(10,"Maria","Sokyrenko", "Sergeevna",
                LocalDate.of(1997,11, 5), "Glushko 29, 1a"
                , 988421341L, "Marketing", 3, "M - 31");
        Student st11 = new Student(11,"Roman","Gaydavaka", "Olegovich",
                LocalDate.of(1996,4, 24), "Levitana 118, 2b"
                , 792132188L, "Marketing", 3, "M - 31");
        Student st12 = new Student(12,"Elena","Sidorenko", "Sergeevna",
                LocalDate.of(1998,8, 11), "Eliseva 21, 1a "
                , 912425673L, "Marketing", 3, "M - 31");



        array.insertStudToListArr(st1,0);
        array.insertStudToListArr(st2,1);
        array.insertStudToListArr(st3,2);
        array.insertStudToListArr(st4,3);
        array.insertStudToListArr(st5,4);
        array.insertStudToListArr(st6,5);
        array.insertStudToListArr(st7,6);
        array.insertStudToListArr(st8,7);
        array.insertStudToListArr(st9,8);
        array.insertStudToListArr(st10,9);
        array.insertStudToListArr(st11,10);
        array.insertStudToListArr(st12,11);

        array.getListStudFromFac("IT");
        //array.getListStudFromFac("Marketing");

        System.out.println();
        System.out.println("....................................................................");
        System.out.println();

        array.getListStudFromAllFacAndGroup();

        System.out.println();
        System.out.println("....................................................................");
        System.out.println();

        array.getListStudWichBornAfterYear(1997);

        System.out.println();
        System.out.println("....................................................................");
        System.out.println();


        array.getListOfGroup("KA - 21");

    }
}
