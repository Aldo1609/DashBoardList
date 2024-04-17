
# DashBoardList

▶️ Progreso del proyecto: 100%

Este proyecto es una aplicacion demo usando Thymeleaf para mostrar una lista de ordernes, este proyecto se subio a AWS con los servicios EC2 y RDS (Mysql)

🔧 Back-end desarrollado en [Springboot 3.0]

    Video funcionamiento: https://www.youtube.com/watch?v=eDAOFk3W7eM

🔧 Base de datos en MySQL






## Requisitos

📏 JDK 17

📏 Springboot 3.0

📏 Script SQL:

```
CREATE TABLE orders (
    id SERIAL PRIMARY KEY,
    num_bodega INTEGER NOT NULL,
    num_order INTEGER NOT NULL,
    num_destiny INTEGER NOT NULL
);
```

```
INSERT INTO orders(num_bodega, num_order, num_destiny)
VALUES (1, 123456, 25);

INSERT INTO orders(num_bodega, num_order, num_destiny)
VALUES (25, 654321, 1);
```




## Referencias

Existen dos endpoints

- http://localhost:8080/dashboard (Muestra las ordenes con thymeleaf)
- http://localhost:8080/error (Esta pantalla se mostrara siempre que la url este mal)



## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/aldo-isaias-becerra-campos-591621200/)


