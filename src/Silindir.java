public  class Silindir extends Daire{

    private double yukseklik;


    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);

        this.yukseklik = yukseklik;
    }

    public Silindir(double yariCap) {
        super(yariCap);
    }

    public double getYukseklik() {
        if (yukseklik < 0) {
            return 0;
        }
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    public double getHacim() {
        return yukseklik * getAlan();
    }


    public double getAlan() {

        return getYaricap()*getYaricap()*Math.PI*yukseklik;


   }

}






