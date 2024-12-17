### Overview
Create an app where users can sent and received messages. This homework focuses on  building a basic UI, handling user interactions, working with lists, etc. You may use View-Based UI or Jetpack Compose to complete this task.

You can find the design reference for this homework: [Figma Design Link]([https://www.figma.com/design/LYKfnNqma76fcppvYgm2HV/Image-Detection-Chat-App-(Community)-(Copy)?node-id=302-205&node-type=canvas&t=VZncIXUWioeYSGUa-0](https://www.figma.com/design/LYKfnNqma76fcppvYgm2HV/Image-Detection-Chat-App-(Community)-(Copy)?node-id=302-205&node-type=canvas&t=VZncIXUWioeYSGUa-0))

Please make sure to implement the given design as closely as possible.

### Requirements
- Implement `Landing`, `Phone Gallery`, `Upload - Chat Start` and `Chat` screens.
- Use resources from figma design. 
- Write clean, readable, and reusable code with proper comments.
- Implement multiple language support. 
- Implement light and dark themes.
- Create a list for messages and use that in `Chat` screen to obtain the design.

### Flow
1. `Landing` screen should be shown. 
2. When `gallery` icon pressed, should navigate to the `Phone Gallery` screen. 
3. Pressed one of the picture from the list, should navigate to the `Upload - Chat Start` screen.
   - You can display same picture everytime, or display selected picture at `Upload - Chat Start` screen. 
5. After `What is this image all about?` text selected, should navigate to the `Chat screen`. 

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

### Learning Goals:
- Understand how to create a basic app layout using list(`RecyclerView`, `Column`, etc.), `Button`, `TextView,` and `ImageView`.
- Learn to handle button click events using `onClickListener` or `onClick`.
- Practice basic navigation operations.
- Practice using Figma.
