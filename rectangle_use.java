public class rectangle_use {
    public static void main(String[] args) {
        rectangle r1= new rectangle();
        System.out.println(r1.length +"  "+ r1.width);
    }
}
class rectangle {
    int length;
    int width;

    
    // To calculate area of a rectangle
    int area(){
        return length*width;
    }
} 
