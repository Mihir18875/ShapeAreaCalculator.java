package com.calculator.model;

public class Circle implements Shape {
    private final double radius;
    public Circle(double radius) { this.radius = radius; }
    @Override public double calculateArea() { return Math.PI * radius * radius; }
    @Override public String getShapeName() { return "Circle"; }
}