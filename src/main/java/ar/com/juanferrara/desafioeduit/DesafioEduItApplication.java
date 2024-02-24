package ar.com.juanferrara.desafioeduit;

import ar.com.juanferrara.desafioeduit.entities.Persona;
import ar.com.juanferrara.desafioeduit.entities.Telefono;
import ar.com.juanferrara.desafioeduit.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DesafioEduItApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DesafioEduItApplication.class, args);
    }

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public void run(String... args) throws Exception {
        Telefono telefono1 = new Telefono(123456789, "celular");
        Telefono telefono2 = new Telefono(987654321, "fijo");
        Telefono telefono3 = new Telefono(123456789, "celular");
        Telefono telefono4 = new Telefono(987654321, "fijo");

        Persona persona1 = new Persona(11200333L, "Jorge", "Perez", "jorgeperez@hotmail.com", List.of(telefono1, telefono2));
        Persona persona2 = new Persona(11222333L, "Nahuel", "Perez", "nahuelperez@hotmail.com", List.of(telefono3, telefono4));

        personaRepository.save(persona1);
        personaRepository.save(persona2);
    }
}
