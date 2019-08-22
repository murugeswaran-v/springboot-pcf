# springboot-pcf
Spring boot Rest application to perform CURD operation. The application is deployed in Cloud foundry

## Endpoint Information:

__Base URL: https://springboot-demo.cfapps.io/api__

## Resource description:
### Employee
- POST    /employees
- GET     /employees
- GET     /employees/{employee_id}
- PUT     /employees
- DELETE  /employees/{employee_id}

### Weather
- GET     /weather/{city}



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
- ### GET (Weather)
  - ##### URL: https://springboot-demo.cfapps.io/api/weather/Toronto

  - Request Body:
      ```json
      None
      ```
  - Response Body:
   ```json
    {
      "coord": {
          "lon": -79.39,
          "lat": 43.65
      },
      "weather": [
          {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
          }
      ],
      "base": "stations",
      "main": {
          "temp": 296.14,
          "pressure": 1014,
          "humidity": 41,
          "temp_min": 294.82,
          "temp_max": 297.59
      },
      "visibility": 14484,
      "wind": {
          "speed": 5.7,
          "deg": 300
      },
      "clouds": {
          "all": 1
      },
      "dt": 1566499092,
      "sys": {
          "type": 1,
          "id": 941,
          "message": 0.008,
          "country": "CA",
          "sunrise": 1566469794,
          "sunset": 1566519089
      },
      "timezone": -14400,
      "id": 6167865,
      "name": "Toronto",
      "cod": "200"
    }
    ```   
