public class MainApp {
    public static void main(String[] args) {
      Daire daire1=new Daire(3.75);
        System.out.println("daire...");
        System.out.println("yaricap="+daire1.getYaricap());
        System.out.println("Alan="+daire1.getAlan());
        System.out.println("-------------------------");

      Silindir silindir=new Silindir(5.55,7.25);
        System.out.println("Silindir....");
       System.out.println("Yarıcap="+silindir.getYaricap());
        System.out.printf("Alan=%5.2f\n ", silindir.getAlan());
        System.out.printf("Hacim=%5.2f ", silindir.getHacim());
        System.out.println("Hacim="+silindir.getHacim());
        System.out.println("...........................");


    }
}
