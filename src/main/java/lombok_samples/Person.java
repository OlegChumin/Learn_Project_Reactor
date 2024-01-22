package lombok_samples;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * Lombok сгенерирует конструкторы и методы билдера для класса Person.
 * Использование Lombok может значительно сократить объем кода,
 * уменьшить вероятность ошибок в нем и сделать код более читаемым.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private String name;
    private int age;
}
