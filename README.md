# JAVA

<p align="center" width="100%">
    <img  src="docs/assets/images/bacsystem.jpeg" alt="bacsystem" width="30%">
</p>

<!-- TOC -->
* [JAVA](#java)
* [📋 Contenido Temático](#-contenido-temático)
* [💻 Lenguaje de programación Java](#-lenguaje-de-programación-java)
  * [📆 Historia java](#-historia-java)
  * [⛏️ Usos](#-usos)
  * [⚙️ Funcionamiento](#-funcionamiento)
  * [🔖 Características](#-características)
  * [🧰 Java Development Kit - JDK](#-java-development-kit---jdk)
  * [🖥️ Máquina virtual de Java - JVM](#-máquina-virtual-de-java---jvm)
  * [💾 Archivos de instalación](#-archivos-de-instalación)
  * [🧪 Variables de entorno](#-variables-de-entorno)
  * [📦 Archivos JAR, WAR y EAR](#-archivos-jar-war-y-ear)
  * [📼 IDE Java](#-ide-java)
  * [🛠️ Herramientas de construcción de proyectos](#-herramientas-de-construcción-de-proyectos)
* [Estructura básica de Java](#estructura-básica-de-java)
<!-- TOC -->

# 📋 Contenido Temático

# 💻 Lenguaje de programación Java

## 📆 Historia java

**Java** es un lenguaje de programación y plataforma informática creado y vendido por Sun Microsystems en 1995.

Inicialmente, comienza a desarrollarse en 1991 para tarjetas inteligentes y sintonizadores de TV.

Es un **lenguaje orientado a objetos** que tiene como objetivo permitir a los desarrolladores de aplicaciones escribir
un programa una vez y ejecutarlo en cualquier dispositivo.

**Java** es un lenguaje de programación ampliamente utilizado para codificar aplicaciones web. Ha sido una opción
popular entre los desarrolladores durante más de dos décadas, con millones de aplicaciones Java en uso en la actualidad.
Java es un lenguaje multiplataforma, orientado a objetos y centrado en la red que se puede utilizar como una plataforma
en sí mismo. Es un lenguaje de programación rápido, seguro y confiable para codificarlo todo, desde aplicaciones móviles
y software empresarial hasta aplicaciones de macrodatos y tecnologías del servidor.

Basado en C++

Inicialmente llamado Oak, pero finalmente fue renombrado a Java.

Lanzado públicamente y oficial en 1996 incluyendo Soporte web.

En 1988 aparecen versiones de Java EE.

## ⛏️ Usos

**¿Para qué se utiliza el lenguaje de programación Java?**

1. [x] Desarrollo de videojuegos
2. [x] Computación en la nube
3. [x] Macrodatos
4. [x] Inteligencia artificial
5. [x] Internet de las cosas
6. [x] Aplicaciones móviles
7. [x] Aplicaciones web
8. [x] Software empresarial
9. [x] Aplicaciones de escritorio
10. [x] Apps para Android

## ⚙️ Funcionamiento

El **código** Java se escribe por primera vez en el kit de desarrollo de Java, que está disponible para Windows, Linux y
macOS.

Los **lenguajes informáticos de alto nivel** son más fáciles de leer, escribir y depurar, pero debe haber un compilador
entre el lenguaje de programación y la máquina informática para compilar o interpretar el código de modo que pueda
ejecutarse en un lenguaje que la computadora pueda entender.

**Java** es un lenguaje portátil que puede ejecutarse en cualquier sistema operativo. El código de programa escrito en
Java se compila en un formato especial llamado código de bytes y luego se ejecuta en la máquina virtual Java (JVM). Esto
significa que el código Java se puede ejecutar en cualquier plataforma con una JVM instalada, lo que lo hace
independiente del sistema operativo. Un programa Java consta de uno o más archivos de código fuente con la extensión
`.java` que contienen instrucciones escritas en el lenguaje Java.

Estos archivos se compilan utilizando el compilador javac, que produce archivos con una extensión `.class` que
contienen código de bytes. Estos archivos de código de bytes se pueden ejecutar en cualquier plataforma donde esté
instalada la JVM.

Java también proporciona una gran cantidad de bibliotecas estándar para funciones comunes como procesamiento de
entrada/salida, redes y desarrollo de interfaz gráfica de usuario. Estas bibliotecas están disponibles para todos los
programas Java y se incluyen automáticamente cuando el programa se compila y ejecuta.

**En resumen**, Java es un lenguaje de programación que se compila en código de bytes y se ejecuta en una máquina
virtual, lo que permite que el código del programa se ejecute en cualquier plataforma donde esté instalada la JVM y
proporciona una gran cantidad de bibliotecas estándar para facilitar el desarrollo de aplicaciones.

`Diagrama`:

<p align="center" width="100%">
    <img width="80%" src="docs/assets/images/890c2a19-d49a-4d9a-b8af-3ddcd84df612.png" alt="bacsystem">
</p>

## 🔖 Características

**¿Cuáles son las características principales de Java?**

Algunas de las características principales de la plataforma y el lenguaje de programación Java son:

1. [x] **_Orientado a objetos_**: es un lenguaje orientado a objetos, lo que significa que se basa en los conceptos de
   objetos
   y categorías para organizar y estructurar el código.
2. [x] **_Multiplataforma_**: es independiente de la plataforma, lo que significa que el código Java se puede ejecutar
   en
   cualquier sistema operativo o dispositivo compatible con Java sin necesidad de recompilar el código.
3. [x] **_Seguridad_**: las funciones de seguridad integradas ayudan a proteger su sistema de amenazas externas.
4. [x] **_Gestión automática de la memoria_**: libera automáticamente la memoria utilizada por los objetos que ya no
   están en
   uso.
5. [x] **_Subprocesos múltiples_**: permite que varios subprocesos se ejecuten en paralelo, lo que permite que las
   aplicaciones realicen múltiples tareas simultáneamente.
6. [x] **_API integrada_**: Tiene una gran cantidad de API (interfaces de programación de aplicaciones) integradas que
   permiten a los desarrolladores utilizar diversas funciones y herramientas para crear aplicaciones.
7. [x] **_Popularidad_**: Es uno de los lenguajes de programación más populares y utilizados en el mundo. Se utiliza
   principalmente para el desarrollo de aplicaciones empresariales y el desarrollo de aplicaciones de Android.
8. [x] Aplicaciones de escritorio, ventanas y web.
9. [x] Recolector de basura (proceso bajo nivel que se ejecuta en segundo plano que eliminar elementos de la memoria)
10. [x] Lenguaje fuertemente `tipado`

## 🧰 Java Development Kit - JDK

**El Java Development Kit (JDK)** es una colección de herramientas de software que se pueden utilizar para desarrollar
aplicaciones Java. Puede configurar el JDK en su entorno de desarrollo descargándolo e instalándolo. Seleccione la
versión del software JDK que corresponda a la versión de Java que desea utilizar. Por ejemplo, Java Standard Edition o
Java SE requiere el kit de desarrollo Java (JDK) de Java SE.

## 🖥️ Máquina virtual de Java - JVM

**La JVM** es el software que ejecuta programas Java línea por línea. Los desarrolladores configuran los ajustes de JVM
para administrar los recursos de la aplicación cuando se inicia una aplicación Java. Por ejemplo, puede configurar los
ajustes de memoria JVM y controlar cuánta memoria interna utiliza una aplicación Java mientras se está ejecutando.

**Rol del JRE en el lenguaje de programación Java**

**Java Runtime Environment (JRE)** combina el código Java existente. Para hacer esto, utiliza el kit de desarrollo de
Java
(JDK) y un código integrado adicional llamado bibliotecas. Luego crea una instancia JVM o una copia local para
finalmente ejecutar el programa Java. Las JVM están disponibles para diferentes sistemas operativos y el JRE crea una
única copia del código Java que se puede ejecutar en todo tipo de JVM. De esta forma, el JRE contribuye a la
independencia de plataforma de las aplicaciones Java. Se pueden escribir una vez y ejecutar en cualquier lugar.

**Diferencias entre el JRE, la JVM y el JDK**

**El Java Development Kit (JDK)** es una capa de software sobre Java Runtime Environment (JRE) que contiene
compiladores,
depuradores y otras herramientas comunes a cualquier entorno de desarrollo de software. El código escrito en JDK tiene
una sintaxis similar al inglés. El JDK lo compila y transfiere el código de bytes al JRE. Por el contrario, JRE
contiene bibliotecas de clases y archivos de soporte JVM. Utilice estos componentes de software para ejecutar código
intermedio en cualquier dispositivo.

`Diagrama`:

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/4694ab6b-9ff0-4654-9ea5-278878acf59d.png" alt="bacsystem">
</p>

```link
https://www.shiksha.com/online-courses/articles/difference-between-jdk-jre-and-jvm/
```

## 💾 Archivos de instalación

1. [x] [Instalación del OpenJDK](https://jdk.java.net/)
2. [x] **Pasos de instalación:**

`Image 1`:

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/32d63196-1a88-45b9-a767-46a1ae9d91a3.png" alt="openJdk">
</p>

`Image 2`:

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/c1a81633-a829-48bd-9c74-b004ade90f13.png" alt="openJdk">
</p>

`Image 3`:

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/e233996e-1cbd-4138-aed7-37a2e7045dc2.png" alt="openJdk">
</p>

Una vez descargado el archivo JDK, extraemos el contenido y encontraremos los siguientes archivos:

`Image 4`:

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/45fde528-2fd6-4248-9d24-e0e66871105d.png" alt="openJdk">
</p>

## 🧪 Variables de entorno

**Pasos de instalación y configuración de las variables de entorno:**

Para la configuración de las variables de entorno seguiremos los siguientes pasos:

`Image 1`:

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/567f69a7-d4ec-4811-b2bd-2b4a23782066.png" alt="openJdk">
</p>

`Image 2`:

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/567f69a7-d4ec-4811-b2bd-2b4a23782066.png" alt="openJdk">
</p>

`Image 3`:

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/cede6ea3-6f05-480a-910a-b8d1facced4f.png" alt="openJdk">
</p>

`Image 4`:

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/52b54a9a-ac9a-48a3-8a91-6db71f4a1ee3.png" alt="openJdk">
</p>

`Image 5`:

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/7bafc6f5-b278-4c52-90ba-4c0bb6c0b374.png" alt="openJdk">
</p>

`Image 6`:

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/e07948dc-d25f-42d0-b59d-75529f69de31.png" alt="openJdk">
</p>

## 📦 Archivos JAR, WAR y EAR

`Image 6`:

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/fb450c1f-fa76-4020-b8ec-349e000c39e3.png" alt="openJdk">
</p>

## 📼 IDE Java

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/29dd7560-2c45-44b7-9b5c-6f9301c667b0.png" alt="openJdk">
</p>

<p align="center" width="100%">
    <img width="50%" src="docs/assets/images/a30dc380-ec37-4851-be86-b6e01b22e6c5.png" alt="openJdk">
</p>

<p align="center" width="100%" >
    <img width="50%" src="docs/assets/images/697ebe52-b6dd-4dce-86bf-84fe0e336fca.png" alt="openJdk">
</p>

## 🛠️ Herramientas de construcción de proyectos

<p align="center" width="100%" >
    <img width="40%" src="docs/assets/images/0da5d70b-9ac6-43f8-b174-ffbdf262764d.png" alt="openJdk">
</p>

````
https://maven.apache.org/what-is-maven.html
https://jdk.java.net/java-se-ri/14
````

# Estructura básica de Java