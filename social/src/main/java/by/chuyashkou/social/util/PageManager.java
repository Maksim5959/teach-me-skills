package by.chuyashkou.social.util;

import lombok.experimental.UtilityClass;

import java.util.ResourceBundle;

@UtilityClass
public class PageManager {

    private final ResourceBundle bundle = ResourceBundle.getBundle("pages");

    public String getPageURI(String key) {
        return bundle.getString(key);
    }
}
