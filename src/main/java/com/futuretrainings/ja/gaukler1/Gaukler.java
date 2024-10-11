package com.futuretrainings.ja.gaukler1;

import java.util.Observable;

public class Gaukler extends Observable {
    public void jonglieren()
    {
        System.out.println("Ich habe jongliert");
        setChanged();
        notifyObservers();
    }
}
