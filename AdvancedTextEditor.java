
package Francine;

public class AdvancedTextEditor extends TextEditor {
    public AdvancedTextEditor(String initialText) {
        super(initialText);
    }

   
    public void append(String additionalText) {
        setText(getText() + additionalText);
    }
}
