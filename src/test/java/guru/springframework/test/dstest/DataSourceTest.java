package guru.springframework.test.dstest;

import guru.springframework.test.config.DataSourceConfig;
import guru.springframework.test.ds.FakeDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DataSourceConfig.class)
@ActiveProfiles("dev")
public class DataSourceTest {

    @Autowired
    private FakeDataSource fakeDataSource;

    @Test
    public void testDataSource() {
        System.out.println(fakeDataSource.getConnectionInfo());
    }
}
