class shape {
    private int heigth;
    private int breath;
    private int radious;
    private int length;

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }

    public int getRadious() {
        return radious;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

}

class rectangle extends shape {

    public int area(int length, int breath) {
        return length * breath;
    }
}
/*class circle extends shape {
    public int area(int radious)
    {
          
    }
}*/
    

public class inheritance {
    public static void main(String[] args) {
        rectangle rectanglw1 = new rectangle();

        rectanglw1.setLength(45);
        rectanglw1.setBreath(65);

        int area = rectanglw1.area(45, 65);
        System.out.println(area);
        int area2 = rectanglw1.area(10, 10);
        System.out.println(area2);

    }

}
