<div align="center">

# 📚 Sistema de Gestión de Biblioteca

![Java](https://img.shields.io/badge/Java-17-red)
![POO](https://img.shields.io/badge/Paradigma-POO-blue)
![Archivos](https://img.shields.io/badge/Persistencia-Archivos-green)
![Estado](https://img.shields.io/badge/Estado-Terminado-success)

**Sistema de gestión bibliotecaria con persistencia en archivos desarrollado en Java**

</div>

---

## 📖 Descripción
Sistema de gestión para bibliotecas que permite administrar **libros, usuarios, préstamos y multas**. Desarrollado aplicando **POO y persistencia en archivos** para guardar y cargar datos automáticamente. Implementa diferentes tipos de usuarios con privilegios específicos y cálculo automático de multas por retrasos.

---

## ✨ Características

- **📚 Gestión de Libros**: Catálogo completo con autores y categorías
- **👥 Administración de Usuarios**: Estudiantes y profesores con diferentes límites
- **🔄 Sistema de Préstamos**: Registro de préstamos y devoluciones
- **💰 Control de Multas**: Cálculo automático por retrasos
- **💾 Persistencia en Archivos**: Guardado automático de datos
- **📊 Consultas**: Listados de libros y préstamos activos

---

## 🏗️ Arquitectura POO

### Principios implementados:
- **🔷 Herencia**: Clase base Usuario extendida por Estudiante y Profesor
- **🔄 Polimorfismo**: Diferentes comportamientos según tipo de usuario
- **📦 Encapsulamiento**: Atributos privados con métodos de acceso
- **💾 Persistencia**: Guardado y carga de datos en archivos
- **🔗 Composiciones**: Relaciones entre entidades del sistema

---

## 👥 Tipos de Usuarios

| Tipo | Préstamos Simultáneos | Días de Préstamo | Multa por Día |
|------|----------------------|------------------|---------------|
| **🎓 Estudiante** | 3 libros | 15 días | $10 |
| **👨‍🏫 Profesor** | 5 libros | 30 días | $5 |

---

## 💾 Sistema de Persistencia

### Gestión de Archivos:
La clase `Archivo` en el paquete `utils` se encarga de:

- **Guardar datos** automáticamente después de cada operación
- **Cargar datos** al iniciar la aplicación
- **Manejar archivos** de texto para cada entidad
- **Formatear datos** para almacenamiento y recuperación

### Archivos utilizados:
- `libros.txt` - Catálogo de libros
- `usuarios.txt` - Registro de usuarios
- `prestamos.txt` - Historial de préstamos

---

## 🚀 Comenzar

### Prerrequisitos
- Java 17 o superior
- IDE (IntelliJ IDEA recomendado)

### Ejecución
```bash
# Compilar
javac -d bin src/*.java

# Ejecutar
java -cp bin Main
