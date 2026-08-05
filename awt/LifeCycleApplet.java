import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/* 
<applet code="LifeCycleApplet" width=300 height=200>
</applet>
*/

public class LifeCycleApplet extends Applet {

    // Initialization method
    public void init() {
        System.out.println("init() method called");
        setBackground(Color.YELLOW); // Set background color
    }

    // Start method
    public void start() {
        System.out.println("start() method called");
    }

    // Paint method to draw content
    public void paint(Graphics g) {
        System.out.println("paint() method called");
        g.drawString("Hello, Applet!", 50, 100);
    }

    // Stop method
    public void stop() {
        System.out.println("stop() method called");
    }

    // Destroy method
    public void destroy() {
        System.out.println("destroy() method called");
    }
}
