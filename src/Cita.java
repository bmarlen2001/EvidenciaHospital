public class Cita {
    public float id_cita;
    public String name_pac;
    public String motivo;
    public float fecha;
    public float hora;
    public String name;

    public Cita(float id_cita, String name_pac, String motivo, float fecha,
                float hora, String name){
        this.id_cita=id_cita;
        this.name_pac = name_pac;
        this.motivo=motivo;
        this.fecha=fecha;
        this.hora=hora;
        this.name=name;
    }

    public float getId_cita() {
        return id_cita;
    }

    public void setId_cita(float id_cita) {
        this.id_cita = id_cita;
    }

    public String getName_pac() {
        return name_pac;
    }

    public void setName_pac(String name_pac) {
        this.name_pac = name_pac;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public float getFecha() {
        return fecha;
    }

    public void setFecha(float fecha) {
        this.fecha = fecha;
    }

    public float getHora() {
        return hora;
    }

    public void setHora(float hora) {
        this.hora = hora;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void mostrar() {
        System.out.println("\n\t---------------");
        System.out.println("Id de la Cita: " + id_cita);
        System.out.println("Nombre del Paciete: " + name_pac);
        System.out.println("Motivo de la cita medica: " + motivo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Nombre del doctor: " + name);
        System.out.println("\t---------------");
    }
}
