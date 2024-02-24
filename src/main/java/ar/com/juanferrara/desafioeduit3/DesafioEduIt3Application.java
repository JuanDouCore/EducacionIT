package ar.com.juanferrara.desafioeduit3;

import ar.com.juanferrara.desafioeduit3.entities.Empleado;
import ar.com.juanferrara.desafioeduit3.entities.Persona;
import ar.com.juanferrara.desafioeduit3.repository.EmpleadoRepository;
import ar.com.juanferrara.desafioeduit3.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioEduIt3Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DesafioEduIt3Application.class, args);
    }

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public void run(String... args) throws Exception {
        Persona persona = new Persona(20111222L, "Juan", "Ferrara");
        personaRepository.save(persona);

        System.out.println("Persona guardada: " + personaRepository.findById(1L).get());

        Thread.sleep(2000);

        Empleado empleado = new Empleado(20111222L, "Juan", "Ferrara", 525, 222333);
        empleadoRepository.save(empleado);

        System.out.println("Empleado guardado: " + empleadoRepository.findById(2L).get());

        Thread.sleep(2000);
    }
}
