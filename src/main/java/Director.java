/*
класс Director определяет, какую именно реализацию WebsiteBuilder мы используем
 */
public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();
        Website website = builder.getWebsite();

        return website;
    }
}
