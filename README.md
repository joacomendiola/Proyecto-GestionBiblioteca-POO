<div align="center">

# 📚 Sistema de Gestión de Biblioteca

![Java](https://img.shields.io/badge/Java-17-red)
![POO](https://img.shields.io/badge/Paradigma-POO-blue)
![Persistencia](https://img.shields.io/badge/Persistencia-Archivos-orange)
![Estado](https://img.shields.io/badge/Estado-Terminado-success)

**Sistema de gestión bibliotecaria con persistencia en archivos desarrollado en Java**

</div>

---

## 📖 Descripción
Sistema de gestión para bibliotecas que permite administrar **libros, usuarios y préstamos**.  
Desarrollado aplicando **POO** y persistencia en archivos para guardar y cargar datos automáticamente.  

---

## ✨ Características

- **Gestión de Libros**: Catálogo con título y autor  
- **Administración de Usuarios**: Altas y listados  
- **Sistema de Préstamos**: Registro de préstamos y devoluciones  
- **Persistencia en Archivos**: Guardado y carga de datos en archivos CSV  
- **Consultas**: Listados de usuarios, libros y préstamos activos  

---

## 🏗️ Arquitectura POO

### Principios implementados:
- **🔄 Polimorfismo**: Métodos reutilizados en distintos contextos  
- **📦 Encapsulamiento**: Atributos privados con métodos de acceso  
- **💾 Persistencia**: Guardado y carga de datos en archivos CSV  
- **⚡ Composición**: Relaciones entre entidades (`Usuario`, `Libro`, `Prestamo`)  

---

## 💾 Sistema de Persistencia

### Gestión de Archivos
La clase `Archivo` en el paquete **utils** se encarga de:  
- Guardar datos automáticamente después de cada operación  
- Cargar datos al iniciar la aplicación  
- Manejar archivos CSV para los datos de libros  
- Formatear datos para almacenamiento y recuperación  

**Archivo utilizado:**
- `libros.csv` → Catálogo de libros  

---

## 🧪 Uso del Sistema

El sistema gestiona préstamos de libros con las siguientes funcionalidades:  
1. Registrar nuevos usuarios  
2. Registrar nuevos libros  
3. Listar usuarios y libros  
4. Realizar préstamos validando disponibilidad  
5. Procesar devoluciones de libros  
6. Consultar préstamos activos  
7. Guardar y cargar libros desde archivo CSV  

### Ejemplo de funcionamiento
- Un usuario puede registrarse y pedir libros prestados  
- Los libros prestados deben devolverse para estar disponibles nuevamente  
- Los datos se persisten automáticamente en `libros.csv`  

---

## 📂 Estructura del Código

```text
src/
├── Main.java
│
├── models/
│   ├── Usuario.java
│   ├── Libro.java
│   └── Prestamo.java
│
├── utils/
│   └── Archivo.java
│
└── service/
    └── BibliotecaService.java
```

---

## 💻 Ejemplo de Código

```java
// Crear biblioteca
BibliotecaService biblioteca = new BibliotecaService();

// Agregar usuarios
biblioteca.agregarUsuario(new Usuario(1, "María González"));
biblioteca.agregarUsuario(new Usuario(2, "Carlos López"));

// Agregar libros
biblioteca.agregrarLibro(new Libro(101, "Cien años de soledad", "Gabriel García Márquez"));
biblioteca.agregrarLibro(new Libro(102, "1984", "George Orwell"));

// Listar usuarios y libros
biblioteca.listarUsuarios().forEach(System.out::println);
biblioteca.listarLibros().forEach(System.out::println);

// Realizar un préstamo
biblioteca.prestarLibro(1, 101);

// Devolver un libro
biblioteca.devolverLibro(101);

// Guardar en archivo
Archivo.guardarLibros(biblioteca, "libros.csv");

// Cargar desde archivo
Archivo.cargarLibros("libros.csv");
```

---

## 👨‍💻 Autor
Desarrollado por **Joaquín Mendiola**  
🌐 GitHub: [joacomendiola](https://github.com/joacomendiola)  

