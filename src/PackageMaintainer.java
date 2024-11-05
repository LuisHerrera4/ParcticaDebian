import java.util.List;

public class PackageMaintainer {

    private String maintainerName;
    private String maintainerEmail;
    private String packageName;


    public PackageMaintainer(String maintainerName, String maintainerEmail, String packageName) {
        this.maintainerName = maintainerName;
        this.maintainerEmail = maintainerEmail;
        this.packageName = packageName;
    }


    public String getMaintainerName() {
        return maintainerName;
    }

    public void setMaintainerName(String maintainerName) {
        this.maintainerName = maintainerName;
    }

    public String getMaintainerEmail() {
        return maintainerEmail;
    }

    public void setMaintainerEmail(String maintainerEmail) {
        this.maintainerEmail = maintainerEmail;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void escribirMail(rcBugPackage bug){
        System.out.println("From: owner@bugs.debian.org\n" +
                "To: " + maintainerEmail + "\n" +
                "Dear " + maintainerName + ",\n" +
                "You have a new bug : \n" +
                bug.getPackagesName() + " - RC bug number #" + bug.getIdBug() + "\n"+
                "Please, fix it as soon as possible.\n"+
                "Cheers.");
    }


}
