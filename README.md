## Тема «Коллекции HashSet и HashMap»

### Условие задачи

Мы будем писать систему, которая будет быстро отвечать на вопрос, есть ли вводимое слово в тексте.

Создайте класс `WordsChecker`. Пусть у него будет конструктор, в который передаётся текст, в котором мы будем проверять наличие слов.

Кроме конструктора у него должен быть метод `hasWord`, куда передаётся слово и который возвращает ответ на вопрос о том, есть ли это слово в тексте или нет.

При этом это должно делаться эффективно - простым `text.contains(word)` не обойтись, т.к. это медленный полный перебор всего текста. Вам предлагается разбить текст на слова (воспользуйтесь `text.split("\\P{IsAlphabetic}+")` для этого) и положить их в коллекцию для быстрой проверки наличия в ней слов через специальный метод коллекции. Подумайте что это за коллекция должна быть и какой метод тут подойдёт.

Продемонстрируйте работу вашего класса в `Main` на примере текста `Lorem ipsum`:
>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
