package by.chuyashkou.social.util;

public enum PageMappingConstant {

    PAGE_REGISTRATION("page.registration"),
    PAGE_LOGIN("page.login"),
    PAGE_USER("page.user"),
    PAGE_MAIN("page.main"),
    PAGE_FOLLOWERS("page.followers"),
    PAGE_ALL_USERS("page.all.users"),
    PAGE_USER_PROFILE("page.user.profile");

    private final String key;

    PageMappingConstant(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
