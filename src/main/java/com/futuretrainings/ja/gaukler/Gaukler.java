package com.futuretrainings.ja.gaukler;

public class Gaukler {
    /**
     * Anzahl möglicher Besucher
     */
    private int anzahl = 5;
    /**
     * Speichert die Referenzen auf die Zuschauer-Objekte
     */
    private Zuschauer[] zuschauer = new Zuschauer[anzahl];
    /**
     * Index, der dabei hilft, über das Zuschauerarray zu adressieren
     */
    private int arrayIndex = 0;

    /**
     * Fügt dem Zuschauer-Array einen Zuschauer hinzu.
     * @param besucher Ein Objekt vom Typ Zuschauer
     */
    public void addObserver(Zuschauer besucher)
    {
        if(arrayIndex < zuschauer.length)
        {
            zuschauer[arrayIndex] = besucher;
            arrayIndex++;
            System.out.println(besucher + " wurde registriert.");
        }
        else
            System.out.println(besucher + " wurde nicht registriert.");
    }

    /**
     * Löscht alle Zuschauer
     */
    public void deleteObservers()
    {
        zuschauer = new Zuschauer[5];
    }

    /**
     * Löscht einen einzelnen Zuschauer
     */
    public void deleteObserver(Zuschauer pZuschauer)
    {
        for(int i = 0; i < anzahl; i++)
        {
            if(zuschauer[i] == pZuschauer)
            {
                zuschauer[i] = null;
                System.out.println(pZuschauer + " hat sich de-registriert");
                return;
            }
        }
    }

    /**
     * Informiert alle Zuschauer, dass eine Aktion beendet wurde
     */
    public void notifyObserver()
    {
        for(Zuschauer temp: zuschauer)
        {
            if(temp != null)
                temp.update(null);
        }
    }
}
