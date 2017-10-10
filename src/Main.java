import javax.swing.*;
import java.awt.*;

public class Main {
    static class HannoTest{
        public static void main(String[] args) {
            Hanno hanno = new Hanno();
            hanno.start(15,true);
        }
    }

    static class OctTest{
        public static void main(String[] args) {
            OctOutputer.output(29,2);
        }
    }

    static class FractalStarTest{
        public static void main(String[] args) {
            JFrame panel = new JFrame();
            panel.setSize(1920,1080);
            panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            panel.setVisible(true);
            JPanel frame = new FractalStar(){

                @Override
                public void paint(Graphics g) {
                    super.paint(g);
                    Graphics graphics = this.getGraphics();
                    g.setColor(new Color(0x66ccff));
//                    FractalStar.drawFractalStar(g,panel.getWidth()/2 ,panel.getHeight()/2,panel.getWidth()/2);
//                    FractalStar.drawFractalStar(g,panel.getWidth()/2 ,panel.getHeight()/2,panel.getHeight());
//                    FractalStar.drawFractalStar(g,this.getWidth()/2 ,this.getHeight()/2,this.getWidth()-2);
                    FractalStar.drawFractalStar(g,this.getWidth()/2 ,this.getHeight()/2,this.getHeight()-2);
                }

            };
            frame.setSize(panel.getSize());
            frame.setBackground(new Color(0x233333));
            panel.add(frame);
        }
    }
}
