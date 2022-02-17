package io.hexlet;

class SurfaceCalculator {
    public static int surfaceArea(int radius) {
        var surface = 4 * Math.PI * MyMath.square(radius);
        return (int) surface;
    }
}
