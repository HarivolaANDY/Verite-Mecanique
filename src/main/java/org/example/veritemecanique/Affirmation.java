package org.example.veritemecanique;

public class Affirmation {
    private int id;
    private final String statement;
    private Boolean isTrue;

    public Affirmation(int id, String statement, Boolean isTrue) {
        this.id = id;
        this.statement = statement;
        this.isTrue = isTrue;
    }
}
