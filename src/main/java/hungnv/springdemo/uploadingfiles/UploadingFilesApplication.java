package hungnv.springdemo.uploadingfiles;

import hungnv.springdemo.uploadingfiles.storage.StorageProperties;
import hungnv.springdemo.uploadingfiles.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UploadingFilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploadingFilesApplication.class);
    }

    CommandLineRunner init(StorageService storageService) {
        return (args -> {
            storageService.deleteAll();
            storageService.init();
        });
    }

}
