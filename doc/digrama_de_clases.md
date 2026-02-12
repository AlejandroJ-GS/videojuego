``` mermaid
classDiagram
Usuario "0..N"<--"1" Personaje
Videojuego "0..1"*--"0..N"Usuario
Videojuego "1"*--"1..N" Mapa
Videojuego "1"*--"0..N" Personaje
Mapa "1"*--"1..N" Zona
Videojuego "1..N" <-- "1" App
Usuario "0..N" <-- "1" App

class Usuario{
- String nombre
- String id
- String correo
- Personaje personaje
- List <Videojuego> videojuegos
}

class Personaje{
- String rol
- String descripción
- int nivel
}
class Videojuego{
- String codJuego
- String género
- String dispositivo
- double precio
- List <Mapa> mapas 
- List <Usuario> usuarios 
- List <Personaje> personajes 
}

class Mapa{
- String tamaño
- String descripción
- int zonas
- int numUsuario
}

class Zona{
-String tamaño
-String descripcion
-String tipo
}
class App{
-List <Usuario> usuarios
-List <Videojuego> videojuegos
}
```