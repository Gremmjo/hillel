package edu.hillel.hw5;


import java.util.Objects;

public class ListArrayCreator {

    private Student[] students;
    private Class type;
    private int size;
    private int freeSize;

    public ListArrayCreator(int size) {
        this(size, Student.class);
    }

    public ListArrayCreator(int size, Class clazz) {
        if (size > 0) {
            this.size = size;
        } else {
            this.students = new Student[0];
            IllegalArgumentException e = new IllegalArgumentException("Argument can not be less than or equal to 0.");
            throw e;
        }

        if (clazz == null || !Student.class.isAssignableFrom(clazz)) {
            IllegalArgumentException e = new IllegalArgumentException("The argument can not be null or not of type Student.");
            throw e;
        }
        this.students = new Student[size];
        this.freeSize = size;
        this.type = clazz;
    }


    public int getSize() {

        return size;
    }


    public int getFreeSize() {
        return freeSize;
    }


    public Class getTypeOfListArray() {
        return type;
    }


    public Student getStudAtListArr(int index) {
        if (checkIndex(index)) return students[index];
        return null;
    }


    public boolean insertStudToListArr(Student student, int index) {
        checkIndex(index);
        if (student != null) {
            if (type.isInstance(student)) {
                if (students[index] == null) {
                    students[index] = student;
                    freeSize--;

                    return true;
                }
            } else {
                IllegalArgumentException e = new IllegalArgumentException("the type of the value being passed is incompatible" +
                        " with the type stored by the rack.");
                throw e;
            }
        } else {
            StudentValidationException e = new StudentValidationException("Rack.insertDevToSlot", student);
            throw e;
        }

        return false;
    }


    public Student removeStudFromListArr(int index) {
        checkIndex(index);
        if (students[index] != null) {
            Student temp = students[index];
            students[index] = null;
            return temp;
        } else {
            System.err.println("Can't remove from empty slot " + index);
            return null;
        }
    }


    public boolean checkIndex(int index) {
        if (index >= 0 && index < size) {
            return true;
        } else {
            IndexOutOfBoundsException e = new IndexOutOfBoundsException("Index must be from 0 to " + size + "; current index = " + index);
            throw e;
        }
    }


    public void getListStudFromFac(String faculty) {
        for (Student student : students) {
            if (Objects.equals(student.getFaculty(), faculty)) {
                System.out.println("id: " + student.getId() + ", name: " + student.getName() + ", surname: " + student.getSurname()
                        + ", faculty: " + faculty);
            }
        }
    }

    public void getListStudFromAllFacAndGroup() {
        for (Student student : students) {
            if (student.getFaculty() != null && student.getCourse() != null) {
                System.out.println("id: " + student.getId() + ", name: " + student.getName() + ", surname: " + student.getSurname()
                        + ", faculty: " + student.getFaculty() + ", course: " + student.getCourse());
            }
        }
    }

    public void getListStudWichBornAfterYear(int year){
        for (Student student : students){
            if(student.getDateOfBirth().getYear() > year){
                System.out.println("id: " + student.getId() + ", name: " + student.getName() + ", surname: " + student.getSurname()
                + ", dateOfBirth: " + student.getDateOfBirth());
            }
        }

    }

    public void getListOfGroup (String group){
        for (Student student : students){
            if(student.getGroup().equalsIgnoreCase(group)){
                System.out.println("id: " + student.getId() + ", name: " + student.getName() + ", surname: " + student.getSurname()
                        + ", dateOfBirth: " + student.getDateOfBirth() + ", faculty: " + student.getFaculty() + ", course: " + student.getCourse()
                + ", group: " + student.getGroup());
            }
        }
    }
}



