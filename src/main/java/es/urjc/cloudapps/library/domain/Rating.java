package es.urjc.cloudapps.library.domain;

import es.urjc.cloudapps.library.exception.FieldFormatException;

public class Rating {

    private final int value;

    public Rating(int value) {
        if (value < 0 || value > 5)
            throw new FieldFormatException("La puntuación debe estar entre 0 y 5");
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
