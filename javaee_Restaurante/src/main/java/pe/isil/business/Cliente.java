package pe.isil.business;

public class Cliente {
    private  Integer idCli;
    private  Integer dniCli;
    private  String nomCli;
    private  String apeCli;
    private  String rucCli;
    private  String telCli;

    public Cliente() {
    }

    public Cliente(Integer idCli, Integer dniCli, String nomCli, String apeCli, String rucCli, String telCli) {
        this.idCli = idCli;
        this.dniCli = dniCli;
        this.nomCli = nomCli;
        this.apeCli = apeCli;
        this.rucCli = rucCli;
        this.telCli = telCli;
    }

    public Integer getIdCli() {
        return idCli;
    }

    public void setIdCli(Integer idCli) {
        this.idCli = idCli;
    }

    public Integer getDniCli() {
        return dniCli;
    }

    public void setDniCli(Integer dniCli) {
        this.dniCli = dniCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
    }

    public String getRucCli() {
        return rucCli;
    }

    public void setRucCli(String rucCli) {
        this.rucCli = rucCli;
    }

    public String getTelCli() {
        return telCli;
    }

    public void setTelCli(String telCli) {
        this.telCli = telCli;
    }
}