package lombok_samples;

import lombok.Getter;
import lombok.Setter;

/**
 * Аннотации для генерации методов: Lombok позволяет использовать аннотации,
 * такие как @Getter, @Setter, @ToString, которые автоматически генерируют
 * соответствующие методы (геттеры, сеттеры, toString) для полей класса.
 * Это существенно сокращает объем бойлерплейт-кода.
 * В этом примере Lombok автоматически создаст геттер и сеттер для поля name.
 */
public class MyClass {
    @Getter @Setter
    private String name;
}
