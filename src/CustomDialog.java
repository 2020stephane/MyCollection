






import javax.swing.*;
import java.awt.*;

public class CustomDialog  extends JDialog {

	private static final long serialVersionUID = 1L;
	JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();

    JTextField Index = new JTextField();
    JTextField Object = new JTextField();

    JLabel labelI = new JLabel("index");
    JLabel labelO = new JLabel("object");

    JButton btnAdd = new JButton();
    JButton btnRemove = new JButton();
    JButton btnGet = new JButton();
    JButton btnRAZ = new JButton();

    GridLayout gridLayout1 = new GridLayout();

    /**
     * CustomDialog :Initialize a new dialog.
     *
     * @param owner instance of the main window
     * @param titre title of the dialog
     * @param modal if false,dialog box does not block any other window while it is visible.
     */
    public CustomDialog(Frame owner,String titre,Boolean modal) {

        super(owner, titre, modal);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(600, 300, 400, 200);

        Index.setEditable(true);
        Index.setText("");
        Index.setBounds(new Rectangle(60, 60, 50, 21));
        Object.setEditable(true);
        Object.setText("");
        Object.setBounds(new Rectangle(60, 90, 50, 21));
        btnAdd.setText("ADD");
        btnRemove.setText("REMOVE");
        btnGet.setText("GET");
        btnRAZ.setText("CLEAR");

        jPanel2.setLayout(gridLayout1);
        gridLayout1.setRows(4);
        gridLayout1.setColumns(1);
        gridLayout1.setVgap(15);
        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);
        labelI.setHorizontalAlignment(SwingConstants.RIGHT);
        labelI.setText("index");
        labelI.setBounds(new Rectangle(0, 60, 50, 17));
        labelO.setHorizontalAlignment(SwingConstants.RIGHT);
        labelO.setText("Object");
        labelO.setBounds(new Rectangle(0, 90, 50, 17));

        jPanel1.add(labelI, null);
        jPanel1.add(Index, null);
        jPanel1.add(labelO, null);
        jPanel1.add(Object, null);

        jPanel2.add(btnAdd, null);
        jPanel2.add(btnRemove, null);
        jPanel2.add(btnGet, null);
        jPanel2.add(btnRAZ, null);

        this.getContentPane().add(jPanel2,  BorderLayout.EAST);
        this.getContentPane().add(jPanel1,  BorderLayout.CENTER);

        btnAdd.addActionListener(e -> {
            int index = Integer.parseInt(Index.getText());
            Integer o = Integer.parseInt(Object.getText());
            ListMenu.tabInt.add(index,o);
            MyPanel.output2.append("tabInt.add("+ index + "," + o + ");" + "\n");
            for (int i = 0; i < ListMenu.tabInt.size(); i++) {
                MyPanel.output.append("index: " + i + ", value: " + ListMenu.tabInt.get(i) + "\n");
            }
        });
        btnGet.addActionListener(e -> {
            int i = Integer.parseInt(Index.getText());
            MyPanel.output2.append("tabInt.get("+ i +");" + "\n");
            MyPanel.output.append("index: " + i + ", value: " + ListMenu.tabInt.get(i) + "\n");
        });
        btnRemove.addActionListener(e -> {
            int index = Integer.parseInt(Index.getText());
            ListMenu.tabInt.remove(index);
            MyPanel.output2.append("tabInt.remove(" + index + ");" + "\n");
            for (int i = 0; i < ListMenu.tabInt.size(); i++) {
                MyPanel.output.append("index: " + i + ", value: " + ListMenu.tabInt.get(i) + "\n");
            }
        });
        btnRAZ.addActionListener(e -> {
            Index.setText("");
            Object.setText("");
        });
    }
}