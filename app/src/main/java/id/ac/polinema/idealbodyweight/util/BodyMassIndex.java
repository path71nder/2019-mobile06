package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {
    public static final int MALE = 0;
    public static final int FEMALE = 1;

    private int gender;
    private int height;
    private float index;

    public BodyMassIndex(int gender, int height) {
        this.gender = gender;
        this.height = height;
        this.index = calculate();
    }

    private float calculate() {
        switch (gender){
            case MALE: return (height - 100) - ((height - 100) * 0.1f);
            case FEMALE: return (height - 100) + ((height - 100) * 0.15f);
            default:return 0f;
        }
    }
}
