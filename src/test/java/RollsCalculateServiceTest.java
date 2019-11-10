import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RollsCalculateServiceTest {

    @Test
    void numberOfPanels1() {
        RollsCalculateService service = new RollsCalculateService();
        int perimeter = 2200;
        int rollWidth = 106;
        int result = service.numberOfPanels(perimeter, rollWidth);
        assertEquals(21, result);
    }
    @Test
    void numberOfPanels2() {
        RollsCalculateService service = new RollsCalculateService();
        int perimeter = 2000;
        int rollWidth = 100;
        int result = service.numberOfPanels(perimeter, rollWidth);
        assertEquals(20, result);
    }

    @Test
    void panelsInRoll() {
        RollsCalculateService service = new RollsCalculateService();
        int roomHeigh = 275;
        int rollLength = 1000;
        int result = service.panelsInRoll(roomHeigh, rollLength);
        assertEquals(3, result);
    }

    @Test
    void rollsNumber1() {
        int perimeter = 2200;
        int rollWidth = 106;
        int roomHeigh = 275;
        int rollLength = 1000;
        RollsCalculateService service = new RollsCalculateService();
        int panelsNumber=service.numberOfPanels(perimeter,rollWidth);
        int panelsInRoll=service.panelsInRoll(roomHeigh,rollLength);
        int result = service.rollsNumber(panelsNumber, panelsInRoll);
        assertEquals(7, result);
    }
    @Test
    void rollsNumber2() {
        int perimeter = 2100;
        int rollWidth = 100;
        int roomHeigh = 190;
        int rollLength = 1000;
        RollsCalculateService service = new RollsCalculateService();
        int panelsNumber=service.numberOfPanels(perimeter,rollWidth);
        int panelsInRoll=service.panelsInRoll(roomHeigh,rollLength);
        int result = service.rollsNumber(panelsNumber, panelsInRoll);
        assertEquals(5, result);
    }

}