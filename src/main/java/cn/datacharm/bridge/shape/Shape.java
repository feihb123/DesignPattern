package cn.datacharm.bridge.shape;

import java.awt.Graphics;

/**
 *
 * @author hjx
 */
public abstract class Shape {
    Brush brush;
    
    public void setBrush(Brush brush){
       this.brush = brush;
    }
    
    public abstract void draw(Graphics graphics);
}
