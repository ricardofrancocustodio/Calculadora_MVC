# 1. Introduction
**Project Name**: Calculator  
**Objective**: Develop a Calculator application that allows basic mathematical operations. The goal is to implement a Calculator using different software architectures for practical learning.

**Scope**: The project should cover basic arithmetic operations using MVC architecture.

# 2. Functional Requirements

## 2.1. Basic Mathematical Operations
- **FR01**: The calculator should allow the user to perform addition operations.
- **FR02**: The calculator should allow the user to perform subtraction operations.
- **FR03**: The calculator should allow the user to perform multiplication operations.
- **FR04**: The calculator should allow the user to perform division operations.
- **FR05**: The calculator should allow the user to clear the current input (reset function).

## 2.2. Input and Display
- **FR06**: The calculator should accept numerical input from the user.
- **FR07**: The calculator should display the result of the operation on the interface.
- **FR08**: The interface should show a history of performed operations, allowing the user to review past calculations.

## 2.3. Input Validation
- **FR09**: The calculator should prevent division by zero, displaying an appropriate error message.
- **FR10**: The calculator should validate user input to accept only numerical values.

## 2.4. Extra Features (for more advanced architecture)
- **FR13**: The calculator should allow the execution of more complex operations, such as percentage calculation and square root.
- **FR14**: The calculator should have a configuration module to switch between operation modes (scientific or basic).

# 3. Non-Functional Requirements

## 3.1. Performance
- **NFR01**: The calculator should return the result of any operation in less than 1 second.

## 3.2. Usability
- **NFR02**: The user interface should be intuitive and simple, allowing anyone to use it without the need for a manual.

## 3.3. Scalability
- **NFR03**: The application should be developed in a modular way to allow future extensions, such as adding new operations or integrating with other systems.

## 3.4. Maintainability
- **NFR04**: The code should be well documented, following best programming practices, facilitating maintenance and the addition of new features.

## 3.5. Portability
- **NFR05**: The application should be developed to run on different environments (desktop, web) without major code changes.

## 3.6. Security
- **NFR06**: The application should validate all user inputs to prevent possible errors and ensure the correct functioning of the calculator.

# 4. Integration Requirements
- **IR01**: For versions of the calculator implemented using architectures like Microservices, calculation services (e.g., addition, subtraction) should communicate through REST APIs.
- **IR02**: For event-driven architecture, the calculator should use an event system to perform and log operations.
- **IR03**: For layered and MVC architectures, the components (Model, View, Controller) must be decoupled, allowing replacement and alteration of components without impacting other layers.

# 5. Constraints
- **C01**: The project should be initially implemented in a programming language supported by IntelliJ, such as Java or Kotlin.
- **C02**: The application should be developed considering the possibility of being portable to different environments and frameworks.

# 6. Final Considerations
- **FC01**: The application will be developed in multiple versions, each exploring a different type of software architecture.
- **FC02**: During development, best practices of the chosen software architecture will be followed for each version of the calculator.


