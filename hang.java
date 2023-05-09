package lab3_b2;
public abstract class hang {
    private String mahang;
    private String tenhang;
    private float dg;
    private int  slt;
    void hang(){      
    }
    void hang(String mahang,String tenhang,float dg,int slt){
    this.mahang=mahang;
    this.dg=dg;
    this.slt=slt;
    this.tenhang=tenhang;
}
    String getMahang(){
        return mahang;
    }
    void setMahang(String mahang){
        this.mahang= mahang;
    }
    String getTenhang(){
        return tenhang;
    }
    void setTenhang(String tenhang){
        this.tenhang=tenhang;
    }
    float getDg(){
        return dg;
    }
    void setDg(float dg){
     this.dg=dg;   
    }
    int getSlt(){
        return slt;
    }
    void setSlt(int slt){
        this.slt=slt;
    }
}



