# quiz2web

Andar con ./mvnw clean compile spring-boot:run
Acceder a h2 mediante http://localhost:8080/h2-console
POST con:
curl -X POST http://localhost:8080/productos \
-H "Content-Type: application/json" \
-d '{"nombre":"Laptop","categoria":"Electrónica","precio":999.99,"activo":true}'

