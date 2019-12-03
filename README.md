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

## Consumes and Produces 
This API can consume and produce both JSON and XML depending on header content negotiation 
Specific URIs however expect specific format .
The below URIs are available 

##  GET /contactList  :
A method to return the entire contact list 

## GET /contactList/{name} : 
A method to return a specific contact in the  contact list 

## POST http://localhost:8080/contactList : 
A method  to add new user in the below JSON format 
{
    "name": "Personx,
    "homeNumber": "xxxx-xxxx",
    "cellNumber": "xxxx-xxxx",
    "workNumber": "xxxx-xxxx",
    "email": "xxxx"
}

## PUT /contactList/update/Personx : 
A method  to update existing user , user should be privided with updated data  in the below JSON format
note : name is the key value hence a new name mens a new entry and not an update 
{
    "name": "Personx,
    "homeNumber": "xxxx-xxxx",
    "cellNumber": "xxxx-xxxx",
    "workNumber": "xxxx-xxxx",
    "email": "xxxx"
}

## Delete /contactList/{name} : 
A method to delete a specific contact from the  contact list 



## PUT /loadOldDB :
A method to upload the previous phonebook DB in XML format (should be indicated inthe http header)
this method expects the list of Contacts in the below format 

<ArrayList>
    <item>
        <name>OldPersonx</name>
        <homeNumber>xxxx-xxxx</homeNumber>
        <cellNumber>xxxx-xxxx</cellNumber>
        <workNumber>xxxx-xxxx</workNumber>
        <email>xxxx</email>
    </item>
    <item>
        <name>OldPersonx</name>
        <homeNumber>xxxx-xxxx</homeNumber>
        <cellNumber>xxxx-xxxx</cellNumber>
        <workNumber>xxxx-xxxx</workNumber>
        <email>xxxx</email>
    </item>
</ArrayList>



More Detailed Documentation for this API has been created by Swagger
and is available via swagger UI if the project is running on local machine you can use the URL
(http://localhost:8080/swagger-ui.html#/)


## Versioning

This is the Version 1.0

## Authors

Dina Genena

