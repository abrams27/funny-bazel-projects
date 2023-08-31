import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.Instant;

public class JavaUsage {

    public void foo() throws MalformedURLException {
        LoginResult a = new LoginResult(Instant.MAX, "does it work?", Duration.ofNanos(1), new URL("xd"));

        a.getAuthToken();
        a.getLoginTs();
        a.setAuthToken("setter works");
    }
}