package proxy;

/**
 * Created by domagoj on 10/26/16.
 */
public class ProxyTest {
    public static void main (String args[]) {
        CommandExecutor executor = new CommandExecutorProxy("Domi","domi");

        try {
            executor.runCommand("ls -l");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
