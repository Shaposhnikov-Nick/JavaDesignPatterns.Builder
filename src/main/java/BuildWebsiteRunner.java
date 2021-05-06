/*
Непосредственная реализация 
 */
public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());
        Website firstWebsite = director.buildWebsite();
        System.out.println(firstWebsite);

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website secondWebsite = director.buildWebsite();
        System.out.println(secondWebsite);
    }

}
