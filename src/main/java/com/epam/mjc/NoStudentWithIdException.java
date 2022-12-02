package com.epam.mjc;

public class NoStudentWithIdException extends IllegalArgumentException {

    public NoStudentWithIdException (long id) {
        super("Could not find student with ID " + id);
    }

}
