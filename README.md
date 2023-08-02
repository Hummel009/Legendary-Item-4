Всем привет!

Я - разработчик различных модов для Minecraft, включая этот. Я выложил здесь новейший исходный код мода на всех версиях майнкрафта. Надеюсь, что кому-нибудь это пригодится в качестве основы для собственного мода.

Приведённая ниже документация будет полезна как разработчикам, так и мне самому из будущего. Сведения, гайды, подводные камни, советы и всё такое. Обязательно прочитайте, здесь есть уникальная информация, которой больше нигде нет.

<h2> Общая информация </h2>

* Версии 1.3.2 - 1.6.4 используют Voldeloom - аналог Forge, позволяющий вести разработку на устаревших версиях. Он другими методами делает то же, что и древний Forge, но с применением новейших технологий. 
  * В итоге эти Gradle-проекты можно просто импортировать в Eclipse или открыть через IntelliJ IDEA, чтобы Gradle сам запустил установку среды.
  * Чтобы запустить мод из среды, выполните Gradle Task "runClient", либо откройте консоль Windows в папке среды и введите "gradlew runClient".
    * После первого запуска может запуститься чистый Minecraft без вашего мода, это норма. В следующие разы всё будет нормально.
  * Чтобы скомпилировать мод, ничего не нужно делать. Потому что runClient, который вы будете часто выполнять, сам же и компилирует мод. Таковы особенности Voldeloom'a.
  * Готовый мод лежит в папке build/libs.
* Версия 1.7.10 доступна в двух вариантах, древний Forge и Voldeloom. Второй вариант ничем не отличается от пункта выше, а вот первый вариант (по умолчанию) имеет отличия.
  * Версия старая, как и ForgeGradle, так что просто импортировать проекты нам нельзя. Нужна костыльная генерация среды. В папке есть два батника, setupEclipse и setupIntellij. Выбираем нужный, ждём окончания.
  * После окончания генерации среды мы импортируем сгенерированный проект IDE. Именно проект IDE! Это не Gradle-проект.
    * В случае Eclipse мы импортируем всю папку как "существующий Eclipse-проект".
    * В случае IntelliJ IDEA мы открываем файл .ipr. Потом, после открытия, крайне рекомендуется в меню File -> Manage IDE Settings конвертировать проект в folder-based, иначе багов и зависаний не миновать.
	* Существуют фокусы с открытием файла проекта Eclipse (.project) через IntelliJ IDEA, там нужно добавить модуль. Работать будет, но зачем всё это?
  * Для запуска игры используем два разных подхода.
    * В случае IntelliJ IDEA у нас уже сгенерированы сверху два варианта запуска, клиент и сервер. Сервер не работает, это норма.
	* В случае Eclipse мы должны создать новую конфигурацию запуска. Файл входа - это GradleStart.
  * Для сборки используем консоль Windows в папке среды, где нужно ввести "gradlew build".
  * Готовый мод лежит в папке build/libs.
* Версии 1.8.9 - 1.11.2 ничем не отличаются от древнего Forge сценария в 1.7.10.
* Версии 1.12.2 - 1.20.1 - это современный Forge, хотя установка и работа со средой больше похожи на Voldeloom.
  * Gradle-проекты можно просто импортировать в Eclipse или открыть через IntelliJ IDEA, чтобы Gradle сам запустил установку среды.
  * Чтобы запустить мод из среды, нужно сгенерировать запуски. Выполните Gradle Task "genEclipseRuns"/"genIntellijRuns", либо откройте консоль Windows в папке среды и введите "gradlew genEclipseRuns"/gradlew genIntellijRuns".
  * Для компиляции используем gradlew build, как в 1.7.10 и далее.
  * Готовый мод лежит в папке build/libs.
  
Несколько примечаний:

* Eclipse иногда, ввиду плохого интернета, может повредить скачиваемый файл и настройка среды сорвётся. И потом никогда не починится. Придётся всё сделать через IntelliJ IDEA, а уже потом импортировать среду в Eclipse.
* Очевидно, что на древних Forge-версиях мы не устанавливали Gradle-проект, а запустили древнюю костыльную генерацию, так что на этих версиях нет никаких Gradle tasks. Всё делается через консоль в папке среды.
* Вообще-то 1.7.10 можно импортировать, и тогда будут Gradle Tasks, но игру нельзя будет запустить из среды. Для исправления можно сначала импортировать, потом запустить костыльную генерацию, потом добавить запуски (файл входа - GradleStart) и потом удалить ненужные файлы проектов (.ipr, .iws, .project, .classpath).
* Версия 1.12.2 может нормально не запускаться с в IntelliJ IDEA, но в Eclipse всё будет нормально.

<h2> Сведения об используемых JDK/SDK & Compiler Compliance Level/Language Level </h2>

У Minecraft, Forge, ForgeGradle, Voldeloom и Gradle есть свои требования к установленной версии Java и допуску её синтаксиса (с годами в язык добавляют новые конструкции, для которых ещё нет поддержки у вышеуказанных технологий). Таким образом, ваша IDE должна быть настроена следующим образом:

* Версии 1.3.2 - 1.6.4 используют Java 11 + допуск синтаксиса 6.
* Версия 1.7.10 доступна в двух вариантах.
  * Версия по умолчанию использует Java 8 + допуск синтаксиса 8.
  * Версия запасная использует Java 11 + допуск синтаксиса 8.
* Версии 1.8.9 - 1.16.5 используют Java 8 + допуск синтаксиса 8.
* Версия 1.17.1 использует Java 16 + допуск синтаксиса 16.
* Версии 1.18.2 - 1.20.1 используют Java 17 + допуск синтаксиса 17.

Java в Eclipse называется JRE/JDK, в IntelliJ IDEA - SDK. Допуск синтаксиса в Eclipse называется Compiler Compliance Level, в Intellij IDEA - Language Level.

Важно помнить, что допуск синтаксиса выше приведён как верхняя граница. Можно выбрать сколь угодно малый допуск, тогда вы будете вынуждены использовать только самые древние конструкции языка, но это будет работать нормально.
  
<h2> Сведения об используемых ForgeGradle/Voldeloom & Gradle </h2>

Всем известно, что старые среды разработки Minecraft медленно умирают из-за удаления их зависимостей из Интернета. А другие иногда используют устаревший ForgeGradle, который можно было бы и обновить. В целом, чем меньше версий Gradle придётся скачать, тем лучше. Поэтому я отредактировал/пропатчил скачанные версии Forge. А именно: я вырезал все ненужные файлы и максимально обновил версии Gradle и ForgeGradle. 

* Версии 1.3.2 - 1.6.4 используют Voldeloom 2.4 + Gradle 8.1.1.
* Версия 1.7.10 доступна в двух вариантах.
  * Версия по умолчанию использует Anatawa12's ForgeGradle:1.2 + Gradle 8.1.1
  * Версия запасная использует Voldeloom 2.4 + Gradle 8.1.1
* Версия 1.8.9 использует ForgeGradle 2.1-SNAPSHOT + Gradle 2.14
* Версии 1.9.4 - 1.11.2 используют ForgeGradle 2.2-SNAPSHOT + Gradle 2.14
* Версии 1.12.2 - 1.20.1 используют ForgeGradle 6.0-6.2 + Gradle 8.1.1

Эти же комбинации сборочных машин лежат по архивам в папке forges. Вы можете использовать их вместо скачивания официальных Forge Src/Mdk на их сайте.

<h2> Будущее мода (или прошлое?) </h2>

Меня всегда привлекала идея выпустить мод для каждой основной версии Minecraft. Поэтому мод будет поддерживаться на всех версиях как можно дольше.

Мод уже существует на всех версиях от 1.3.2 до 1.20.1 включительно. Огромная благодарность [этому проекту и его автору](https://github.com/CrackedPolishedBlackstoneBricksMC/voldeloom)! Он сделал все, чтобы устаревшие среды разработки заработали в 2023 году. Только благодаря его проекту я смог создать свой мод для версий 1.3.2, 1.4.7, 1.5.2 и 1.6.4.

Недавно я открыл для себя такую программу, как RetroMCP, которая позволяет создавать моды на любую версию от Minecraft Alpha до 1.2.5. Однако это не Forge, это просто редактирование игры, как в старые добрые времена. Времена, когда моды были частенько несовместимы друг с другом, из-за чего и был придуман ModLoader & Forge. В общем, у меня пока нет намерения выпустить мод на эти версии.