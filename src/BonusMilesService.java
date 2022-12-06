public class BonusMilesService {
    public int calculate(int price) {

        int mile = price / 20;
        System.out.println("Зачисленно - " + mile + " новых миль.");

        return price;
    }
}
