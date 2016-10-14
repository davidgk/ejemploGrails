
import ejemplograils.*
class BootStrap {

    def init = { servletContext ->
        Persona persona = new Persona(id:1 , nombre: "carlos", apellido: "Primero", edad :140, mail: "chanta@dos.com")
        Persona persona1 = new Persona(id:2, nombre: "Edu", apellido: "Primero", edad :140, mail :"chanta@dos.com")
        Persona persona2 = new Persona(id:3, nombre: "Chacho", apellido: "Primero", edad :140, mail :"chanta@dos.com")
        persona.save(failOnError:true);
        persona1.save(failOnError:true);
        persona2.save(failOnError:true);
    }
    def destroy = {
        Persona.findAll().each {it.delete()}
    }
}
