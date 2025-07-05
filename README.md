# ziphra-common

**ziphra-common** is a shared Java library used across both the client and server components of the [Ziphra Messenger](https://github.com/ziphra-messenger) platform.

This module centralizes reusable logic, data models, and utilities that ensure consistency and security throughout the application stack.

---

## 📦 Features

- Common models and DTOs for communication between layers
- Secure password validation with custom policies (via Passay)
- JWT handling for token generation and validation
- JSON parsing with `org.json`
- XML serialization via JAXB (`jakarta.xml.bind`)
- Logging abstraction using SLF4J
- Lightweight utilities with Apache Commons Lang
- Zero persistence or tracking — privacy by design

---

## 🧩 Dependencies

This module depends on the following libraries:

| Group ID                 | Artifact ID               | Version     | Scope      |
|--------------------------|---------------------------|-------------|------------|
| org.projectlombok        | lombok                    | —           | provided   |
| org.apache.commons       | commons-lang3             | —           | compile    |
| org.passay               | passay                    | 1.6.1       | compile    |
| org.json                 | json                      | 20240303    | compile    |
| io.jsonwebtoken          | jjwt                      | 0.9.1       | compile    |
| org.slf4j                | slf4j-api                 | —           | compile    |
| jakarta.activation       | jakarta.activation-api    | 2.0.1       | compile    |
| jakarta.xml.bind         | jakarta.xml.bind-api      | 4.0.0       | compile    |
| com.sun.xml.bind         | jaxb-impl                 | 4.0.3       | runtime    |

> ⚠️ Note: This library uses Lombok. Make sure annotation processing is enabled in your IDE.

---

## 🛠️ How to Use

Add the following dependency to your Maven project:

```xml
<dependency>
  <groupId>ar.ziphra</groupId>
  <artifactId>ziphra-common</artifactId>
  <version>2.3.2-SNAPSHOT</version>
</dependency>
