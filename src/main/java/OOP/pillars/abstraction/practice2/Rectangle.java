package OOP.pillars.abstraction.practice2;

import OOP.pillars.abstraction.practice2.Shape;

public class Rectangle extends Shape {

        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }


        @Override
        public double computeArea() {
            return height * width;
        }
    }

