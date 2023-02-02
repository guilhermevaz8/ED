class Rectangle{
    
    Point a, b;

    Rectangle(int x1,int y1,int x2,int y2){
        a = new Point(x1,y1);
        b = new Point(x2,y2);
    }

    Rectangle(Point p1, Point p2){
        a=p1;
        b=p2;
    }
    
    public int area(){
        int comprimento= b.y-a.y;
        int largura=b.x-a.x;
        int area=comprimento*largura;
        return area;}
       
    int perimeter(){
        int comprimento=b.y-a.y;
        int largura=b.x-a.x;
        int perimetro= comprimento+comprimento+largura+largura;
        return perimetro;
    }
    
    boolean pointInside(Point p){
        if(p.x>=a.x && p.x<=b.x){
            if (p.y>=a.y && p.y<=b.y)
                return true;}
        return false;
        }
    
        boolean rectangleInside(Rectangle r){
        if(r.a.x>=this.a.x && r.a.x<=this.b.x){
            if(r.a.y>=this.a.y && r.b.y<=this.b.y)
                return true;
        }
        return false;
    }
}
    

