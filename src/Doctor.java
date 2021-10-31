public class Doctor {
    public String name;
    private String area;
    private String email;
    public String Identificación;
    private String telefono;

    public Doctor(String name, String area, String email, String Identificacion, String telefono){
        this.name = name;
        this.area= area;
        this.email= email;
        this.Identificación=Identificacion;
        this.telefono=telefono;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentificación() {
        return Identificación;
    }

    public void setIdentificación(String identificación) {
        Identificación = identificación;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void mostrar() {
        System.out.println("\n\tBievenido");
        System.out.println("Nombre del Medico: " + name);
        System.out.println("Area: " + area);
        System.out.println("Email: " + email);
        System.out.println("Especialidad: " + Identificación);
        System.out.println("Telefoo: " + telefono);
        System.out.println("\t---------------");
    }
}



