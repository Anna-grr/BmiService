public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 48;
        double height = 1.57;
        double bmi = service.calculate(48, 1.57);
        System.out.println(bmi);
    }
}
