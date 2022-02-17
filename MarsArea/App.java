package io.hexlet;

class App {
    public static void main(String[] args) {
        var marsRadius = 3390;
        var surfaceOfMars = SurfaceCalculator.surfaceArea(marsRadius);
        System.out.println(surfaceOfMars);
    }
}
