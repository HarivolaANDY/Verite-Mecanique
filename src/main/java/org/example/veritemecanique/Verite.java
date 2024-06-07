package org.example.veritemecanique;

import lombok.Getter;

@Getter
public final class Verite extends Affirmation {
    private final Boolean isTrue;

    public Verite(int id, String statement, Boolean isTrue) {
        super(id, statement);
        this.isTrue = isTrue;
    }
}
