package oop;

public class Rect {
    private int width;
    private int height;

    public int getHeight() {
        return height;
    }
    public int getWidth(){
        return width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public Rect (int width, int height){
        this.width = width;
        this.height = height;
    }
    public Rect(){

    }
}
