//contains useful math things

package helper;

public class MathStuff {
    final double PHI = 1.61803398875;

    public static double radToDeg(double radians) {
        return radians * (180 / Math.PI);
    }

    public static double degToRad(double degrees) {
        return degrees * (Math.PI / 180);
    }
}
