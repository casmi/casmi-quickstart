package sample;

import casmi.Applet;
import casmi.AppletRunner;
import casmi.KeyEvent;
import casmi.Keyboard;
import casmi.Mouse;
import casmi.MouseButton;
import casmi.MouseEvent;
import casmi.graphics.color.Color;
import casmi.graphics.color.RGBColor;
import casmi.graphics.element.Rect;

/**
 * casmi main class.
 */
public class App extends Applet {

    private Rect r;
    private Color c = new RGBColor("#0572B9");

    @Override
    public void setup() {
        setSize(1024, 768);
        setFPS(30);

        // create rect element, set size, position and fill color,
        r = new Rect(320, 240);
        r.setPosition(512, 384);
        r.setFillColor(c);

        // add rect to rendering object tree
        addObject(r);
    }

    @Override
    public void update() {
        long value = System.currentTimeMillis();

        // rotate rect
        double rot = value % (360 * 100);
        r.setRotation(rot / 100.0, 1.0, 2.0, 1.0);

        // blink rect
        c.setAlpha((Math.sin(value / 400.0) + 1.0) / 2.0);
        r.setFillColor(c);
    }

    @Override
    public void exit() {
        // Implement here.
    }

    @Override
    public void mouseEvent(MouseEvent event, MouseButton button, Mouse mouse) {
        // Implement here.
    }

    @Override
    public void keyEvent(KeyEvent event, Keyboard keyboard) {
        if (event == KeyEvent.PRESSED) {
            if (keyboard.getKeyCode() == 27) {  // if pressed ESC
                close();
            }
        }
    }

    public static void main(String[] args) {
        AppletRunner.run("sample.App", "This is a sample quick start project");
    }
}