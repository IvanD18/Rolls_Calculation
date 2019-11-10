public class Main {
    public static void main(String[] args) {
        int perimeter=2200;
        int rollWidth=106;
        int roomHeigh=275;
        int rollLength=1000;
        RollsCalculateService service = new RollsCalculateService();
        int panelsNumber=service.numberOfPanels(perimeter,rollWidth);
        int panelsInRoll=service.panelsInRoll(roomHeigh,rollLength);
        int rollsCount = service.rollsNumber(panelsNumber, panelsInRoll);
        System.out.println(panelsNumber);
        System.out.println(panelsInRoll);
        System.out.println(rollsCount);

    }
}
