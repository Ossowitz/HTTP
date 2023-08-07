# HTTP

**Протокол передачи гипертекста (HyperText Transfer Protocol - HTTP)** - это *прикладной протокол* ждя передачи
гипертекстовых документов, таких как HTML. Он создан для связи между веб-браузером и веб-сервисами, хотя в принципе HTTP
может использоваться и для других целей. Протокол следует классической клиент-серверной модели, когда клиент открывает 
соединение для создания запроса, а затем ждёт ответа. HTTP - это *протокол без сохранения состояния*, то есть сервер
не сохраняет никаких данных (состояние) между двумя парами "запрос-ответ". Несмотря на то, что HTTP основан на TCP/IP, 
он также может использовать любой другой протокол *транспортного уровня* с гарантированной доставкой.

![img.png](img.png)

Каждое HTTP-сообщение, независимо от того, следует оно от клиента к серверу(request) или от сервера к клиенту(response),
состоит из трёх основных частей: <br/>
• Стартовая строка <br/>
• Заголовок (header) <br/>
• Тело сообщения (body) <br/>

*Это логическое разбиение, поскольку всё идёт одним куском информации*

## Стартовая строка

*Стартовая строка определяет тип сообщения, в которой указываются следующие данные (general):* <br/>
**a) Request:** <br/>
• метод (GET, POST, PUT, DELETE, etc) <br/>
• адрес (URL) <br/>
• версия протокола (HTTP/1.1, HTTP/2)

![img_1.png](img_1.png)

**HTTP-метод - это название операции, которая должна быть выполнена HTTP-запросом (request):** <br/>
• GET (когда мы хотим только получить информацию) <br/>
• POST (когда мы хотим добавить что-то на сервер или изменить там что-то) <br/>
• PUT (полное обновление уже существующей записи) <br/>
• DELETE (удаление информации с сервера) <br/>
• PATCH (изменение части информации) <br/>
• HEAD <br/>
• CONNECT <br/>
• OPTIONS <br/>
• TRACE <br/>

**Адрес(URL - Uniform Resource Locator) состоит из 4 основных частей:**

• протокол <br/>
• доменное имя или IP-адрес (с портом) <br/>
• адрес ресурса (по указанному доменному имени или IP-адресу) <br/>
• список параметров

![img_2.png](img_2.png)

**b) Response** <br/>
• версия протокола (HTTP/1.1, HTTP/2) <br/>
• код состояния (1xx, 2xx, 3xx, 4xx, 5xx) <br/>
• текстовое пояснение <br/>

**Код состояния(Status Code) - цифровой код ответа сервера, состоящий из трёхзначного числа, первая цифра которого
означает класс состояния**

*Всего существует 5 классов состояния: 1xx, 2xx, 3xx, 4xx, 5xx*

![img_3.png](img_3.png)

**1xx - информация о состоянии процесса передачи** <br/>
*Informational Status code* <br/>

• 100 - Continue <br/>
• 101 - Switching Protocols <br/>

**2xx - информация об успешном принятии запроса и его обработке**

• 200 - OK <br/>
• 201 - Created <br/>
• 204 - No Content <br/>

**3xx - информация о том, что необходимо выполнить запрос по другому адресу, указанному в заголовке location (header)** <br/>
*Redirection*

• 301 - Moved Permanently <br/>
• 302 - Moved Temporarily <br/>

**4xx - информация об ошибках со стороны клиента**

• 401 - Unauthorized <br/>
• 403 - Forbidden <br/>
• 404 - Not Found (Когда URL, по которому мы переходим, не существует) <br/>

**5xx - информация об ошибках на стороне сервера**

• 500 - Internal Server Error <br/>
• 503 - Service Unavailable <br/>
• 503 - Gateway Timeout <br/>

## Заголовок

*Заголовок(Header) - характеризует тело сообщения(body) и параметры его передачи в виде "header_name:
header_value"*. <br/>

**Другими словами, является метаинформацией HTTP-сообщения (названия заголовков не чувствительны к регистру).**

![img_4.png](img_4.png)

## Тело сообщения

*Тело сообщения(Body) - это непосредственно пересылаемые данные HTTP-сообщением.* <br/>
Отделяется от заголовка(header) пустой строкой.

Сами данные могут быть совершенно любые, например:

![img_5.png](img_5.png)

## Примеры:

![img_6.png](img_6.png)

## Моменты Request:

![img_7.png](img_7.png)

![img_8.png](img_8.png)

## Метод GET

• От англ. "Получить" <br/>
• Самый используемый запрос (переход по адресу, переход по ссылке, поисковый запрос в Google, открытие видео на YouTube,
и т.д.) <br/>
• Идемпотентный (ничего не меняет на сервере) <br/>
• Тело запроса пустое <br/>

### Параметры GET-запроса

![img_9.png](img_9.png)

Параметры нужны для передачи информации от клиента к серверу во время запроса.

• Параметры GET-запроса передаются в самом URL после знака **?** в формате **ключ=значение** (тело GET-запроса всегда
пустое). <br/>
• Несколько параметров (пар ключ=значение) разделяются **&**.

## POST-запрос

• От англ. "Публиковать" <br/>
• Цель запроса - изменить что-то на сервере (чаще всего - добавить что-нибудь) <br/>
• Часто используется для отправки данных с веб-форм, но не только для этого (создать новую учётную запись, твитнуть
что-нибудь, добавить запись в сообщество, загрузить фото в IG, и т.д.) <br/>
• Все параметры хранятся в теле запроса

### Параметры POST-запроса

![img_10.png](img_10.png)

• Все параметры закодированы в теле запроса <br/>
• Content-Type может быть разный (JSON, XML, и т.д.) <br/>
• В зависимости от Content-Type меняется и формат данных в теле запроса

## Сравнение GET и POST:

![img_11.png](img_11.png)

## Моменты Response

![img_12.png](img_12.png)

![img_13.png](img_13.png)