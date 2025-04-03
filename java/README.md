# Spring Boot con Java ☕

Inicializar un proyecto en Java puede ser tedioso debido a la gran cantidad de configuraciones y dependencias necesarias para su correcto funcionamiento. Para simplificar este proceso, existe una herramienta llamada **Spring Initializr**, que permite generar una estructura de proyecto lista para usarse, con solo unos pocos clics.

[Sitio oficial de Spring](https://spring.io/)
[![Sitio oficial de Spring](../images/spring_home.png)](https://spring.io/)

---

[Inicializador de Spring](https://start.spring.io/)
[![Inicializador de Spring](../images/spring_initializr.png)](https://start.spring.io/)

![Significado de los campos del inicializador](../images/spring_initializr_meaning.png)

## 🧾 Explicación de los campos principales

- **Group**: Identificador del grupo u organización (similar al "dominio invertido", ej. `com.miempresa`)
- **Artifact**: Nombre del empaquetado o artefacto final (`.jar` o `.war`)
- **Name**: Nombre del proyecto (puede ser igual al Artifact)
- **Description**: Descripción opcional del proyecto
- **Package Name**: Se genera automáticamente combinando `group + artifact`
- **Packaging**: Formato de empaquetado (`Jar` o `War`)
- **Java**: Versión del JDK que se usará (por ejemplo, Java 17)

---

## 📦 Dependencias

Spring Initializr permite añadir dependencias del ecosistema de Java de forma sencilla.

![Buscador de dependencias](../images/spring_initializr_dependencies_search.png)

Solo con un clic (o enter) puedes agregar librerías que se agregan de forma automática al proyecto.

![Dependencia añadida](../images/spring_initializr_dependencie_install.png)

Para el caso de nuestro proyecto, estas serían algunas de las **dependencias principales** que podríamos utilizar:

![Dependencias necesarias](../images/spring_initializr_need_for_project.png)

También puedes explorar más librerías y herramientas compatibles desde:

- [Maven Repository](https://www.google.com/search?q=maven%20repository%20spring&sourceid=chrome&ie=UTF-8)
- [Maven Central](https://central.sonatype.com/)

---

## 🧠 IDEs recomendados

Para trabajar con Spring Boot, puedes usar:

- **Visual Studio Code**
- **IntelliJ IDEA** (Altamente recomendado por su soporte avanzado para Spring)

🔗 [Descargar IntelliJ IDEA](https://www.jetbrains.com/idea/)

Versión de paga (Ultimate):
![IntelliJ IDEA Ultimate](../images/intellj_ultimate.png)

Versión gratuita (Community):
![IntelliJ IDEA Community](../images/intellj_community.png)

Descarga el archivo .exe o .msi, ejecutalo y sigue las instrucciones, al final del proceso es necesario reiniciar tu equipo.
![IntelliJ IDEA Install](../images/intellj_ultimate_install.png)

---

continuando con el proyecto este se descarga en un .rar el cual debemos descomprimir y desde instellj idea importarlo como nuevo proyecto desde el path de tu proyecto


![IntelliJ IDEA Install](../images/intellj_idea_open_project.png)
![IntelliJ IDEA Install](../images/intellj_idea_open_project_path.png)

al abrir proyectos por primera vez te mostrara un anuncio de seguridad, en caso se ejecute algun script malicioso, pero al venir desde el propio inicializador de spring no debemos preocuparnos por ello, por lo que podemos confiar en su ejecucion

![IntelliJ IDEA Install](../images/intellj_idea_open_project_security.png)

---

## 📂 Explorando la estructura del proyecto Spring Boot

Una vez cargado el proyecto en IntelliJ IDEA o tu IDE favorito, lo primero es **entender la estructura base** que ha sido generada.

> ⚠️ **Importante:** Asegúrate de tener instalado el **JDK 21 (LTS)** u otras.  
> De lo contrario, el IDE **no podrá compilar ni ejecutar** la aplicación correctamente.

---

### 📁 Estructura inicial de archivos (lo esencial)

```
└── 📁tasks
    └── 📁.mvn
        └── 📁wrapper
            └── maven-wrapper.properties
    └── 📁src
        └── 📁main
            └── 📁java
                └── 📁com
                    └── 📁eficientis
                        └── 📁projects
                            └── 📁tasks
                                └── TasksApplication.java
            └── 📁resources
                └── application.properties
                └── 📁static
                └── 📁templates
    └── .gitattributes
    └── .gitignore
    └── HELP.md
    └── mvnw
    └── mvnw.cmd
    └── pom.xml
```

### 🛠️ pom.xml
Este archivo contiene la configuración del proyecto en formato XML. Fue generado automáticamente por [Spring Initializr](https://start.spring.io/). Aquí se definen: 

* La versión de Spring Boot
* El grupo y artefacto del proyecto
* La versión de Java
* Las dependencias (librerías externas)
* Configuración de compilación (build)


### 📄 Estructura base del pom.xml (sin dependencias)
```xml
<?xml version="1.0" encoding="UTF-8"?>
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.4.4</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.eficientis.projects</groupId> <!-- name of packaging -->
	<artifactId>tasks</artifactId> <!-- name of artifact -->
	<version>0.0.1-SNAPSHOT</version> <!-- versionado -->
	<name>tasks</name> <!-- name of project -->
	<description>Demo project for Spring Boot</description>
    
    <!-- propiedades o valores globales dentro de xml -->
	<properties>
		<java.version>21</java.version> <!-- version jdk -->
	</properties>

    <!-- dependencias -->
	<dependencies>
	</dependencies>

    <!-- xd nose -->
	<build>
		<plugins>
		</plugins>
	</build>

</project>

```

### 📦 Ejemplo de dependencia en pom.xml

```xml
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
			<optional>true</optional> <!-- opcional, depende de la dependencia -->
			<scope>runtime</scope> <!-- opcional, depende de la dependencia -->
			<version>runtime</version> <!-- opcional, depende de la dependencia -->
		</dependency>
        ...
<dependencies>
```

En caso necesites una nueva dependencia tendrias que copiar el fragmento del proyecto, del proveedor de dependencias

> Spring Initializr: Algo practico seria agrega una dependencia al proyecto desde initializr entrar a la vista previa y copiar del pom.xml y pegar directamente al pom.xml de tu proyecto descargado

![Spring pom.xml](../images/spring_pom_dependency.png)

> Maven Repository. Aplicaria el mismo ejemplo con maven y copiarias la version más recomendada para tu proyecto

![Spring pom.xml](../images/mvn_search_dependency.png)
![Spring pom.xml](../images/mvn_dependency_cloud.png)

### Punto de entrada de la aplicacion

./tasks/src/main/java/com.eficientis.tasks/TaskApplicatio.java

```java
package com.eficientis.projects.tasks; // indica que ubicacion tiene en el paquete

// importaciones para los decoradores, indican desde donde provienen
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // marca el punto de entrada de tu aplicación
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

}
```

> @SpringBootApplication ->  Esto permite que Spring Boot detecte todos los módulos, servicios y configuraciones necesarias para iniciar la aplicación sin configuración manual.

___


[Guia de estructuracion DDD + Arq. Hexagonal](https://medium.com/@juannegrin/construyendo-una-restful-api-con-spring-boot-integraci%C3%B3n-de-ddd-y-arquitectura-hexagonal-af824a3a4d05) 