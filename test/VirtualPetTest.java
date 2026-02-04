import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VirtualPetTest {
    VirtualPet gus;

    @BeforeEach
    void setup(){
        gus = new VirtualPet("Gus");
        assertEquals(0, gus.getEnergyLevel(),"Energy starts at 0");
        assertEquals(0,gus.getHappinessLevel(),"Happiness starts at 0");
    }

    @Test
    @DisplayName("Constructor sets name correctly")
    void testConstructorSetsName() {
        assertEquals("Gus", gus.getName());
    }

    @org.junit.jupiter.api.Test
    void feed() {
        gus.feed();
        assertEquals(1, gus.getEnergyLevel(),"Energy should now be 1");
    }

    @org.junit.jupiter.api.Test
    void play() {
    }

    @org.junit.jupiter.api.Test
    void updateStatus() {
    }

    @org.junit.jupiter.api.Test
    void getName() {
    }

    @org.junit.jupiter.api.Test
    void getEnergyLevel() {
    }

    @org.junit.jupiter.api.Test
    void getHappinessLevel() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}