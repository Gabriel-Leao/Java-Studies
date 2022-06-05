package cursoemvideo;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();

        System.out.printf("O idioma do seu sistema é %S-%s\n", loc.getDisplayLanguage(), loc.getCountry());
    }
}