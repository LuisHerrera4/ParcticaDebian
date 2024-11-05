import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorArchivos {
    //Esto es para que la lista solo pueda contener objetos del tipo PackageMaintainer

    public List<PackageMaintainer> leerMaintainer(){
        ArrayList<PackageMaintainer>  maintainers = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("packageMaintainer.txt"))){
            String linea;
            while ((linea = bufferedReader.readLine())!= null){
                String[] infoMaintainer = linea.split(";");

                if (infoMaintainer.length==3){
                    String packageName= infoMaintainer[0];
                    String maintainerName= infoMaintainer[1];
                    String maintainerEmail= infoMaintainer[2];

                    PackageMaintainer maintainer = new PackageMaintainer(packageName, maintainerName, maintainerEmail);
                    maintainers.add(maintainer);
                }else{
                    System.out.println("Formato incorrecto en la linea: "+ linea);
                }
            }
        }catch(IOException e){
            System.out.println("Error al leer el archivo: "+ e.getMessage());
        }
        return maintainers;
    }

    public rcBugPackage leerBugs(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("rcBugPackage.txt"))){
            ArrayList<rcBugPackage> bugs = new ArrayList<>();

            String linea;
            while ((linea = bufferedReader.readLine())!= null){
                String[] infoBug = linea.split(";");

                if(infoBug.length ==2){

                    int idBug= Integer.parseInt(infoBug[0]);
                    List<String> packagesName = infoBug[1];

                    rcBugPackage bugPackage = new rcBugPackage(idBug, packagesName);
                    bugs.add(bugPackage);
                }
            }
        }catch (IOException e){
            System.out.println("Error al leer el archivo: "+ e.getMessage());
        }
        return null;
    }

}
