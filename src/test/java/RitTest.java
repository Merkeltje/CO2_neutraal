import Rit.Rit;
import Voertuig.Voertuig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RitTest {
    @BeforeEach
    public void SetUp(){
        Voertuig Auto = new Voertuig("Auto", 001, 1.1);
        Voertuig Fiets = new Voertuig("Fiets", 002, 2.0);
        Voertuig Lopend = new Voertuig("Lopen", 003, 2.0);
        Voertuig OpenbaarVervoer = new Voertuig("OpenbaarVervoer", 004, 1.5);
        Voertuig Scooter = new Voertuig("Scooter", 005, 1.2);
        Voertuig.AlleVoertuigen.add(Auto);
        Voertuig.AlleVoertuigen.add(Fiets);
        Voertuig.AlleVoertuigen.add(Lopend);
        Voertuig.AlleVoertuigen.add(OpenbaarVervoer);
        Voertuig.AlleVoertuigen.add(Scooter);
    }

    @Test
    @DisplayName("HOI")
    public void RitPuntenBerkenen(){
        Rit TestRit = new Rit(10.0, "Auto");
        TestRit.PuntenRit();
        double expectedresult = 11.0;
        assertEquals(expectedresult, TestRit.PuntenRit());
    }
}
