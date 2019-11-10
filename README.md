# MiAguilaTrips
Proyecto para gestion de viajes Mi Aguila

Los pasos realizados para la ejecución de la actividad fueron los siguientes:

1.- Instalación de MongoDB:
Descargar instalador de la página www.mongodb.com
Ejecutar el instalador. 
Buscar el directorio donde se instaló. 
Ejecutar el servicio mongod.exe.
Ejecutar la consola de mongo: mongo.exe. 


2.- Migrar datos:
Desde consola del sistema operativo ubicado en la carpeta donde fue instalado MongoDB, ejecutar comando:
mongoimport --db=trips --collection=trips --type=json --file="C:\trips.json"

Ejemplo:
C:\Archivos de programa\Mongodb\Server\4.2\bin>mongoimport --db=trips --collection=trips --type=json --file="C:\trips.json"

Desde consola de mongodb validar la creación de la base de datos con el siguiente comando:

show dbs

Seleccionar la base de datos creada: "trips", mediante la ejecución del siguiente comando en la consola de mongo:

use trips

Validar la creación de la colección trips mediante el siguiente comando:

show collections

Validar la data importada mediante la ejecución del siguiente comando:

db.trips.find()

3.- Creación Repositorio en github utilizando Git flow:     

Creación de proyecto en rama master. 

Creación de rama develop. 

4.- Creación endpoints:

Se crea proyecto java implementando el patrón de diseño Data Transfer Object (DTO) 
con la siguiente estructura de paquetes:

com.miaguila.trips.resources -> Definir los endpoints REST.
com.miaguila.trips.interfaces -> Definir los métodos a implementar.
com.miaguila.tirps.TOs -> Definir los objetos que mapean los datos. 

Se hace commit y push a la rama Develop.

Se hace pull request a la rama Master. 






Para recibir las peticiones se definieron 4 endpoints definidos en el archivo TripResources.java:

    @GET
    @Path("/trips")
    @Produces("text/plain")
    public int getTotalTrips()


    @GET
    @Path("/{idcity}/trips")
    @Produces("text/plain")
    public int getTotalTripsbyCity(int city)


    @POST
    @Path("/trip")
    @Produces("text/plain")
    @Consumes("application/json")
    public boolean createTrip(Trip trip)

    @PUT
    @Path("/trip")
    @Produces("text/plain")
    @Consumes("application/json")
    public boolean updateTrip(Trip trip)



Las invocaciones por POST y PUT reciben un objeto json con la forma de la clase Trip.java y devuelven un booleano 
indicando si se realizó correctamente la acción. 

Las invocaciones por GET no reciben ningún objeto sino devuelven el valor del total de viajes. 



