public class Gravity {
    public static void main(String[] args) {
        final double gravity = 9.8;
        int time = 23;
         
        double height = 0.5 * gravity * time * time;
        double velocity = gravity * time;

        System.out.println("Cliff Height (meters): " + height);
        System.out.println("Ball Velocity (meters/sceond): " + velocity);
    }
}
