# springboot-pcf
Spring boot Rest application to perform CURD operation. The application is deployed in Cloud foundry

## Endpoint Information:

__Base URL: https://springboot-demo.cfapps.io/api__

##Resource description:
- POST    /employees
- GET     /employees
- GET     /employees/{employee_id}
- PUT     /employees
- DELETE  /employees/{employee_id}


## Sample Call:

- ### POST 
  - ##### URL: https://springboot-demo.cfapps.io/api/employees

  - Request Body:
      ```json
      {
        "firstName": "Murugeswaran",
        "lastName": "Vellaiappan",
        "email": "test@testplace.com"
      }
      ```
  - Response Body:
   ```json
    {
      "id": 1,
      "firstName": "Murugeswaran",
      "lastName": "Vellaiappan",
      "email": "test@testplace.com"
    }
    ```
- ### GET 
  - ##### URL: https://springboot-demo.cfapps.io/api/employees

  - Request Body:
      ```json
      None
      ```
  - Response Body:
   ```json
    [
      {
        "id": 1,
        "firstName": "Murugeswaran",
        "lastName": "Vellaiappan",
        "email": "test@testplace.com"
      }
    ]
    ```    

- ### GET 
  - ##### URL: https://springboot-demo.cfapps.io/api/employees/1

  - Request Body:
      ```json
      None
      ```
  - Response Body:
   ```json
    {
        "id": 1,
        "firstName": "Murugeswaran",
        "lastName": "Vellaiappan",
        "email": "test@testplace.com"
    }
    ```    

- ### PUT 
  - ##### URL: https://springboot-demo.cfapps.io/api/employees

  - Request Body:
      ```json
      {
        "id":1,
        "firstName": "Murugeswaran",
        "lastName": "V",
        "email": "test@testplace.com"
    }
      ```
  - Response Body:
   ```json
    {
      "id": 1,
      "firstName": "Murugeswaran",
      "lastName": "V",
      "email": "test@testplace.com"
    }
    ```
- ### DELETE 
  - ##### URL: https://springboot-demo.cfapps.io/api/employees/1

  - Request Body:
      ```json
      None
      ```
  - Response Body:
   ```json
    Deleted employee id - 1
    ```
