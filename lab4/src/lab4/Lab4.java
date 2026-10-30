
package lab4;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Maria
 */

public class Lab4 {

   static HashMap<String, Product> toys = new HashMap<>();
     // Перебор пар ключ-значение
    public static void showEntries(FileWriter writer) throws IOException {
        writer.write("Пары ключ-значение\n");

        for (Map.Entry<String, Product> entry : toys.entrySet()) {
            String result = entry.getKey() + " - " + entry.getValue();

            System.out.println(result);
            writer.write(result + "\n");
        }
    }

    // Перебор ключей
    public static void showKeys(FileWriter writer) throws IOException {
        writer.write("\n Названия игрушек \n");

        for (String key : toys.keySet()) {
            System.out.println(key);
            writer.write(key + "\n");
        }
    }

    // Перебор значений
    public static void showValues(FileWriter writer) throws IOException {
        writer.write("\n Объекты игрушек \n");

        for (Product product : toys.values()) {
            System.out.println(product);
            writer.write(product + "\n");
        }
    }

    // Перебор с помощью итератора
    public static void showIterator() {
        System.out.println("\n Перебор с помощью итератора ");

        Iterator<Product> iterator = toys.values().iterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
System.setOut(new java.io.PrintStream(System.out, true,
                java.nio.charset.StandardCharsets.UTF_8));
        // Добавление игрушек в коллекцию
        toys.put("Мишка", new Product("Мишка", 500, "Россия"));
        toys.put("Кукла", new Product("Кукла", 1200, "Китай"));
        toys.put("Машинка", new Product("Машинка", 800, "Германия"));
        toys.put("Зайчик", new Product("Зайчик", 650, "Россия"));

        // Запись результатов в файл
        try (FileWriter writer = new FileWriter("result.txt")) {

            showEntries(writer);
            showKeys(writer);
            showValues(writer);

            System.out.println("\nРезультаты сохранены в файл result.txt");

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }

        // Перебор коллекции итератором
        showIterator();
    }
}
