package CLASSES;

class box {
double width;
double height;
double depth;
}
public class boxdemo {
public static void main(String[] args) {
    box myBox1 = new box();
double vol;
myBox1.depth = 20;
myBox1.height = 40;
myBox1.width = 60;

vol = myBox1.depth * myBox1.height * myBox1.width;
System.out.println("volume is" + vol); 
} 
}