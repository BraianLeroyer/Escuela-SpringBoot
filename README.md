# Escuela SpringBoot - Spring Boot

Proyecto de **microservicio** desarrollado con **Spring Boot** para la gestión de reservaciones.  
Incluye sistema completo de autenticación con **JWT**.

---

## 🚀 Tecnologías Utilizadas

- **Spring Boot 3**
- **Spring Security + JWT**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok**
- **Validation**
- **Maven**

---

## ✨ Funcionalidades Implementadas

### Autenticación (Auth)
- Registro de usuarios (`POST /api/auth/register`)
- Login de usuarios (`POST /api/auth/login`)
- Autenticación con **JWT** (stateless)
- Protección de rutas con Spring Security
- Roles de usuario (USER / ADMIN)

### Próximas funcionalidades (en desarrollo)
- Gestión de Reservaciones
- CRUD de Servicios
- Gestión de Clientes

---

## 🛠️ Requisitos Previos

- **Java 17** o superior
- **PostgreSQL** 15+
- **Maven**

---

## ⚙️ Configuración Local

### 1. Clonar el repositorio
```bash
git clone https://github.com/BraianLeroyer/Escuela-SpringBoot.git
cd reservaciones-service
2. Configurar Base de Datos
Crea una base de datos en PostgreSQL:
SQLCREATE DATABASE reservaciones;
3. Configurar variables de entorno
Crea un archivo .env en la raíz del proyecto:
envDB_USERNAME=postgres
DB_PASSWORD=tu_contraseña
JWT_SECRET=MiClaveSuperSecretaParaDesarrollo2026
4. Ejecutar el proyecto
Bash./mvnw spring-boot:run
O desde tu IDE (IntelliJ / Cursor / Eclipse).

📡 Endpoints Disponibles
Auth
Método,Endpoint,Descripción
POST,/api/auth/register,Registro de usuario
POST,/api/auth/login,Inicio de sesión
Método,Endpoint,Descripción
GET,/api/test/hello,Endpoint de prueba
<img width="924" height="470" alt="Captura de pantalla (34)" src="https://github.com/user-attachments/assets/120568d1-c22b-4856-910c-e3d932fe41e5" />





























