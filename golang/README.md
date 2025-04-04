# Golang

Go o [Golang](https://go.dev/), desarrollado por Google, con un diseño y estilo simplista. Mutliples veces usado para servidores, backends, APIs, debido a su velocidad y soporte de alta concurrencia.

## Instalacion de Goalng
Para ejecutar sus archivos es necesario descargar el compilador y su paquete de herramientas
🔗 [Toolchain](https://go.dev/doc/install)

![Golang install page](../images/go_install.png)
> Posteriormente puedes comprobar su instalacion en la consola con el comando ```go version``` y configurar correctamente variables de entorno.

## ⚙️ Configuración de variables de entorno
En sistemas operativos como Windows es importante establecer el PATH para Go:

* GOROOT: Directorio donde está instalado Go.
* GOPATH: Carpeta donde se almacenarán tus proyectos (por defecto: C:\Users\TuUsuario\go).
* PATH: Añadir %GOROOT%\bin y %GOPATH%\bin para poder usar go desde la terminal.

![Environment variables GOROOT and GOPATH](../images/go_root_path.png)

![Environment variables PATH](../images/path_go.png)

# 📁 Estructura básica de un proyecto Go
Con Go, puedes crear un proyecto desde la consola:

```go
go mod init github.com/usuario/nombre-proyecto
```

## 📦 Gestión de dependencias (Módulos Go) - Funcionamiento básico
Go hoy en dia funciona con un sistema de módulos, que permite declarar y [resolver dependencias](https://go.dev/doc/modules/managing-dependencies) sin necesidad de herramientas externas como Maven o Gradle.

* ``go mod tidy``: Limpia y descarga dependencias necesarias.
* ``go get`` <paquete>: Agrega una nueva dependencia.
* ``go build``: Compila la aplicación.
* ``go run main.go``: Ejecuta tu código directamente.
* ``go test``: Ejecuta pruebas.

Ejemplo:
```bash
go get github.com/gin-gonic/gin
```
Luego de ejecutar el comando y se instale la dependencia, se creara una archivo ``go.sum``, guarda un registro criptográfico de las librerias/dependencias descargadas:
![Screen for download dependency](../images/download_proof.png)

El archivo go.mod almacenará la declaracion de todas las dependencias usadas
![Go.mod file](../images/suggest_clean_dependencies.png)

En caso tengas una proyecto con multiples dependencias, incluso muchas sin usar, puede ejecutar el comando ``go mod tidy``, ayudara a ordener las dependencias y descargarlas las necesarias, que estes usando.

Todas las dependencias se manejan desde el archivo go.mod, sin archivos XML o configuraciones adicionales.

## 💡 IDEs recomendados

* [Visual Studio Code](https://code.visualstudio.com/) con la extensión oficial de Go (Altamente recomendado)
* [GoLand](https://www.jetbrains.com/es-es/go/) (Recomendado por gran cantidad de funcionalidades avanzadas, version de paga)