package wd;

public class Situation {
    Situation[] direction;
    String subject;
    String text;
    int ddexterity; //ловкость
    int dforce; //сила
    int dbuild; //телосложение
    int dmana; //мана
    int dintelligence;

    public Situation(String subject, String text, int variants, int dd, int df, int db, int dm, int di) {
        this.subject = subject;
        this.text = text;
        ddexterity = dd;
        dforce = df;
        dbuild = db;
        dmana = dm;
        dintelligence = di;
        direction = new Situation[variants];
    }
}


