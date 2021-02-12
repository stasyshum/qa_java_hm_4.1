public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000_00;//стоимость билета в копейках
        int miles = service.calculate(price);
        System.out.println("Ваши бонусные мили " + miles);
    }
}
