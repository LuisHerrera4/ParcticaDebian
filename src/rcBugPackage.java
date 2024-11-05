import java.io.BufferedReader;
import java.util.List;

public class rcBugPackage {

    private int idBug;
    private List<String> packagesName;

    public rcBugPackage(int idBug, List<String> packagesName) {
        this.idBug = idBug;
        this.packagesName = packagesName;
    }

    public int getIdBug() {
        return idBug;
    }

    public void setIdBug(int idBug) {
        this.idBug = idBug;
    }

    public List<String> getPackagesName() {
        return packagesName;
    }

    public void setPackagesName(List<String> packagesName) {
        this.packagesName = packagesName;
    }


}
