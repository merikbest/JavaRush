package Collections.level37.task3709.connectors;

import Collections.level37.task3709.security.SecurityChecker;
import Collections.level37.task3709.security.SecurityCheckerImpl;

public class SecurityProxyConnector implements Connector {
    private SimpleConnector simpleConnector;
    private SecurityChecker securityChecker = new SecurityCheckerImpl();

    public SecurityProxyConnector(String resourceString) {
        this.simpleConnector = new SimpleConnector(resourceString);
    }

    @Override
    public void connect() {
        if (securityChecker.performSecurityCheck())
            simpleConnector.connect();
    }
}
