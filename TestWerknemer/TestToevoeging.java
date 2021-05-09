
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestToevoeging {
    @Test
        public void Testwerknemeraanmaken(){
            String naam = "Diderik";
            Integer code = 2009;
            Integer geboortedatum = 1207;
            Werknemer aanmaken1 = new Werknemer(naam,geboortedatum,code);
            Werknemer.werknemers.add(aanmaken1);
            Assertions.assertTrue(Werknemer.werknemers.size() == 1);
    }
}
