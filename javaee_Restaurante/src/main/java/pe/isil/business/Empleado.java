package pe.isil.business;


public class Empleado {
    private  Integer idEmp;
    private Integer dniEmp;
    private String nomEmp;
    private String apeEm;
    private Distrito dist;
    private String dirEmp;
    private  String telEmp;
    private  String sexoEmp;
    private String cargoEmp;

    public Empleado() {
    }

    public Empleado(Integer idEmp, Integer dniEmp, String nomEmp, String apeEm, Distrito dist, String dirEmp, String telEmp, String sexoEmp, String cargoEmp) {
        this.idEmp = idEmp;
        this.dniEmp = dniEmp;
        this.nomEmp = nomEmp;
        this.apeEm = apeEm;
        this.dist = dist;
        this.dirEmp = dirEmp;
        this.telEmp = telEmp;
        this.sexoEmp = sexoEmp;
        this.cargoEmp = cargoEmp;
    }

    public Integer getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public Integer getDniEmp() {
        return dniEmp;
    }

    public void setDniEmp(Integer dniEmp) {
        this.dniEmp = dniEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getApeEm() {
        return apeEm;
    }

    public void setApeEm(String apeEm) {
        this.apeEm = apeEm;
    }

    public Distrito getDist() {
        return dist;
    }

    public void setDist(Distrito dist) {
        this.dist = dist;
    }

    public String getDirEmp() {
        return dirEmp;
    }

    public void setDirEmp(String dirEmp) {
        this.dirEmp = dirEmp;
    }

    public String getTelEmp() {
        return telEmp;
    }

    public void setTelEmp(String telEmp) {
        this.telEmp = telEmp;
    }

    public String getSexoEmp() {
        return sexoEmp;
    }

    public void setSexoEmp(String sexoEmp) {
        this.sexoEmp = sexoEmp;
    }

    public String getCargoEmp() {
        return cargoEmp;
    }

    public void setCargoEmp(String cargoEmp) {
        this.cargoEmp = cargoEmp;
    }
}