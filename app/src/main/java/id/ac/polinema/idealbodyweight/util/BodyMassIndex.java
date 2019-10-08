package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {
    public static final int MALE = 0;
    public static final int FEMALE = 1;

    private float mass;
    private float height;
    private float index;

    public BodyMassIndex(float mass, float height) {
        this.mass = mass;
        this.height = height;
        this.calculate();
    }

    public String BMIRange(){
        String res = "";
        if (this.index < 18.50){
            res = "Underweight";
        }
        else if (this.index >= 18.50 && this.index <= 24.99){
            res = "Healthy weight";
        }
        else {
            res = "Overweight";
        }
        return res;
    }

    private void calculate() {
        this.index = this.mass / (this.height * this.height);
    }
}
