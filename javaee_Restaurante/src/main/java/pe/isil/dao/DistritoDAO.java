package pe.isil.dao;

public class DistritoDAO {

    private int idDist;
    private String nomDist;

    public DistritoDAO() {
    }

    public DistritoDAO(int idDist, String nomDist) {
        this.idDist = idDist;
        this.nomDist = nomDist;
    }

    public int getIdDist() {
        return idDist;
    }

    public void setIdDist(int idDist) {
        this.idDist = idDist;
    }

    public String getNomDist() {
        return nomDist;
    }

    public void setNomDist(String nomDist) {
        this.nomDist = nomDist;
    }
}
