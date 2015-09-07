import javax.swing.*;

public class SplitPanelCreate extends JSplitPane{

    public SplitPanelCreate() {
        setOneTouchExpandable(true);
        setAutoscrolls(true);
        setLeftComponent(new ScrollTreePanelCreate());

    }
}
