import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

/**
 * Created by trumpets on 5/6/17.
 */
public class TestTask extends DefaultTask {

    @TaskAction
    void doStuff() {
        System.out.println("This is me, the test");
    }
}
