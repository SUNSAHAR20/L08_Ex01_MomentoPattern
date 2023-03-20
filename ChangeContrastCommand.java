public class ChangeContrastCommand implements Command {
    private VideoEditor videoEditor;
    private float contrast;
    private float prevContrast;
    public ChangeContrastCommand(VideoEditor videoEditor, float contrast) {
        this.videoEditor = videoEditor;
        this.contrast = contrast;
    }
    public void execute() {
        prevContrast = videoEditor.getContrast();
        videoEditor.setContrast(contrast);
    }
    public void undo() {
        videoEditor.setContrast(prevContrast);
    } 
}
