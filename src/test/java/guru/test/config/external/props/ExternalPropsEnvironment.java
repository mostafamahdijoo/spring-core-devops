package guru.test.config.external.props;

import guru.springframework.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:testing.properties")
public class ExternalPropsEnvironment {

    @Autowired
    Environment env;

    @Bean
    public FakeJmsBroker fakeJmsBrokerEnv() {
        System.out.println("Creating fakeJmsBroker in " + getClass().getName());
        System.out.println("guru.jms.server = " + env.getProperty("guru.jms.server"));
        System.out.println("guru.jms.server = " + env.getRequiredProperty("guru.jms.port"));
        System.out.println("guru.jms.user = " + env.getProperty("guru.jms.user"));
        System.out.println("guru.jms.password = " + env.getProperty("guru.jms.password"));

        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUrl(env.getProperty("guru.jms.server"));
        fakeJmsBroker.setPort(env.getRequiredProperty("guru.jms.port", Integer.class));
        fakeJmsBroker.setUser(env.getProperty("guru.jms.user"));
        fakeJmsBroker.setPassword(env.getProperty("guru.jms.password"));
        return fakeJmsBroker;
    }
}
