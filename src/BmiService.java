public class BmiService {
    public double calculate(double weight_kg, double height_cm) {

        double heightS = height_cm * height_cm;

        return weight_kg / heightS;

    }

}
