# Dish Management Application
## Overview

This application is designed to manage and display dish information, including creating a database, API, and a front-end dashboard. The dashboard allows toggling the published status of dishes and shows real-time updates.

## Backend Explanation

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
