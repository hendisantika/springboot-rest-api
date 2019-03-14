# springboot-rest-api

## Testing the service

We are ready to test the outcome yet. Run the application and try accessing, modifying and deleting data by accessing these REST endpoints:

__GET__
```
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/people
```
should return all the entities in our database in JSON format.

__POST__
```
curl -H "Content-Type: application/json" -X POST -d '{"name":"Kiba","age":30}' http://localhost:8080/people
```
__DELETE__
```
curl -X DELETE http://localhost:8080/people/2
```
