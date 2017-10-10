import javax.swing.*;
import java.awt.*;

public class FractalStar extends JPanel {

    public static void drawFractalStar(Graphics g, int xCenter, int yCenter , int boundingDim){
        //g.setColor(new Color(g.getColor().getRGB()+0x233333));
        g.setColor(new Color(g.getColor().getRGB()));

        int side = boundingDim/2;

        if (side<1)return;

        int left = xCenter - side/2;
        int top = yCenter - side/2;
        int bottom = yCenter + side/2;
        int right = xCenter + side/2;

        drawFractalStar(g, left, top, side);
        drawFractalStar(g, left, bottom, side);
        drawFractalStar(g, right, bottom, side);
        drawFractalStar(g, right, top, side);

        g.fillRect(left, top, right-left, bottom-top);
    }

}
