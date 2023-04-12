package OOP.pillars.abstraction;

public class Circle extends Shape{
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double computeArea() {
            return radius * radius * Math.PI;
        }
}
