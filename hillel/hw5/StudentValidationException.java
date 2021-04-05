package edu.hillel.hw5;

public class StudentValidationException extends RuntimeException{

        Student student;
        protected static final String DEFAULT_MESSAGE = "Student is not valid for operation";
        public Student getDevice (){

            return student;
        }
        public StudentValidationException(){
            super();
        }
        public StudentValidationException(String operation){
            super(operation != null ? (DEFAULT_MESSAGE + " " + operation) : (DEFAULT_MESSAGE));
        }
        public StudentValidationException(String operation, Student student){
            this(operation);
            this.student = student;
        }

    }
