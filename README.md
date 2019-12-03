# PbApi
Creating an Example API for a phonebook Application

This API is designed to enable the interfacing of a phone book application over HTTP.
This API assumes the simplest design for the phone book as a collection of Objects with a fixed number of fields .
This API temporarily stores the data in a local Static ArrayList for testing purposes which is used instead of a databse,
which should be provided by the phonebook application .



## User Information

This API Supoprts both JSON and XML formats for requests/responses ,so it can support both the new PB as well 
as load the old pb DB the type is expected to be determined in the HTML header via content negotiation which should 
be indicated in the "Accept" and "Content-Type" fields .

More Detailed Documentation for this API has been created by Swagger
and is available via swagger UI (http://localhost:8080/swagger-ui.html#/)



## Versioning

This is the Version 1.0

## Authors

Dina Genena

