package ss4_oop.practice;

public class Rectangle {
    float width;
    float height;
    public Rectangle(){
    }
    public Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }
    public float getArea(){
        return this.height*this.width;
    }
    public float getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String display(){
        return "Rectangle have width: " + this.width + "height: " + this.height;
    }
}

