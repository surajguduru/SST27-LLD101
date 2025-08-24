public class Rectangle implements Polygon {
    protected int w,h;
    void setWidth(int w){ this.w = w; }
    void setHeight(int h){ this.h = h; }
    public double getArea(){ return w*h; }
    public double getPerimeter(){ return 2*(w+h); }
}