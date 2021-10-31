public class Receta {
    public String name;
    public String name_pac;
    public float fecha_rec;
    public float id_cita;
    public float id_medicamento;
    public String descripcion;

    public Receta(String name, String name_pac, float fecha_rec, float id_cita,
                  float id_medicamento, String descripcion){
        this.name=name;
        this.name_pac=name_pac;
        this.fecha_rec=fecha_rec;
        this.id_cita=id_cita;
        this.id_medicamento=id_medicamento;
        this.descripcion=descripcion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_pac() {
        return name_pac;
    }

    public void setName_pac(String name_pac) {
        this.name_pac = name_pac;
    }

    public float getFecha_rec() {
        return fecha_rec;
    }

    public void setFecha_rec(float fecha_rec) {
        this.fecha_rec = fecha_rec;
    }

    public float getId_cita() {
        return id_cita;
    }

    public void setId_cita(float id_cita) {
        this.id_cita = id_cita;
    }

    public float getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(float id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void mostrar() {
        System.out.println("\n\t---------------");
        System.out.println("Nombre del doctor: " + name);
        System.out.println("Nombre del Paciete: " + name_pac);
        System.out.println("Fecha: " + fecha_rec);
        System.out.println("Id de la Cita: " + id_cita);
        System.out.println("Id del Medicamento: " + id_medicamento);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("\t---------------");
    }
}
