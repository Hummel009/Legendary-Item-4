[![Code Smells][code_smells_badge]][code_smells_link]
[![Maintainability Rating][maintainability_rating_badge]][maintainability_rating_link]
[![Security Rating][security_rating_badge]][security_rating_link]
[![Bugs][bugs_badge]][bugs_link]
[![Vulnerabilities][vulnerabilities_badge]][vulnerabilities_link]
[![Duplicated Lines (%)][duplicated_lines_density_badge]][duplicated_lines_density_link]
[![Reliability Rating][reliability_rating_badge]][reliability_rating_link]
[![Quality Gate Status][quality_gate_status_badge]][quality_gate_status_link]
[![Technical Debt][technical_debt_badge]][technical_debt_link]
[![Lines of Code][lines_of_code_badge]][lines_of_code_link]

Legendary Item - простенький мод, который добавляет множество артефактов "Властелина колец" в Minecraft. В основном это
оружие, а также аркенстон и сильмарилль. Почти все оружия имеют особый рендеринг: в инвентаре они имеют одну текстуру, а
в руке от первого и третьего лица - другую, увеличенную. Так оружие смотрится эпичнее. Мод рассматривается как
тематические дополнение к моду "Властелин колец", хотя мод независим и не требует установки каких-либо других модов.

## Общая информация

Этот репозиторий - мультимодульный проект, который должен быть открыт через IntelliJ IDEA.

| Версия Minecraft | Gradle | Плагин сборки            | Gradle JDK | Project JDK | Toolchain JDK | Syntax |
|------------------|--------|--------------------------|------------|-------------|---------------|--------|
| 1.3.2 - 1.6.4    | 8.5    | Voldeloom 2.5-SNAPSHOT   | 21.0.1     | 21.0.1      | 11.0.21       | 6      |
| 1.7.10, 1.12.2   | 8.5    | RetroFuturaGradle 1.3.28 | 21.0.1     | 21.0.1      | 1.8.0_392     | 8      |
| 1.8.9            | 2.14   | ForgeGradle 2.1-SNAPSHOT | 1.8.0_392  | 1.8.0_392   | 1.8.0_392     | 8      |
| 1.9.4 - 1.11.2   | 2.14   | ForgeGradle 2.2-SNAPSHOT | 1.8.0_392  | 1.8.0_392   | 1.8.0_392     | 8      |
| 1.13.2 - 1.16.5  | 8.5    | ForgeGradle 6.0.16,6.2   | 21.0.1     | 21.0.1      | 1.8.0_392     | 8      |
| 1.17.1           | 8.5    | ForgeGradle 6.0.16,6.2   | 21.0.1     | 21.0.1      | 16.0.2        | 16     |
| 1.18.2 и новее   | 8.5    | ForgeGradle 6.0.16,6.2   | 21.0.1     | 21.0.1      | 17.0.9        | 17     |

### Примечания к таблице

* Gradle JDK - это Java, при помощи которой запускается скрипт сборки среды. Обычно это та Java, которая установлена
  глобально на компьютере, которая запускает программы и которая отражена в переменных средах. По идее, может быть сколь
  угодно новой и современной, кроме двух случаев, где она застряла на версии 1.8.
* Project JDK - это Java, при помощи которой запускается мод в среде разработки. Обычно равна версии из Gradle JDK или
  Toolchain JDK. По идее, может быть сколь угодно новой и современной, кроме двух случаев, где она застряла на версии
  1.8.
* Toolchain JDK - это Java, которая используется при генерации среды разработки и компиляции мода. Эта Java должна быть
  скачана и находиться на диске, не обязательно в переменных средах. Менять её в проекте нельзя, иначе Forge, ожидающий
  байткод определённой версии, будет неприятно удивлён и крашнет игру.
* Syntax - синтаксис Java, используемый в файлах с кодом. Программист не должен использовать синтаксис более новой
  версии, чем указан в таблице. Более старый - можно, но зачем?

## Установка

> [!IMPORTANT]
> Раздел написан для новичков - пошагово и с расчётом на то, что на компьютере ничего не настроено и не установлено.

Первым делом нужно скачать репозиторий и разархивировать его в любое место на диске. Если всё сделано правильно, вы
должны увидеть множество папок, рядом с которыми находится файл `settings.gradle.kts` и другие.
Полученную папку будем называть ***папкой проекта***.

### Установка нужных версий JDK

У вас на компьютере уже могут находиться установленные JRE или JDK, но мы будем исходить из худшего и скачаем новые.

* Запустите IntelliJ IDEA.
* Нажмите сочетание клавиш `Ctrl + Alt + Shift + S`.
* В открывшемся окне в списке параметров слева нажмите `SDKs`. Сверху нажмите `+`, `Download JDK`.
* В открывшемся окне выберите вендора `Eclipse Temurin`, а версию посмотрите в таблице из первого раздела.
  Нажмите `Download`.
* Повторите это столько раз, сколько версий JDK вам нужно установить, согласно таблице. В общей сложности, для всех
  проектов в этом репозитории вам потребуется JDK 1.8, 11, 16, 17.

Если всё сделано правильно, то вы должны увидеть несколько скачанных JDK в папке пользователя. В моём случае,
это `C:\Users\Hummel009\.jdks`.

### Конфигурация переменных сред Windows

У вас на компьютере уже могут быть сконфигурированы другие JRE и JDK. Чтобы не было конфликтов, мы удалим все старые
настройки и поставим новые.

* Нажмите `Win + R` и введите `systempropertiesadvanced`. Нажмите `OK`.
* В открывшемся окне нажмите `Переменные среды`.
* В открывшемся окне вы увидите два раздела - переменные среды для пользователя и для системы.
    * Проверьте оба раздела на наличие там переменной с названием `JAVA_HOME`.
        * Если она есть, дважды кликните по ней ЛКМ и введите в значение путь к скачанной ранее JDK. В моём случае,
          это `C:\Users\Hummel009\.jdks\temurin-21.0.1`.
        * Если её нет, создайте там переменную с таким именем и введите значение, как в пункте выше.
        * Если их несколько, удалите все, кроме одной, а оставшуюся настройте, как в пункте выше.
    * Проверьте оба раздела на наличие там переменной с названием `Path`. Она есть у каждого пользователя и представляет
      собой таблицу из путей.
        * Проверьте все пути в обеих переменных `Path` и удалите все строчки с
          упоминанием `Java`, `Oracle`, `jre`, `jdk`.
        * Только в одной из двух переменных `Path` создайте новую строку и введите в неё `%JAVA_HOME%\bin`.

> [!NOTE]
> После настройки сред иногда требуется перезагрузка компьютера, а иногда нет.

Попробуйте в любом месте компьютера открыть консоль Windows и введите команду `java -version`. Если всё сделано
правильно, то консоль выдаст следующее:

```
openjdk version "21.0.1" 2023-10-17
OpenJDK Runtime Environment Temurin-21.0.1+9 (build 21.0.1+9)
OpenJDK 64-Bit Server VM Temurin-21.0.1+9 (build 21.0.1+9, mixed mode, sharing)
```

Теперь можно приступать к, собственно, работе с проектом. Подход зависит от того, мод на какую версию Minecraft вы
собираетесь открывать.

### Версии, не использующие ForgeGradle 2.X

Это версии, использующие относительно современное программное обеспечение, поэтому их установка проходит проще и
быстрее. Все эти версии являются модулями и открываются как один проект, который вы скачали.

* Запустите IntelliJ IDEA.
* Откройте папку проекта: `File -> Open -> [выбираете папку] -> OK`. Сразу после открытия начнётся установка среды. Если
  от вас потребуется разрешение на скачивание файлов, дайте его. Спустя некоторое время все необходимые файлы скачаются,
  и среда будет готова к работе. Скачивание может занять вплоть до нескольких часов!

Если всё сделано правильно, то вы увидите проект без сообщений об ошибке и с подсветкой синтаксиса в файлах с кодом.

### Версии, использующие ForgeGradle 2.X

Это версии, использующие очень старое программное обеспечение, поэтому их установка проходит дольше и сложнее. К тому же
они не могут являться модулями одного проекта в IntelliJ IDEA, так что каждый из них придётся открывать отдельно.

* Снова откройте переменные среды и замените значение вашего `JAVA_HOME` на скачанный ранее JDK 1.8. В моём случае,
  это `C:\Users\Hummel009\.jdks\temurin-1.8.0_392`.
* Откройте внутри папки проекта папку с названием версии и двойным нажатием ЛКМ запустите `setupIdea.bat`, подождите
  окончания.
* По завершении установки среды вы увидите в папке файл с расширением `.ipr`.
* Запустите IntelliJ IDEA.
* Откройте файл `.ipr` проекта: `File -> Open -> [выбираете папку, нажимаете на файл с расширением .ipr] -> OK`. Сразу
  после открытия среда будет готова к работе.
* В меню `File -> Manage IDE Settings -> Save as Directory-Based Format` конвертируйте среду. IntelliJ IDEA
  перезапустится.

Если всё сделано правильно, то вы увидите проект без сообщений об ошибке и с подсветкой синтаксиса в файлах с кодом.

## Основы работы

После установки среды весь необходимый инструментарий готов к работе. Инструментарий может немного отличаться в
зависимости от того, какой плагин сборки использует данная версия. Согласно таблице из первого раздела, это может быть
Voldeloom, RetroFuturaGradle, ForgeGradle 2.X, ForgeGradle 6.X.

Большая часть функционала располагается в меню Gradle. Меню можно открыть следующим
образом: `View -> Tool Windows -> Gradle`.

### Voldeloom

Современный плагин для самых старых версий Minecraft. Самые важные функции:

* Запуск клиента из среды: `Меню Gradle -> Tasks -> volde.run -> runClient`.
* Компиляция мода в файл с расширением `.jar`: `Меню Gradle -> Tasks -> build -> build`. После компиляции ваш мод
  появится в папке `папка_проекта/build/libs`. Вас интересует тот файл, который без приписки `-dev.jar`.

### RetroFuturaGradle

Современный плагин для популярнейших из относительно старых версий Minecraft. Самые важные функции:

* Генерация исходного кода Minecraft: `Меню Gradle -> Tasks -> modded minecraft -> setupDecompWorkspace`. Эта функция
  исправляет проблему, из-за которой весь ваш код горит красным цветом после установки среды.
* Запуск клиента из среды: `Меню Gradle -> Tasks -> modded minecraft -> runClient`.
* Запуск локального сервера из среды: `Меню Gradle -> Tasks -> modded minecraft -> runServer`. К нему можно подключиться
  из клиента, введя в качестве адреса `localhost`.
* Компиляция мода в файл с расширением .jar: `Меню Gradle -> Tasks -> build -> build`. После компиляции ваш мод появится
  в папке `папка_проекта/build/libs`. Вас интересует тот файл, который без приписки `-dev.jar`.

### ForgeGradle 2.X

Очень старый плагин для относительно старых версий Minecraft. Самые важные функции:

* Запуск клиента из среды здесь осуществляется кнопкой с зелёным треугольником в верхней части окна.
* Компиляция мода в файл с расширением `.jar` осуществляется в папке проекта посредством двойного нажатия ЛКМ на
  файл `build.bat`. После компиляции ваш мод появится в папке `папка_проекта/build/libs`.

### ForgeGradle 6.X

Новейший плагин для новых версий Minecraft. Самые важные функции:

* Запуск клиента из среды: `Меню Gradle -> Tasks -> forgegradle runs -> runClient`.
* Компиляция мода в файл с расширением .jar: `Меню Gradle -> Tasks -> build -> build`. После компиляции ваш мод появится
  в папке `папка_проекта/build/libs`.

## Папка Forges

В этой папке я храню свои пропатченные версии Voldeloom, RetroFuturaGradle и Forge. В чём их преимущество?

* Я постарался унифицировать и максимально обновить версии Gradle и плагинов. Получается очень значительная экономия
  интернета и места на диске.
* Я использовал плагины для старых версий, которые на данный момент непригодны к разработке через официальный устаревший
  Forge.
* Я использую Kotlin Gradle DSL для более строгого синтаксиса с подсветкой, подсказками и хорошей поддержкой со стороны
  IDE.

<!----------------------------------------------------------------------------->

[code_smells_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Legendary-Item&metric=code_smells

[code_smells_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Legendary-Item

[maintainability_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Legendary-Item&metric=sqale_rating

[maintainability_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Legendary-Item

[security_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Legendary-Item&metric=security_rating

[security_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Legendary-Item

[bugs_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Legendary-Item&metric=bugs

[bugs_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Legendary-Item

[vulnerabilities_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Legendary-Item&metric=vulnerabilities

[vulnerabilities_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Legendary-Item

[duplicated_lines_density_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Legendary-Item&metric=duplicated_lines_density

[duplicated_lines_density_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Legendary-Item

[reliability_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Legendary-Item&metric=reliability_rating

[reliability_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Legendary-Item

[quality_gate_status_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Legendary-Item&metric=alert_status

[quality_gate_status_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Legendary-Item

[technical_debt_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Legendary-Item&metric=sqale_index

[technical_debt_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Legendary-Item

[lines_of_code_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Legendary-Item&metric=ncloc

[lines_of_code_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Legendary-Item
