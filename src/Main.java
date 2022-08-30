import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {

        /*Triunghi t1 = new Triunghi("dreptunghic","metal",10,5);
        Triunghi t2 = new Triunghi("dreptunghic","metal",10,5);
        Triunghi t3 = t1;

        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
        t1.displayTriangleHeight();
        System.out.println(t1.getSize());
        System.out.println(t1.toString());
        System.out.println(t1.hashCode());
        System.out.println(t3.hashCode());

        Rectangle r1 = new Rectangle("drept","metal", 20,5);
        Rectangle r2 = new Rectangle("drept","metal", 20,5);
        Rectangle r3 = new Rectangle("drept","plastic", 20,5);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        r1.displayRectangleHeight();
        System.out.println(r1.getSize());
        System.out.println(r1.toString());
        System.out.println(r1.hashCode());*/

        Triunghi t1 = new Triunghi("dreptunghic","metal",10,5);
        Triunghi t2 = new Triunghi("dreptunghic","metal",20,5);
        Rectangle r1 = new Rectangle("drept","metal", 10,7);
        Rectangle r2 = new Rectangle("drept","metal", 20,7);
        Shape s1 = t1;
        Shape s2 = new Shape("patrat","plastic");

        ArrayList<Shape> formeGeometrice = new ArrayList<Shape>();
        formeGeometrice.add(t1);
        formeGeometrice.add(t2);
        formeGeometrice.add(r1);
        formeGeometrice.add(r2);
        formeGeometrice.add(s1);
        formeGeometrice.add(s2);

        for (int i = 0; i < formeGeometrice.size(); i++){
            System.out.println(formeGeometrice.get(i).toString());
        }

        for (int i = 0; i < formeGeometrice.size(); i++){
            System.out.println(formeGeometrice.get(i).getSize());
        }

        for (int i = 0; i < formeGeometrice.size(); i++){
            if (formeGeometrice.get(i) instanceof Triunghi){
                Triunghi newTriunghi = (Triunghi) formeGeometrice.get(i);
                newTriunghi.displayTriangleHeight();
            } else if (formeGeometrice.get(i) instanceof Rectangle){
                Rectangle newRectangle = (Rectangle) formeGeometrice.get(i);
                newRectangle.displayRectangleHeight();
            }
        }
    }
}
