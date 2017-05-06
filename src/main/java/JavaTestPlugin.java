import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by trumpets on 5/6/17.
 */
public class JavaTestPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("test", TestTask.class);
    }
}
