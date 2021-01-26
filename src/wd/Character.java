package wd;

public class Character {
    public int dexterity; //ловкость
    public int force; //сила
    public int build; //телосложение
    public int mana; //мана
    public int intelligence; //интеллект
    public String name;

    public Character (String name) {
        this.name = name;
        dexterity = 0; //ловкость
        force = 0; //сила
        build = 0; //телосложение
        mana = 0; //мана
        intelligence = 0; //интеллект
    }
}
