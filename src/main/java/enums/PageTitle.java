package enums;

public enum PageTitle {

    HOME("Home – Deutsche Bank"),
    MEDIA("Newsroom – Deutsche Bank"),
    CAREERS("Welcome – Deutsche Bank Careers"),
    INVESTOR_RELATIONS("Investor Relations – Deutsche Bank"),
    RESEARCH("Deutsche Bank Research - economic cycle,growth trends, economic policy, finance sector, regulation - Deutsche Bank Research"),
    POSITIVE_IMPACT("#PositiveImpact Home Deutsche Bank"),
    RESPONSIBILITY("Home – Deutsche Bank Responsibility"),
    CONTACT("Contact – Deutsche Bank"),
    WHAT_WE_DO("What we do – Deutsche Bank"),
    WHO_WE_ARE("Who we are – Deutsche Bank");

    private String title;

    PageTitle(String title) {
        this.title = title;
    }

    public String get() {
        return this.title;
    }
}
