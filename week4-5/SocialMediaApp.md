### Overview
Create an app where users can scroll on social media. This homework focuses on building a basic UI, handling user interactions, working with lists, etc. You may use View-Based UI or Jetpack Compose to complete this task.

You can find the design reference for this homework: [Figma Design Link](https://www.figma.com/design/osgv4l25V3DdTgKsLhujGV/Social-Media-App-Design-%7C-Social-Media-App---Tracely-(Community)?node-id=53-344&t=O8pcnKEOocu5uAzm-0)

Please make sure to implement the given design as closely as possible.

_! There is no need to perform real login or signup operations. This exercise focuses on building UI and basic navigation operations._

_! Please use non-scrollable lists. This feature will be added after weeks 12 and 13._

### Requirements
- Implement `Splash screen`, `Signup Screen`, `Login Screen` and `Main Screen` screens.
- Use resources from figma design. 
- Write clean, readable, and reusable code with proper comments.
- Implement multiple language support. 
- Implement light and dark themes.
- Create a list for post and use that in `Main Screen` screen to obtain the design.

### Flow
1. `Splash screen` screen should be shown. 
2. When button pressed, should navigate to the `Signup Screen` screen.
3. When pressed `Login` next to the `Already have account?`, should navigate to the `Login Screen`.
4. When pressed `Sign in` next to the `Don’t have account?`, should navigate to the `Signup Screen`.
5. Pressed `Sign Up` or `Login`, should navigate to the `Main Screen` screen.

### Submission
1. GitHub Repository:
   - Include your code in a new branch of the main repository of homeworks.
   - Provide a README file with:
     - A short description of the task.
     - Steps to set up and run the app.
     - A list of features you implemented.

2. Screenshots or Videos:
   - Add screenshots or a short video demonstrating your app in action.

3. Optional:
   - Document any challenges faced or learnings in a separate markdown file (LEARNING.md).
   - Add `Profile` screen when pressed `Profile` icon in the `Main Screen`. You can also show your CV on this page
   - Add `Main Screen With Custom NavBar` screen.
   - Add placeholder behaviour to the `Login Screen` and `Signup Screen`. Which are `Signup Screen With Placeholder` and `Login Screen With Placeholder`.
   - Add dialogs when pressed the `Google` or `Facebook` icons. There is no need to perform real login operations. Opening a text dialog is enough. 

### Learning Goals:
- Understand how to create a basic app layout using list, `Button`, `TextView,` and `ImageView`.
- Learn to handle button click events using `onClickListener` or `onClick`.
- Practice detail of the UI design.
- Practice navigation operations.
- Practice using Figma.
