### Overview:
Create a simple app where users can add colors to the favorites list and generate new color. This homework focuses on building a basic UI and handling user interactions. Either View-Based UI or Jetpack Compose can be used.

### Requirements:
1. Create a UI with the following components:
- An `ImageView` to display the generated color.
- A `Button` labeled ***Generate*** to generate a color swatch and its RGB values.
- A `Button` labeled ***Save Color*** to saves the current generated color to the ***Favorites*** list. This list must have at most 5 elements.
- A list (this can be `Column` or `Linear Layout` with `TextView`) to display the favorite colors.
- Optional: Allow users to set the last added color to ***Favorites*** as the current background color.
 
### Learning Goals:
- Understand how to create a basic list using `Button`, `Column` or `Linear Layout` with `TextView`, and `ImageView`.
- Learn to handle button click events using `onClickListener` or `onClick`.
- Learn how to manage and transition app state programmatically.
- Understand updateing the ui programmatically.
