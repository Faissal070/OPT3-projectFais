import java.util.ArrayList;

class Werkkracht {
    private String naam;
    private Integer code;
    private Integer bsn;
    private Integer telefoonnummer;
    public static Integer Newcode = 1987;
    public static ArrayList<Werkkracht> werknemers = new ArrayList<>();

    public Werkkracht(String naam, Integer code, Integer telefoonnummer, Integer bsn) {
        this.naam = naam;
        this.code = code;
        this.telefoonnummer = telefoonnummer;
        this.bsn = bsn;
    }

    public String toString() {
        return this.naam + "-" + this.code;
    }

    public String getNaam() {
        return this.naam;
    }
    public Integer getBsn(){
        return this.bsn;

    }
    public Integer getTelefoonnummer(){
        return this.telefoonnummer;
    }

    public Integer getCode() {
        return this.code;
    }

    public static Integer getNewCode() {
        Newcode += 87;
        return Newcode;
    }
}