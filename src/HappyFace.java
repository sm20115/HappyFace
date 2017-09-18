import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Font;
public class HappyFace extends JApplet {
    public void paint(Graphics canvas){
        /*
        //canvas.drawLine(500,250,750,250);
        canvas.drawOval(500,250,500,500); // x,y(location), (width,height(in terms of x,y)
        canvas.drawArc(650,400,200,300,200,140);
        canvas.fillOval(625,380,50,50);
        canvas.fillOval(825,380,50,50);
        Font font = new Font(Font.SANS_SERIF, Font.ITALIC, 50);
        canvas.setFont(font);
        canvas.drawString("Hello World!",500,250);*/
        canvas.drawLine(300,300,800,300);//horizontal line 1
        canvas.drawLine(300,500,800,500);//horizontal line 2
        canvas.drawLine(450,150,450,650);//vertical line 1
        canvas.drawLine(650,150,650,650);//vertical line 2
        //circles

        canvas.drawOval(325,350,100,100);//circle 1
        canvas.drawOval(705,350,100,100);//circle 2
        canvas.drawOval(705,175,100,100);//circle 3

        //crosses
        canvas.drawLine(325,225,400,285);//xp1-1
        canvas.drawLine(325,285,400,225);//xp2-1

        canvas.drawLine(515,385,590,445);//xp1-2
        canvas.drawLine(515,445,590,385);//xp2-2

        canvas.drawLine(705,550,780,610);//xp1-3
        canvas.drawLine(705,610,780,550);//xp1-3

        //strikethrough
        canvas.drawLine(315,175,775,615);
    }
}