package bhxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "bhxh.data.repository")
@SpringBootApplication
public class ServiceSyncDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceSyncDataApplication.class, args);
    }
}

//@SpringBootApplication
//public class ServiceSyncDataApplication extends SpringBootServletInitializer {
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(ServiceSyncDataApplication.class);
//    }
//
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(ServiceSyncDataApplication.class, args);
//    }

//}
