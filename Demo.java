public class Demo {
    public static void main(String[] args){
        VideoEditor videoEditor = new VideoEditor();
        CommandManager commandManager = new CommandManager();

        // set text command
        AddLabelCommand setTextCommand = new AddLabelCommand(videoEditor, "First Command");
        commandManager.executeCommand(setTextCommand);
        System.out.println(videoEditor); // VideoEditor{contrast=0.5, text='First Command'}

        // set contrast command
        ChangeContrastCommand setContrastCommand = new ChangeContrastCommand(videoEditor, 0.8f);
        commandManager.executeCommand(setContrastCommand);
        System.out.println(videoEditor); // VideoEditor{contrast=0.8, text='First Command'}

        // undo the last command
        commandManager.undo();
        System.out.println(videoEditor); // VideoEditor{contrast=0.5, text='First Command'}

        // undo the previous command
        commandManager.undo();
        System.out.println(videoEditor); // VideoEditor{contrast=0.5, text=''}
    }
}
