package cursoemvideo;

import java.awt.*;

public class TamanhoTela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();

        System.out.printf("A resolução da sua tela é: %d X %d\n", tk.getScreenSize().width, tk.getScreenSize().height);
    }
}