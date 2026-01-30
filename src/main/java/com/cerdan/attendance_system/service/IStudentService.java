


public interface StudentService{
    public List<Student> listarEstudiantes();
    public Student buscarEstudiantePorId(Student estudiante);
    public void guardarEstudiante(Student estudiante);
    public void eliminarEstudiante(Student estudiante);    


}