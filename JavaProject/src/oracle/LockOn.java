package oracle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
public class LockOn {
    //This code show you how to on Capslock,Numlock and ScrollLock using JavaCode
    //Using this you can also use many other keys of Keyboard in Java
    public boolean capsLock(boolean cp) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        tk.setLockingKeyState(KeyEvent.VK_CAPS_LOCK, cp);
        return true;
    }
    public boolean numLock(boolean np) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        tk.setLockingKeyState(KeyEvent.VK_NUM_LOCK, np);
        return true;
    }
    public boolean scrollLock(boolean sp) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        tk.setLockingKeyState(KeyEvent.VK_SCROLL_LOCK, sp);
        return true;
    }
//This method on all three buttons
    public boolean onAllKeys() {
        return capsLock(true) & numLock(true) & scrollLock(true);
    }
    //This method off all three buttons
    public boolean offAllKeys() {
        return capsLock(false) & numLock(false) & scrollLock(false);
    }
    public static void main(String[] args) {
        LockOn lc = new LockOn();
        //this is an infinite loop that will make all 3 buttons contineous on-off
       // lc.onAllKeys();
        lc.offAllKeys();
    }
}
