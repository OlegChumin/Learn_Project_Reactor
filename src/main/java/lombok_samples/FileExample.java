package lombok_samples;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Автоматическое управление ресурсами:
 * Аннотация @Cleanup генерирует блок try-with-resources для управления ресурсами,
 * уменьшая необходимость явного написания такого кода.
 */
public class FileExample {
    @SneakyThrows
    public static void main(String[] args) {
        @Cleanup FileInputStream input = new FileInputStream("input.txt");
        // Ваш код для работы с вводом
    }
}
