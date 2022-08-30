public class Triunghi extends Shape {

    private int base;
    private int height;

    public Triunghi(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triunghi(String text, String material, int base, int height) {
        super(text, material);
        this.base = base;
        this.height = height;
    }

    public void displayTriangleHeight() {
        System.out.println("Triangle height is: " + this.height);
    }

    @Override
    public double getSize() {
        return (this.base * this.height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle: height is " + this.height + ", base is: " + this.base +
                ", made of glass, contains the text: I reflect light";
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

        Triunghi personObj = (Triunghi) obj;
        if (super.equals(personObj) &&
                this.base == personObj.base &&
                this.height == personObj.height)
        {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int prime = 31;
        int result = super.hashCode();
        result = prime * result + this.height;
        result = prime * result + this.base;
        return result;
    }
}
