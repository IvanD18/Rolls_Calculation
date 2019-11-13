public class Main {
    public static void main(String[] args) {
        int perimeter=2200;
        int rollWidth=106;
        int roomHeight=275;
        int rollLength=1000;
        RollsCalculateService service = new RollsCalculateService();
        int rollsCount = service.rollsNumber(perimeter,rollWidth, roomHeight,rollLength);
        System.out.println(rollsCount);

    }
}
