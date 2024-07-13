# Dish Management Application
## Overview

This application is designed to manage and display dish information, including creating a database, API, and a front-end dashboard. The dashboard allows toggling the published status of dishes and shows real-time updates.

## Backend Explanation
- Backend is developed by using JAVA, SPRING BOOT, MYSQL(DATABASE)

### Spring Boot Application

1. **Controllers**: Handle HTTP requests. `DishController` manages dish-related operations.
2. **Services**: Contain business logic. `DishService` performs operations like fetching and toggling dish status.
3. **Repositories**: Interface with the database. `DishRepository` provides CRUD operations for `Dish` entities.

### WebSocket Configuration

- **Purpose**: Enables real-time updates to the frontend.
- **Implementation**: `WebSocketConfig` sets up WebSocket endpoints. `DishUpdateController` broadcasts dish updates to subscribed clients.
- **Benefits**: Ensures the frontend dashboard displays real-time changes made to dishes, enhancing user experience.

### CORS Configuration

- **Purpose**: Allows frontend (running on a different port) to communicate with the backend.
- **Implementation**: `WebConfig` class sets CORS policy to allow requests from `http://localhost:3000`.


## Summary

- **Backend**: Utilizes Spring Boot to create a robust API and WebSocket server, enabling CRUD operations and real-time updates.
- **Frontend**: Uses React for a responsive UI, Axios for API requests, and WebSockets for real-time data synchronization.

This combination ensures a seamless and interactive user experience, displaying up-to-date dish information dynamically.
