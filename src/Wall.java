public class Wall {
    /**
     * Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
     */
    double width;
    double height;
    double area;

    /**
     * The class needs to have two constructors. The first constructor does not have any parameters (no-arg  constructor).
     * The second constructor has parameters width and height of type double and it needs to  initialize the fields.
     * In case the width is less than 0 it needs to set the width field value to 0, in case the  height parameter is less than 0 it needs to set the height field value to 0.
     */
    public Wall() {

    }

    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    /**
     * Write the following methods (instance methods):
     * Method named getWidth without any parameters, it needs to return the value of width field.
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Method named getHeight without any parameters, it needs to return the value of height field.
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Method named setWidth with one parameter of type double, it needs to set the value of the width field.
     * If the parameter is less than 0 it needs to set the width field value to 0.
     */
    public void setWidth(double widthValue) {
        if (widthValue < 0) {
            this.width = 0;
        } else {
            this.width = widthValue;
        }
    }

    /**
     * Method named setHeight with one parameter of type double, it needs to set the value of the  height field.
     * If the parameter is less than 0 it needs to set the height field value to 0.
     */
    public void setHeight(double heightValue) {
        if (heightValue < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    /**
     * Method named getArea without any parameters, it needs to return the area of the wall.
     */
    public double getArea() {
        this.area = this.width * this.height;
        return this.area;
    }

    public static void main(String[] args) {

        Wall wall = new Wall(5, 4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());


    }

}