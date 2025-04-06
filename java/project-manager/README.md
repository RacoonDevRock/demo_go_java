```
📁main
├── 📁java.com.eficientis
│           └── 📁project
│               └── ProjectManagerApplication.java       ✅ (punto de entrada principal)
│               └── 📁projects                           ✅ (vertical slice: "proyectos")
│                   ├── 📁application                    ✅ capa de aplicación (casos de uso)
│                   │   ├── 📁dto                         ✅ entrada/salida de datos
│                   │   ├── 📁excepcion                   ✅ excepciones de negocio (bien ubicadas)
│                   │   ├── 📁ports
│                   │   │   └── 📁in                      ✅ puertos de entrada (interfaces)
│                   │   └── 📁service                     ✅ implementación de casos de uso
│                   ├── 📁domain                          ✅ capa de dominio (núcleo)
│                   │   ├── 📁model                       ✅ entidades, value objects
│                   │   ├── 📁repository                  ✅ puertos de salida
│                   │   └── 📁service                     ⚠️ (puedes dejarla vacía o usarla para servicios de dominio si aplican)
│                   └── 📁infrastructure                 ✅ capa técnica (implementaciones)
│                       ├── 📁adapter                     ⚠️ aún sin uso, pero útil si usas otros canales como mensajes, CLI, etc.
│                       ├── 📁controller                  ✅ controladores REST (adaptador de entrada)
│                       ├── 📁persistence                 ✅ mapeo a base de datos
│                       │   ├── 📁mapper                  ✅ mapeador entidad ↔ dominio
│                       │   └── ProjectEntity.java        ✅ entidad JPA
│                       └── 📁repository                  ✅ repositorio concreto
│                           ├── 📁impl                    ✅ implementación real
│                           └── IProjectRepository.java   ✅ JpaRepository
```