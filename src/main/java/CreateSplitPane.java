import javax.swing.*;

public class CreateSplitPane extends JSplitPane{

    public CreateSplitPane() {
        setOneTouchExpandable(true);
        setAutoscrolls(true);
        setLeftComponent(new CreateScrollTree());

    }
}
