package main;

class Box {
    /**
     * 2 ...Что это и будет содержимое(та самая вещь) которую положат в класс Box
     */
    private ThingInterface content;

    // 3 ...

    public void setContent(ThingInterface content) {
        this.content = content;
    }

    public ThingInterface getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Box{" +
                "content=" + content.toString() +
                "}";
    }

    /*
    *Ответить на вопрос, если у нас скажем свойство title в классе книги (Book) - приватное,
    * и у нас 2 объекта данного класса ( Book oneBook, anotherBook ) - то может ли oneBook достучатся
    * напрямую до anotherBook.title - ? Аргументируйте!
    *
    * Не может, т.к. модификатор доступа private ограничивает видимость переменной title внутренностью капсулы
    * */

    /*
    * Возможно ли "положить" одну и ту же книгу в обе коробки?
    *
    * Да, возможно.
    * */

    /*
    * Если после 10.4-го пункта изменить title книги из первой коробки, изменится и титул книги во второй? Если да - почему?
    *
    * Изменится, т.к. книга одна(объект в памяти один), а количество ссылок смотрящих на этот объект неограниченно.
    * */

}

