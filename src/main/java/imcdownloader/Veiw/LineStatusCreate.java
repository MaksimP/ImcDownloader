package imcdownloader.Veiw;

import javax.swing.*;
import java.awt.*;

public class LineStatusCreate extends JPanel {

    JLabel stutusLine;

    public LineStatusCreate() {

        setPreferredSize(new Dimension(1080, 23));
        setLayout(new BorderLayout());
        stutusLine = new JLabel();
        stutusLine.setPreferredSize(new Dimension(500, 23));
        add(stutusLine, BorderLayout.WEST);
    }

    public JLabel getStutusLine() {
        return stutusLine;
    }
}
