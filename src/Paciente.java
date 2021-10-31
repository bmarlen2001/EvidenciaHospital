public class Paciente {
    public String name_pac;
    private String apellido;
    private String genero;
    private String telpaciente;
    private String emailpaciente;
    private double edad;

    public Paciente(String name_pac, String apellido, String genero,
                    String telpaciente, String emailpaciente,double edad){
        this.name_pac = name_pac;
        this.apellido= apellido;
        this.genero= genero;
        this.telpaciente=telpaciente;
        this.emailpaciente=emailpaciente;
        this.edad=edad;
    }

    public String getName_pac() {
        return name_pac;
    }

    public void setName_pac(String name_pac) {
        this.name_pac = name_pac;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelpaciente() {
        return telpaciente;
    }

    public void setTelpaciente(String telpaciente) {
        this.telpaciente = telpaciente;
    }

    public String getEmailpaciente() {
        return emailpaciente;
    }

    public void setEmailpaciente(String emailpaciente) {
        this.emailpaciente = emailpaciente;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("\n\t---------------");
        System.out.println("Nombre del Paciete: " + name_pac);
        System.out.println("Apellido del Paciente: " + apellido);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Genero F/M: " + genero);
        System.out.println("Telefono del Paciente: " + telpaciente);
        System.out.println("Email del Paciente: " + emailpaciente);
        System.out.println("Edad del Paciente: " + edad);
        System.out.println("\t---------------");
    }
}
