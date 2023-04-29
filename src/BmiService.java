public class BmiService {
    public double calculate(double weightKg, double heightCm) {

        double heightS = heightCm * heightCm;

        return weightKg / heightS;

    }

}
