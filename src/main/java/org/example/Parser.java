package org.example;

import org.example.exceptions.ParseException;

/**
 * Синтаксический разборщик, используемый для преобразования строкового
 * представления сущности в соответствующий экземпляр класса.
 */
public interface Parser<T> {

    /**
     * Задаёт входную строку для последующего синтаксического разбора
     * и преобразования. Требуется не null-значение.
     *
     * @param input Входная строка -- строковое представление сущности.
     *              Недопустимо null-значение.
     * @return Код результата предварительного анализа строки:
     *         0 -- если количество данных (полей) в строке соответствует
     *         необходимому;
     *         отрицательное значение -- соответствует количеству недостающих
     *         полей в строке;
     *         положительное значение -- соответствует количеству лишних полей
     *         в строке.
     */
    int setInput(String input);

    /**
     * Выполняет окончательный синтаксический разбор и преобразование строки,
     * заданной методом setInput, в экземпляр типа сущности.
     *
     * @return Экземпляр типа сущности.
     * @throws ParseException если формат строки задан некорректно и
     *                        преобразование невозможно.
     */
    T parse() throws ParseException;
}