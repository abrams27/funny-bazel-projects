
import java.net.URL;
import java.time.Duration;
import java.time.Instant;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class LoginResult {

    private @NonNull Instant loginTs;

    private @NonNull String authToken;
    private @NonNull Duration tokenValidity;
    
    private @NonNull URL tokenRefreshUrl;

}
