/*
Точная реализация класса для создания вебсайта визитной карточки
 */
public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit card website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ANGULAR);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
