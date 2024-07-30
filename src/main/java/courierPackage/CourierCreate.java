package courier;

public class CourierCreate {
    public static Courier getCourier() {
        return new Courier("Lola", "12345", "Olga");
    }

    public static Courier getCourierWithLogin() {
        return new Courier("Lola", "", "");
    }

    public static Courier getCourierWithPassword() {
        return new Courier("", "test", "");
    }

    public static Courier getCourierWithSimilarLogin() {
        return new Courier("Lola", "12345", "Olga");
    }
}
