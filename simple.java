import java.awt.*;
import java.awt.event.*;
class TestForms extends Frame implements ActionListener
{
  Label l2;
  String str;
  TestForms()
  {
    setVisible(true);
    setSize(600,400);
    setBackground(Color.pink);
    setForeground(Color.red);
    Label l1=new Label("Login Name");
    TextField txt=new TextField("Enter Login Name");
    txt.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e1)
      {
        str=txt.getText();
      }
    });
    Button b=new Button("Submit");
    b.addActionListener(this);
    Checkbox c=new Checkbox("Married");
    Choice ch=new Choice();
    ch.add("Abu Dhabi");
    ch.add("Dubai");
    ch.add("Sharjah");
    ch.add("Ajman");
    ch.add("Fujairah");
    ch.add("RAK");
    ch.add("UAQ");
    l2=new Label();
    l2.setBounds(70,70,250,20);
    add(l1);
    add(txt);
    add(b);
    add(c);
    add(ch);
    add(l2);
    this.setLayout(new FlowLayout());
  }
  public void actionPerformed(ActionEvent e)
  {
    l2.setText(str);
    this.setBackground(Color.cyan);
  }

}
class simple
{
  public static void main(String arg[])
  {
    TestForms t=new TestForms();
  }
}
