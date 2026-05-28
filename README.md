# Rewards Application

This is springboot application that calculates reward points for customers based on thrie transaction

##Logic

- 2 points for every dollar above 100 points
- 1 point for every dollar between 50 to 100
- no points below 50

##API

GET  /api/rewards
Returns reward points grouped by month and customer

## Tech used :

- Java
- Springboot
- Maven

## How to run:

1. Clone Repository
2. Run application:
    mvn spring-boot:run
3. open browser:
   http://localhost:8080/api/rewards

## Structure:

- controller -> API layer
- service -> business logic
- repository -> sample data
- model -> data classes
