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

![Búsqueda de dependencias](../images/spring_initializr_dependencies.png)

![Buscador de dependencias](../images/spring_initializr_dependencies_search.png)

Solo con un clic puedes agregar librerías que se integran de forma automática al proyecto.

![Dependencia añadida](../images/spring_initializr_dependencie_install.png)

Para el caso de nuestro proyecto, estas serían algunas de las **dependencias principales** que podríamos utilizar:

![Dependencias necesarias](../images/spring_initializr_need_for_project.png)

También puedes explorar más librerías y herramientas compatibles desde:

- [Maven Repository](https://mvnrepository.com/)
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