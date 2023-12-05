package examen2tipo2csv4;

public class Alumnos {
    
    private int id; 
    private String grupo;
    private String nombre;
    private int mat1, mat2, mat3, mat4, mat5, mat6;
    private double prom;
   
    public Alumnos(int id, String g, String n, int m1, int m2, int m3, int m4, int m5, int m6, double prm) {
        this.grupo = g;
        this.nombre = n;
        this.mat1 = m1;
        this.mat2 = m2;
        this.mat3 = m3;
        this.mat4 = m4;
        this.mat5 = m5;
        this.mat6 = m6;
        this.prom = prm;
    }    
    
    public void setID(int id) {
        this.id = id;
    }
    
    public void setGrupo(String g) {
        this.grupo = g;
    }
    
    public void setNombre(String n) {
        this.nombre = n;
    }
    
    public void setMat1(int m1) {
        this.mat1 = m1;
    }
    
    public void setMat2(int m2) {
        this.mat2 = m2;
    }
 
    public void setMat3(int m3) {
        this.mat3 = m3;
    }
    
    public void setMat4(int m4) {
        this.mat4 = m4;
    }
    
    public void setMat5(int m5) {
        this.mat5 = m5;
    }
    
    public void setMat6(int m6) {
        this.mat6 = m6;
    }
    
    public void setProm(double prm) {
        this.prom = prm;
    }
    
    
    
    
    public int getID() {
        return this.id;
    }
    
    public String getGrupo() {
        return this.grupo;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getMat1() {
        return this.mat1;
    }
    
    public int getMat2() {
        return this.mat2;
    }
    
    public int getMat3() {
        return this.mat3;
    }
    
    public int getMat4() {
        return this.mat4;
    }
    
    public int getMat5() {
        return this.mat5;
    }
    
    public int getMat6() {
        return this.mat6;
    }
    
    public double getProm() {
        return this.prom;
    }
}
