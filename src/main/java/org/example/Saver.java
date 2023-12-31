package org.example;
/**
 * Объект, предоставляющий сервис сохранения данных в заданной директории.
 */
public interface Saver<T> {

    /**
     * Сохраняет экземпляр данных в текстовый файл с вычислимым именем.
     *
     * @param data Экземпляр данных.
     * @return Полный путь к сохранённому файлу.
     * @throws Exception если попытка сохранения не удалась в результате какой-либо
     *                   ошибки ввода-вывода или любого иного исключения времени
     *                   выполнения.
     */
    String save(T data) throws Exception;
}