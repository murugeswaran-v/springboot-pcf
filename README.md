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
   - Gets the current and forecast weather for the given city name



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
        "city_name": "Toronto",
        "timezone": -14400,
        "curr_temp": 296.77,
        "humidity": 73,
        "curr_temp_min": 295.15,
        "curr_temp_max": 298.15,
        "forecast": [
            {
                "date_time": "2019-08-26 21:00:00",
                "forecast_temp": 295.56,
                "forecast_humidity": 55,
                "forecast_temp_min": 294.478,
                "forecast_temp_max": 295.56
            },
            {
                "date_time": "2019-08-27 00:00:00",
                "forecast_temp": 290.71,
                "forecast_humidity": 65,
                "forecast_temp_min": 289.9,
                "forecast_temp_max": 290.71
            },
            {
                "date_time": "2019-08-27 03:00:00",
                "forecast_temp": 292.65,
                "forecast_humidity": 67,
                "forecast_temp_min": 292.105,
                "forecast_temp_max": 292.65
            },
            {
                "date_time": "2019-08-27 06:00:00",
                "forecast_temp": 292.37,
                "forecast_humidity": 70,
                "forecast_temp_min": 292.1,
                "forecast_temp_max": 292.37
            },
            {
                "date_time": "2019-08-27 09:00:00",
                "forecast_temp": 290.119,
                "forecast_humidity": 95,
                "forecast_temp_min": 290.119,
                "forecast_temp_max": 290.119
            },
            {
                "date_time": "2019-08-27 12:00:00",
                "forecast_temp": 291.3,
                "forecast_humidity": 94,
                "forecast_temp_min": 291.3,
                "forecast_temp_max": 291.3
            },
            {
                "date_time": "2019-08-27 15:00:00",
                "forecast_temp": 292.1,
                "forecast_humidity": 91,
                "forecast_temp_min": 292.1,
                "forecast_temp_max": 292.1
            },
            {
                "date_time": "2019-08-27 18:00:00",
                "forecast_temp": 294.093,
                "forecast_humidity": 85,
                "forecast_temp_min": 294.093,
                "forecast_temp_max": 294.093
            },
            {
                "date_time": "2019-08-27 21:00:00",
                "forecast_temp": 293.6,
                "forecast_humidity": 90,
                "forecast_temp_min": 293.6,
                "forecast_temp_max": 293.6
            },
            {
                "date_time": "2019-08-28 00:00:00",
                "forecast_temp": 293.207,
                "forecast_humidity": 93,
                "forecast_temp_min": 293.207,
                "forecast_temp_max": 293.207
            },
            {
                "date_time": "2019-08-28 03:00:00",
                "forecast_temp": 293.4,
                "forecast_humidity": 96,
                "forecast_temp_min": 293.4,
                "forecast_temp_max": 293.4
            },
            {
                "date_time": "2019-08-28 06:00:00",
                "forecast_temp": 292.7,
                "forecast_humidity": 98,
                "forecast_temp_min": 292.7,
                "forecast_temp_max": 292.7
            },
            {
                "date_time": "2019-08-28 12:00:00",
                "forecast_temp": 289.434,
                "forecast_humidity": 90,
                "forecast_temp_min": 289.434,
                "forecast_temp_max": 289.434
            },
            {
                "date_time": "2019-08-28 15:00:00",
                "forecast_temp": 294.434,
                "forecast_humidity": 68,
                "forecast_temp_min": 294.434,
                "forecast_temp_max": 294.434
            },
            {
                "date_time": "2019-08-28 18:00:00",
                "forecast_temp": 295.442,
                "forecast_humidity": 53,
                "forecast_temp_min": 295.442,
                "forecast_temp_max": 295.442
            },
            {
                "date_time": "2019-08-28 21:00:00",
                "forecast_temp": 294.834,
                "forecast_humidity": 54,
                "forecast_temp_min": 294.834,
                "forecast_temp_max": 294.834
            },
            {
                "date_time": "2019-08-29 00:00:00",
                "forecast_temp": 290.032,
                "forecast_humidity": 78,
                "forecast_temp_min": 290.032,
                "forecast_temp_max": 290.032
            },
            {
                "date_time": "2019-08-29 03:00:00",
                "forecast_temp": 288.791,
                "forecast_humidity": 83,
                "forecast_temp_min": 288.791,
                "forecast_temp_max": 288.791
            },
            {
                "date_time": "2019-08-29 06:00:00",
                "forecast_temp": 287.919,
                "forecast_humidity": 83,
                "forecast_temp_min": 287.919,
                "forecast_temp_max": 287.919
            },
            {
                "date_time": "2019-08-29 09:00:00",
                "forecast_temp": 284.793,
                "forecast_humidity": 95,
                "forecast_temp_min": 284.793,
                "forecast_temp_max": 284.793
            },
            {
                "date_time": "2019-08-29 12:00:00",
                "forecast_temp": 286.334,
                "forecast_humidity": 88,
                "forecast_temp_min": 286.334,
                "forecast_temp_max": 286.334
            },
            {
                "date_time": "2019-08-29 15:00:00",
                "forecast_temp": 291.7,
                "forecast_humidity": 66,
                "forecast_temp_min": 291.7,
                "forecast_temp_max": 291.7
            },
            {
                "date_time": "2019-08-29 18:00:00",
                "forecast_temp": 293.5,
                "forecast_humidity": 61,
                "forecast_temp_min": 293.5,
                "forecast_temp_max": 293.5
            },
            {
                "date_time": "2019-08-29 21:00:00",
                "forecast_temp": 293.1,
                "forecast_humidity": 61,
                "forecast_temp_min": 293.1,
                "forecast_temp_max": 293.1
            },
            {
                "date_time": "2019-08-30 00:00:00",
                "forecast_temp": 288.961,
                "forecast_humidity": 77,
                "forecast_temp_min": 288.961,
                "forecast_temp_max": 288.961
            },
            {
                "date_time": "2019-08-30 03:00:00",
                "forecast_temp": 287.661,
                "forecast_humidity": 86,
                "forecast_temp_min": 287.661,
                "forecast_temp_max": 287.661
            },
            {
                "date_time": "2019-08-30 06:00:00",
                "forecast_temp": 287.888,
                "forecast_humidity": 87,
                "forecast_temp_min": 287.888,
                "forecast_temp_max": 287.888
            },
            {
                "date_time": "2019-08-30 09:00:00",
                "forecast_temp": 290.2,
                "forecast_humidity": 91,
                "forecast_temp_min": 290.2,
                "forecast_temp_max": 290.2
            },
            {
                "date_time": "2019-08-30 12:00:00",
                "forecast_temp": 291.022,
                "forecast_humidity": 94,
                "forecast_temp_min": 291.022,
                "forecast_temp_max": 291.022
            },
            {
                "date_time": "2019-08-30 15:00:00",
                "forecast_temp": 294.276,
                "forecast_humidity": 66,
                "forecast_temp_min": 294.276,
                "forecast_temp_max": 294.276
            },
            {
                "date_time": "2019-08-30 18:00:00",
                "forecast_temp": 296.129,
                "forecast_humidity": 51,
                "forecast_temp_min": 296.129,
                "forecast_temp_max": 296.129
            },
            {
                "date_time": "2019-08-30 21:00:00",
                "forecast_temp": 294.3,
                "forecast_humidity": 52,
                "forecast_temp_min": 294.3,
                "forecast_temp_max": 294.3
            },
            {
                "date_time": "2019-08-31 00:00:00",
                "forecast_temp": 288.7,
                "forecast_humidity": 72,
                "forecast_temp_min": 288.7,
                "forecast_temp_max": 288.7
            },
            {
                "date_time": "2019-08-31 03:00:00",
                "forecast_temp": 285.236,
                "forecast_humidity": 74,
                "forecast_temp_min": 285.236,
                "forecast_temp_max": 285.236
            },
            {
                "date_time": "2019-08-31 06:00:00",
                "forecast_temp": 283.544,
                "forecast_humidity": 80,
                "forecast_temp_min": 283.544,
                "forecast_temp_max": 283.544
            },
            {
                "date_time": "2019-08-31 09:00:00",
                "forecast_temp": 282.9,
                "forecast_humidity": 88,
                "forecast_temp_min": 282.9,
                "forecast_temp_max": 282.9
            },
            {
                "date_time": "2019-08-31 12:00:00",
                "forecast_temp": 284.1,
                "forecast_humidity": 85,
                "forecast_temp_min": 284.1,
                "forecast_temp_max": 284.1
            },
            {
                "date_time": "2019-08-31 15:00:00",
                "forecast_temp": 289.8,
                "forecast_humidity": 60,
                "forecast_temp_min": 289.8,
                "forecast_temp_max": 289.8
            },
            {
                "date_time": "2019-08-31 18:00:00",
                "forecast_temp": 292.098,
                "forecast_humidity": 49,
                "forecast_temp_min": 292.098,
                "forecast_temp_max": 292.098
            }
        ]
    }
    ```   
