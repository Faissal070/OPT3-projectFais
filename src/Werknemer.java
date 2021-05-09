import java.util.ArrayList;

class Werknemer {
    private String naam;
    private Integer code;
    private static Integer geboortedatum;
    public static Integer Newcode = 1987;
    public static ArrayList<Werknemer> werknemers = new ArrayList<>();

    public Werknemer(String naam, Integer geboortedatum, Integer code) {
        this.naam = naam;
        this.geboortedatum = geboortedatum;
        this.code = code;
    }

    public String toString() {
        return this.naam + "-" + this.code;
    }

    public String getNaam() {
        return this.naam;

    }

    public Integer getGeboortedatum() {
        return geboortedatum;
    }

    public Integer getCode() {
        return this.code;
    }

    public static Integer getNewCode() {
        Newcode += 87;
        return Newcode;
    }

    public void Medewerkersopslaan() {
        Werknemer naam1 = new Werknemer("Lisa", 1263, 209);
        werknemers.add(naam1);
        Werknemer naam2 = new Werknemer("Test", 0601, 1976);
        werknemers.add(naam2);
        Werknemer naam3 = new Werknemer("Olaf", 0206, 1999);
        werknemers.add(naam3);
        Werknemer naam4 = new Werknemer("Diderik", 1209, 2008);
        werknemers.add(naam4);

    }
}