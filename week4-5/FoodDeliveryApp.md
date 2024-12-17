### Overview
Create an app where users can order food. This homework focuses on building a basic UI, handling user interactions, working with lists, etc. You may use View-Based UI or Jetpack Compose to complete this task.

You can find the design reference for this homework: [Figma Design Link](https://www.figma.com/design/R7oVjGHPOPHnYu1anTgpEE/%F0%9F%8D%94-Food-Ordering-App-UI-Kit-(Free)-(Community)-(Copy)?node-id=0-1&p=f&t=pdsA8FLGFyXSEwdB-0)

Please make sure to implement the given design as closely as possible.

### Requirements
- Implement `Splash screen`, `Homepage`, `Product listing page`, `Product details page` and `Profile` screens.
- Use resources from figma design. 
- Write clean, readable, and reusable code with proper comments.
- Implement multiple language support. 
- Implement light and dark themes.
- Create a list for product and use that in `Product listing page` and `Homepage` screen to obtain the design.

### Flow
1. `Splash screen` screen should be shown. 
2. When button pressed, should navigate to the `Homepage` screen. 
3. Pressed one of the restaurant from the list, should navigate to the `Product listing page` screen.
   - You can display same product for the everytime, or display selected restaurant's product at `Product details page` screen. 
4. After restaurant selection, should navigate to the `Product details page` screen. 
   - You can display same product for the everytime, or display selected restaurant's product at `Product details page` screen. 

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
   - Add `Profile` screen when pressed `Profile` icon in the `Homepage`. You can also show your CV on this page

### Learning Goals:
- Understand how to create a basic app layout using list(`RecyclerView`, `Column`, etc.), `Button`, `TextView,` and `ImageView`.
- Learn to handle button click events using `onClickListener` or `onClick`.
- Pass relevant data of the clicked item to a new screen.
- Practice navigation operations.
- Practice using Figma.
