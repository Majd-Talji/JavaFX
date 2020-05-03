package _02_Tools_Basic._17_ProgressIndicator._04_Thread;

import javafx.concurrent.Task;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class LoginTask extends Task<Boolean>{

    @Override
    protected Boolean call() throws Exception {
        
        Thread.sleep(3000);
        
        updateProgress(1, 1);
        
        return true;

    }
    
}
