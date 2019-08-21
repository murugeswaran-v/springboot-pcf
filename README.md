# springboot-pcf
Spring boot Rest application to perform CURD operation. The application is deployed in Cloud foundry

Endpoint Information:
Base URL: https://springboot-demo.cfapps.io/api

Resource description:
POST    /employees 
GET     /employees
GET     /employees/{employee_id}
PUT     /employees
DELETE  /employees/{employee_id}


Sample Call:

• POST https://springboot-demo.cfapps.io/api/employees
Request Body: 
{
  "firstName": "Murugeswaran",
  "lastName": "Vellaiappan",
  "email": "test@testplace.com"
}

Response Body:
{
    "id": 1,
    "firstName": "Murugeswaran",
    "lastName": "Vellaiappan",
    "email": "test@testplace.com"
}

• GET https://springboot-demo.cfapps.io/api/employees
Request Body: None
Response Body:
[
  {
        "id": 1,
        "firstName": "Murugeswaran",
        "lastName": "Vellaiappan",
        "email": "test@testplace.com"
    }
]

• GET https://springboot-demo.cfapps.io/api/employees/1
Request Body: None
Response Body:
{
    "id": 1,
    "firstName": "Murugeswaran",
    "lastName": "Vellaiappan",
    "email": "test@testplace.com"
}

• PUT https://springboot-demo.cfapps.io/api/employees
Request Body: 
{
  "id":1,
  "firstName": "Murugeswaran",
  "lastName": "V",
  "email": "test@testplace.com"
}

Response Body:
{
    "id": 1,
    "firstName": "Murugeswaran",
    "lastName": "V",
    "email": "test@testplace.com"
}

• DELETE https://springboot-demo.cfapps.io/api/employees/1
Request Body: None
Response Body:
  Deleted employee id - 1
