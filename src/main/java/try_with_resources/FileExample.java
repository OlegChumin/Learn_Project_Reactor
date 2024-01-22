package try_with_resources;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * try-with-resources - это конструкция языка Java, введенная в Java 7, предназначенная для управления ресурсами,
 * такими как файлы или сетевые соединения. Она упрощает и сокращает код, связанный с открытием, использованием и
 * закрытием ресурсов, таким образом помогая избежать утечек ресурсов и повышать читаемость кода.
 *
 * Основная идея try-with-resources заключается в том, что вы объявляете ресурсы в скобках после ключевого слова try,
 * и эти ресурсы будут автоматически закрыты по завершении блока try. Компилятор Java обеспечивает автоматическое
 * закрытие ресурсов, и это происходит в обратном порядке, в котором ресурсы были объявлены.
 */
public class FileExample {
    public static void main(String[] args) {
        // try-with-resources с FileInputStream
        try (FileInputStream input = new FileInputStream("example.txt")) {
            // Ваш код для работы с вводом
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
