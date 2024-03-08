package btap1;

abstract class Shape {
    private String color;
    private double borderThickness;
    public Shape() {
    }

    public Shape(String color, double borderThickness) {
        this.color = color;
        this.borderThickness = borderThickness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBorderThickness() {
        return borderThickness;
    }

    public void setBorderThickness(int borderThickness) {
        this.borderThickness = borderThickness;
    }

    public abstract double area();

    public abstract double perimeter();

}
