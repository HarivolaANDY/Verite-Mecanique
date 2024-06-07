package org.example.veritemecanique;

public sealed abstract class Affirmation permits Verite{
    protected int id;
    private final String statement;


    public Affirmation(int id, String statement) {
        this.id = id;
        this.statement = statement;
    }
}
