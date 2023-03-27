import java.awt.*;
import java.awt.event.*;

class menu extends Frame
{
  MenuBar Mybar=new MenuBar();
  Menu myMenu=new Menu("File");
  MenuItem o=new MenuItem("Open");
  MenuItem s=new MenuItem("Save");
  MenuItem e=new MenuItem("Exit");
  menu()
  {
    setVisible(true);
    setForeground(Color.green);
    setBackground(Color.black);
    setSize(500,500);
    myMenu.add(o);
    myMenu.add(s);
    myMenu.add(e);
    Mybar.add(myMenu);
    setMenuBar(Mybar);
  }
}
class eat
{
  public static void main(String arg[])
  {
    menu m=new menu();
  }
}
