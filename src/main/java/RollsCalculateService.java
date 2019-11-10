public class RollsCalculateService {

    public int numberOfPanels(int perimeter, int rollWidth) {
        int number = perimeter / rollWidth;
        if (number * rollWidth != perimeter) {
            number++;
        }

        return number;
    }

    public int panelsInRoll(int roomHeight, int rollLength) {
        int stock = 10;
        return rollLength / (roomHeight + stock);
    }

    public int rollsNumber(int roomPanels, int rollPanels) {
        int number = roomPanels / rollPanels;
        if (number * rollPanels != roomPanels) {
            number++;
        }

        return number;
    }

}
