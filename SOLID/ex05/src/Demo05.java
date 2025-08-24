
public class Demo05 {
    static double areaAfterResize(Rectangle r){
        r.setWidth(5); r.setHeight(4); return r.getArea();
    }
    static double areaAfterResize(Square s){
        s.setSide(4); return s.getArea();
    }
    public static void main(String[] args) {
        System.out.println(areaAfterResize(new Rectangle())); // 20
        System.out.println(areaAfterResize(new Square())); // 16
    }
}
