import org.gradle.api.DefaultTask;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskAction;

/**
 * Created by trumpets on 5/6/17.
 */
public class JavaTestPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("golemtestis", TestTask.class);
    }
}


