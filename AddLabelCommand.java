public class AddLabelCommand implements Command {
    private VideoEditor videoEditor;
    private String text;
    public AddLabelCommand(VideoEditor videoEditor, String text) {
        this.videoEditor = videoEditor;
        this.text = text;
    }
    public void execute() {
        videoEditor.setText(text);
    }
    public void undo() {
        videoEditor.removeText();
    } 
}
