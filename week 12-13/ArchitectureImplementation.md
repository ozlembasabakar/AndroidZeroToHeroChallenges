### Overview

Choose `SocialMediaApp`. This homework focuses on applying architectural patterns which is MVVM to the application. The goal is to develop clean, maintainable, and scalable code while implementing core app functionalities.

_! You may choose any architectural pattern suitable for your application. However, it will be sufficient to choose and apply one of them during the evaluation phase._

### Requirements
1. **Architecture Design**: Implement MVVM architecture pattern for your `SocialMediaApp`. Clearly define responsibilities for each layer (e.g., UI, Data, Domain).

_! Please create a mock data and get from the Data Layer for testing purpuses._

3. **State Management**: Implement a mechanism to handle UI state, such as `LiveData`, `StateFlow`, or a similar tool. Reflect loading, error, and success states in the UI.
4. **Dependency Injection**: Use a DI framework like `Koin` or `Hilt` to manage dependencies (e.g., ViewModelFactory, Repository).

### Optional
1. **Modularization**: Split the app into separate modules (e.g., app, core, features) to demonstrate scalability.

### Learning Goals:
- Understand and implement architectural patterns like MVVM.
- Learn to separate concerns and write modular, testable code.
- Practice handling state and managing dependencies using DI frameworks.
- Develop proficiency in managing data sources (network, local database) using the Repository pattern.
