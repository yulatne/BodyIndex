public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
    double weight = 54;
    double height = 1.7;
    double BodyMassIndex = service.calculate(weight, height);
    System.out.println(BodyMassIndex);
}
}

