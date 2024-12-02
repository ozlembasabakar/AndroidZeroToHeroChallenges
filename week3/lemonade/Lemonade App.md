### Overview:
Create a simple app where users can simulate making and drinking lemonade. This homework focuses on building a basic UI, handling user interactions, and managing app state transitions. Either View-Based UI or Jetpack Compose can be used.

### Requirements:
1. Create a UI with the following components:
- An `ImageView` to display images for the current state of the app (lemon, squeezed lemon, lemonade, or empty glass).
- A `TextView` to display instructions for the user.
- Optional: A `Button` to restart the process (in addition to tapping the image).

2. Define the app flow in four states:
- **Pick a Lemon**: Display a lemon image with a prompt, ***Tap the lemon to pick it.***
- **Squeeze the Lemon**:
    - Replace the lemon image with a squeezed lemon image.
    - Show the prompt, ***Tap the lemon to squeeze it.***
    - Require the user to tap a random number of times to move to the next state.
- **Drink Lemonade**: Replace the squeezed lemon image with a glass of lemonade and prompt, ***Tap the lemonade to drink it.***
- **Restart**: Replace the glass of lemonade with an empty glass and prompt, ***Tap the empty glass to start again.***

3. Implement functionality:
- Use click listeners to handle interactions with the `ImageView`.
- Generate a random number to determine how many taps are needed in the ___Squeeze the Lemon___ step.
- Manage state transitions programmatically, ensuring the correct image and prompt are displayed for each state.

4. Include at least 4 images in your `drawable` folder.

### Learning Goals:
- Understand how to create a basic app layout using `Button`, `TextView`, and `ImageView`.
- Learn to handle button click events using `onClickListener` or `onClick`.
- Learn how to manage and transition between multiple app states programmatically.
- Understand how to use drawable assets for images and update them dynamically.
