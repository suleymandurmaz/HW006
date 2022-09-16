public class Daire {
    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getYaricap() {
        if(yaricap<0){
            return 0;
        }

        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
    public double getAlan(){
        return yaricap*yaricap*Math.PI;
    }

}









