public class OOPS {
    public static void main (String args[]){
        Pen p1 = new Pen(); //created a object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setColor("red");
        System.out.println(p1.color);
    }
}

class Pen {
    //prop + fun

    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }

}