package Enums;

public enum Url {

    HOME_PAGE("https://www.db.com");

    private String url;

    Url(String url) {
        this.url = url;
    }

    public String get() {
        return this.url;
    }
}
