public class BonusMilesService {
    public int calculate(int price) {
        int deliver = 20_00; // за каждые 20 рублей в копейках
        int miles = price / deliver;
        return miles;
    }
}
