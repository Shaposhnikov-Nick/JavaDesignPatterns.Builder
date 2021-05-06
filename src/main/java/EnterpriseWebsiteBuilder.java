/*
Точная реализация класса для создания Enterprise вебсайта
 */

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprise website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.NODEJS);
    }

    @Override
    void buildPrice() {
        website.setPrice(3000);
    }
}
