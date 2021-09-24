package Gary;

public class DirectorFinanciero extends Persona {
     private int codDir;

     public DirectorFinanciero(String nombre,String direccion,int Ci,int telefono){
         super(nombre,direccion,Ci,telefono);

         this.setCodDir(getCodDir());
     }


    public int getCodDir() {
        return codDir;
    }

    public void setCodDir(int codDir) {
        this.codDir = codDir;
    }

}
