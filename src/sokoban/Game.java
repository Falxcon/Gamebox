package sokoban;

import java.io.Serializable;
import java.util.List;

/*
* @author Tom Wittal
* */

//ein Objekt dieser Klasse enthält alle zum Speichern notwendigen Informaionen
public class Game implements Serializable{
    List<Level> levels;
    int currentLevel;
    String name;

    Game(String name, int currentLevel, List<Level> levels){
        this.levels = levels;
        this.currentLevel = currentLevel;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
