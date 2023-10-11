public class MathCalc {
    public static void main(String[] args) throws Exception {
        double radius = 0.0;
        double circleArea = 100.0;
        int feet = 0;
        int inches = 0;
        radius = Math.sqrt(circleArea / Math.PI);
        feet = (int) Math.floor(radius);
        inches = (int) Math.round(12.0 * (radius - feet));

        System.out.println("The radius of a circle with area "
                + circleArea + " square feet is\n " + feet + " feet " + inches + "inches");

        double earth = 7600;
        double sun = 865000;

        System.out.println("The volume of the Earth is " + calcVolume(earth / 2)
                + " cubic miles, the volume of the sun is " + calcVolume(sun / 2)
                + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is "
                + (calcVolume(sun / 2) / calcVolume(earth / 2)));
    }

    private static double calcVolume(double radius) {
        return 4 * Math.PI * (Math.pow(radius, 3) / 3);
    }

}
