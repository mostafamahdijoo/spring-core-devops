package guru.springframework.test.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class QADataSource implements FakeDataSource {

    @Override
    public String getConnectionInfo() {
        return "I'm a QA Datasource";
    }
}
