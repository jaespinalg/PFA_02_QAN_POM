# Automatización de pruebas Funcionales para DREZZ
Automatización de pruebas funcionales para la empresa drezz, dirigida a certificar el front de la plataforma automationpractice.com

## Pre-requisitos

* Instalar el [WebDriver] de chrome ya que este es necesario para ejecutar la automatización y agregarlo a la raiz del proyecto con el nombre (chromedriver2.exe); Validar si no se encuentra. Cabe mencionar que la aplicación que se automatizo es web por lo tanto se requiere dicho intermediario.
* Tener el [JDK] Java Development Kit como minimo en la versión 1.8.

## Instalación 

* Tener el chrome driver en la raiz del proyecto
* Clonar el proyecto de su rama [main]
* Con las siguientes combinaciones de comandos gradle se puede compilar, ejecutar
o realizar las tareas que por defecto gradle abarca. 
Para nuestro proyecto las pruebas son ejecutadas indicando una abreviación del runner que se ejecutara de manera puntual o por paquetes
generando su reporte de documentación viva.

* "gradlew build-x test"_________________//Compilar el proyecto
* "gradlew test --test *----*"_______________//Para ejecutar un runner especifico
* "gradlew test aggregate"______________//Para ejecutar toda la suit de pruebas

## Herramientas aplicadas en el diseño y ejecución

Se realiza la automatización en el sistema operativo windows.
Se utiliza Intellij como entorno de desarrollo de la automatización

Con buil.gradle se quiere mostrar las diferentes librerias que se usaron para la automatización con sus respectivas versiones

group 'co.com.certificacion'
apply plugin: 'java-library'
// Para agregar un comando que se llama aggregate, que es de Serenity y es para construir el reporte
apply plugin: 'net.serenity-bdd.aggregator'

//repositorio para el codigo fuente
repositories {
mavenLocal()
mavenCentral()
jcenter()
}

//repositorio y dependencias para configurar gradle
// Es para descargar las dependencias que configuraran a Gradle como tal, no hacen parte del codigo fuente.
buildscript {
repositories {
mavenLocal()
mavenCentral()
jcenter()
}
dependencies {
// De aqui viene el plugin aggregator que esta en la linea 4
classpath("net.serenity-bdd:serenity-gradle-plugin:2.0.80")
}
}

//dependencias del codigo fuente
dependencies {

// Dependencias para poder automatizar con Serenity
implementation 'net.serenity-bdd:serenity-junit:2.0.80'
implementation 'net.serenity-bdd:serenity-cucumber:1.9.45'
implementation 'net.serenity-bdd:serenity-core:2.0.80'
implementation 'net.serenity-bdd:serenity-gradle-plugin:2.0.80'
implementation 'org.slf4j:slf4j-simple:1.7.7'
implementation 'com.google.guava:guava:23.0'
implementation group: 'org.apache.poi', name: 'poi', version: '3.17'
implementation group: 'org.apache.poi', name: 'poi-ooxml', version: '3.17'
implementation group: 'org.apache.logging.log4j', name: 'log4j-core', version: '2.13.3'
implementation 'org.apache.commons:commons-lang3:3.1'
implementation 'org.slf4j:slf4j-simple:1.7.7'
implementation 'com.google.guava:guava:23.0'
}

## Autor

* John Alexander Espinal Gómez (Automatización completa)

## Imagenes de la automatización

[![Test-passed.png](https://i.postimg.cc/7ZZH992n/Test-passed.png)](https://postimg.cc/kBLPXxw2)

[![Reporte.png](https://i.postimg.cc/gJSqwN8t/Reporte.png)](https://postimg.cc/ZBNy2Pf6)
