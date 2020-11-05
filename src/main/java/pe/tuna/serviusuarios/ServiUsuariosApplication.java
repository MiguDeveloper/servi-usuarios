package pe.tuna.serviusuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"pe.tuna.commonsusuarios.models"})
public class ServiUsuariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiUsuariosApplication.class, args);
    }

}
