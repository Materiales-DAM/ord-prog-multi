# FilmsApp

## Main Activity (3 puntos)

Modifica la actividad principal para añadir un RecyclerView de películas (Film):
- Define un layout para cada película:
  - Se deben mostrar todos los campos de la película
    - Añade un botón con el texto "Eliminar"
- Modificar FilmAdapter de forma que acepte una lista de películas (List<Film>)
- Modifica MainActivity para que el RecyclerView use el FilmAdapter:
  - Carga los datos que hay en MainActivity
  - Haz que las películas aparezcan en filas de dos columna
  - Debajo del RecyclerView pon un botón "Añadir"

## AddFilmActivity (3 puntos)

Crea una actividad que permitea meter los datos de una película:
  - Utiliza ConstraintLayout
  - Coloca los EditText alinéados
  - En la parte inferior de la pantalla, pon dos botones uno al lado del otro:
    - Aceptar
    - Cancelar