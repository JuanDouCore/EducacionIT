package ar.com.juanferrara.desafioeduit2;

import ar.com.juanferrara.desafioeduit2.entities.Cliente;
import ar.com.juanferrara.desafioeduit2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioEduIt2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DesafioEduIt2Application.class, args);
    }

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void run(String... args) throws Exception {
        Cliente cliente = new Cliente(20321200L, "Juan", "Ferrara", "juanjoyqueco.8@hotmail.com", 100);

        System.out.println("GUARDANDO EL CLIENTE...");;
        clienteRepository.save(cliente);

        Thread.sleep(2000);
        System.out.println("BUSCANDO EL CLIENTE POR ID...");
        Cliente clienteEncontrado = clienteRepository.findById(1L);
        System.out.println(clienteEncontrado);
        System.out.println("______________________________");

        Thread.sleep(2000);
        System.out.println("BUSCANDO CLIENTE POR DNI...");
        Cliente clienteEncontradoPorDni = clienteRepository.findByDni(20321200L);
        System.out.println(clienteEncontradoPorDni);
        System.out.println("______________________________");

        Thread.sleep(2000);
        System.out.println("MOSTRAR CANTIDAD DE COMPRAS DE  CLIENTE POR DNI...");
        System.out.println(clienteRepository.getCantidadDeCompras(20321200L));

    }
}
