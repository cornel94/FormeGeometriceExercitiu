public class Shape {

    private String text;
    private String material;

    public Shape(){
    }

    public Shape(String text, String material){
        this.text = text;
        this.material = material;
    }

    public double getSize(){
        return -1;
    }

    @Override
    public String toString() {
        return "made of plastic, contains the text: Math is easy.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null){
            return false;
        }

        if (this.getClass() != obj.getClass()){
            return false;
        }

        Shape personObj = (Shape) obj;
        if (this.text.equals(personObj.text) &&
        this.material.equals(personObj.material)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((material == null) ? 0 : material.hashCode());
        return result;
    }
}
