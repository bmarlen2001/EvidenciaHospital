public class Medicamento {
    public float id_medicamento;
    public String name_medicamento;


    public Medicamento(float id_medicamento, String name_medicamento){
        this.id_medicamento=id_medicamento;
        this.name_medicamento=name_medicamento;
    }

    public float getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(float id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public String getName_medicamento() {
        return name_medicamento;
    }

    public void setName_medicamento(String name_medicamento) {
        this.name_medicamento = name_medicamento;
    }
    public void mostrar() {
        System.out.println("\n\t---------------");
        System.out.println("Id del medicamento: " + id_medicamento);
        System.out.println("Nombre del medicamento: " + name_medicamento);
        System.out.println("\t---------------");
    }
}
