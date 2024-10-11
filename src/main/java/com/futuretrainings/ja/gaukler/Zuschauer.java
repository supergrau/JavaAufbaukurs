package com.futuretrainings.ja.gaukler;

public interface Zuschauer {
    /**
     * Methode wird aufgerufen, wenn der Gaukler eine Aktion beendet hat.
     * @param aktion Die gerade beendetet Aktion
     */
    void update(Object aktion);
}
