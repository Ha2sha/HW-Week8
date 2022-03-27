package homework8;

public class P16Point {
    int x;//instance variable
    int y;//instance variable

    //Constructor with zero args
    P16Point() {
    }

    //parameterised constructor
    P16Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int a){
        this.x=a;
    }
    public void setY(int b){
        this.y=b;
    }
    public double distance(){
        return distance(0, 0);
    }
    public double distance(int x,int y){

        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
    public double distance(P16Point secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {
        P16Point first = new P16Point(6, 5);
        P16Point second = new P16Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        P16Point point = new P16Point();
        System.out.println("distance()= " + point.distance());
    }
}
