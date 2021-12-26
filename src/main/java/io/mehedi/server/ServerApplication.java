package io.mehedi.server;

import io.mehedi.server.enumeration.Status;
import io.mehedi.server.model.Server;
import io.mehedi.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static io.mehedi.server.enumeration.Status.SERVER_DOWN;
import static io.mehedi.server.enumeration.Status.SERVER_UP;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServerApplication.class, args);
	}
	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null,"192.168.1.1","ASUS Router","24 GB","Personal Router",
					"http://localhost:8080/server/image/2.png", SERVER_UP));
			serverRepo.save(new Server(null,"192.168.0.1","Dell PC","16 GB","Dell workshop",
					"http://localhost:8080/server/image/4.png", SERVER_DOWN));
			serverRepo.save(new Server(null,"192.168.1.0","Tesla DL","240 GB","Tesla Training",
					"http://localhost:8080/server/image/3.png", SERVER_UP));
			serverRepo.save(new Server(null,"192.168.10.10","HDFS","60 GB","Big Data",
					"http://localhost:8080/server/image/5.png", SERVER_DOWN));
			serverRepo.save(new Server(null,"192.168.11.11","MSI Laptop","32 GB","Laptop",
					"http://localhost:8080/server/image/4.png", SERVER_UP));
			serverRepo.save(new Server(null,"192.168.112.1","Lucid Dream","64 GB","Car EV",
					"http://localhost:8080/server/image/3.png", SERVER_UP));
		};
	}

}
