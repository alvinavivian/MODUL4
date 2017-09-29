/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM;
public class Rect {
public int x1,y1,x2,y2;
public Rect (int x1,x2,y1,y2){
    this.x1=x1;
    this.y1=y1;
    this.x2=x2;
    this.y2=y2;
    
    public Rect(int width,int height){
        this(0,0,width,height);
    }
}
}
