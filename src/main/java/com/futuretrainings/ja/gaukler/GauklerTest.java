package com.futuretrainings.ja.gaukler;

public class GauklerTest {
    public static void main(String[] args)
    {
        Gaukler gaukler = new Gaukler();
        Zuschauer fritz = new Marktbesucher("Fritz");
        Zuschauer franz = new Marktbesucher("Franz");
        Marktbesucher frieda = new Marktbesucher("Frieda");
        Marktbesucher hans = new Marktbesucher("Hans");
        Marktbesucher heinz = new Marktbesucher("Heinz");
        Marktbesucher hanna = new Marktbesucher("Hanna");

        // erwartet: kann sich registrieren
        gaukler.addObserver(fritz);
        gaukler.addObserver(franz);
        gaukler.addObserver(frieda);
        gaukler.addObserver(hans);
        gaukler.addObserver(heinz);
        // erwartet: kann sich nicht registrieren
        gaukler.addObserver(hanna);

        System.out.println("\nJetzt wird der Gaukler ein Kunststück vorführen");
        // Aktionen durchführen
        // erwartet: alle registrierten Zuschauer werden informiert
        gaukler.notifyObserver();

        // einen Besucher de-registrieren
        // erwartet: Franz de-registriert sich selbst
        gaukler.deleteObserver(franz);

        System.out.println("\nJetzt wird der Gaukler noch ein Kunststück vorführen");
        // Aktionen durchführen
        // erwartet: alle außer Franz werden informiert
        gaukler.notifyObserver();

    }
}
