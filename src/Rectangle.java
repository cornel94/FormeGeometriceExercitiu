public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String text, String material, int width, int height){
        super(text,material);
        this.width = width;
        this.height = height;
    }

    public void displayRectangleHeight(){
        System.out.println("Rectangle height is: " + this.height);
    }

    @Override
    public double getSize() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Rectangle: height is " + this.height + ", width is: " + this.width +
                ", made of steel, contains the text: Yellow rectangle.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Rectangle rectangleObj = (Rectangle) obj;
        if (super.equals(rectangleObj) &&
                this.width == rectangleObj.width &&
                this.height == rectangleObj.height)
        {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int prime = 31;
        int result = super.hashCode();
        result = prime * result + this.width;
        result = prime * result + this.height;
        return result;
    }
}
