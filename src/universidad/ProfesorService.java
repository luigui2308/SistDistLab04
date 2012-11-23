package universidad;

public class ProfesorService {

  private static String[][] profesores = {
    {"101110111","Estadistica","Carlos Perez","Licenciado","carlos@xyz.com","3456-7890"},
    {"202220222","Matematica","Luis Torres","Master","luis@xyz.com","6677-3456"},
    {"303330333","Administracion","Juan Castro","Licenciado","castro@xyz.com","67455-7788"},
    {"404440444","Quimica","Joaquin Soto","Ingeniero","joaquin@xyz.com","3333-7890"}};

  public String[] findProfesor(String profesorID) {
    for (int i=0;i<profesores.length;i++)
      if (profesorID.equals(profesores[i][0]))
        return profesores[i];
  return null;
  }

  public String[][] findAll() {
    return profesores;
  }
  // ...
}