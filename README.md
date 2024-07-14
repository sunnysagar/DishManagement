Backend [Link](https://github.com/sunnysagar/DishManagement/tree/master)

## Frontend Explanation

### React Application

1. **Components**: `DishDashboard` displays dishes and handles user interactions like toggling dish status.
2. **State Management**: `useState` and `useEffect` hooks manage and update the state of the dish list.

### Axios

- **Purpose**: Handles HTTP requests to the backend API.
- **Usage**: Fetches the list of dishes and sends requests to toggle dish status.

### WebSocket Integration

- **Purpose**: Receives real-time updates from the backend.
- **Implementation**: `SockJs` and `stompjs` libraries create a WebSocket connection. Subscribes to `/topic/dishes` to receive updates.
- **Benefits**: Automatically updates the UI when dish status changes, providing a dynamic user experience.

### UI and Styling

- **CSS**: `DishDashboard.css` styles the components for a visually appealing layout.
- **Interactivity**: Buttons change text and color based on the dish's published status, enhancing usability.
