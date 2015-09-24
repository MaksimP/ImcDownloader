package imcdownloader.Veiw;

import javax.swing.*;
import java.awt.*;

public class LineStatusCreate extends JPanel {

    JLabel statusLine;

    public LineStatusCreate() {

        setPreferredSize(new Dimension(1080, 23));
        setLayout(new BorderLayout());
        statusLine = new JLabel();
        statusLine.setPreferredSize(new Dimension(500, 23));
        add(statusLine, BorderLayout.WEST);
    }

    public JLabel getStatusLine() {
        return statusLine;
    }
}
