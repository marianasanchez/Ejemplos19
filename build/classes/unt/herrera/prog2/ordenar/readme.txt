Una persona tiene dni, apellido, nombre, fecha de nacimiento y nacionalidad.
Dos personas son iguales si tienen el mismo dni
La nacionalidad tiene un nombre y un pais.
Debo ordenar las nacionalidades por nombre
Debo ordenar las personas por:
* apellido  y nombre O 
* por dni O 
* por fecha de nacimiento y por apellido y nombre

Comparator<Persona> fechaComparator = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                if (orden == CriterioOrdenamiento.ASCENDENTE)
                    return p1.getFechaNacimiento().compareTo(p2.getFechaNacimiento());
                else
                    return p1.getFechaNacimiento().compareTo(p2.getFechaNacimiento());
            }
    };



Comparator<Persona> comp1;
    if (orden == CriterioOrdenamiento.ASCENDENTE)
        comp1 = (p1, p2) -> p1.getDni().compareTo(p2.getDni());
    else
        comp1 = (p2, p1) -> p2.getDni().compareTo(p1.getDni());