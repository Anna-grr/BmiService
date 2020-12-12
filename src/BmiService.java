public class BmiService {
    public double calculate (int weight, double height) {
        double bmi = weight / (height * height);
        System.out.printf("%.1f\n", bmi);
        return bmi;
    }
}
