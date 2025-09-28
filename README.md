<div align="center">

# 📚 Sistema de Gestión de Biblioteca

![Java](https://img.shields.io/badge/Java-17-red)
![POO](https://img.shields.io/badge/Paradigma-POO-blue)
![Estado](https://img.shields.io/badge/Estado-Terminado-success)

**Sistema completo de gestión bibliotecaria desarrollado en Java aplicando POO**

</div>

---

## 📖 Descripción
Sistema de gestión para bibliotecas que permite administrar **libros, usuarios, préstamos y multas**.  
Desarrollado aplicando principios de **Programación Orientada a Objetos** con herencia, polimorfismo y patrones de diseño.

---

## ✨ Características

- **📚 Gestión de Libros**: Catálogo completo con búsqueda y filtros
- **👥 Administración de Usuarios**: Diferentes tipos con privilegios específicos
- **🔄 Sistema de Préstamos**: Préstamos, devoluciones y renovaciones
- **💰 Control de Multas**: Cálculo automático por retrasos
- **📊 Reportes**: Estadísticas y listados organizados

---

## 🏗️ Arquitectura POO

### Principios implementados:
- **🔷 Herencia**: Usuarios y Items heredan de clases base
- **🔄 Polimorfismo**: Comportamientos específicos por tipo
- **📦 Encapsulamiento**: Datos protegidos con acceso controlado
- **🎯 Interfaces**: Contratos para comportamientos específicos

---

## 👥 Tipos de Usuarios

| Tipo | Préstamos Simultáneos | Días de Préstamo | Multa por Día |
|------|----------------------|------------------|---------------|
| **🎓 Estudiante** | 3 libros | 15 días | $10 |
| **👨‍🏫 Profesor** | 5 libros | 30 días | $5 |

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
