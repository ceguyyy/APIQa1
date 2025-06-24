# 🧪 FakerAPI Companies Endpoint Test

This is a simple REST API test project for the `companies` endpoint from [FakerAPI](https://fakerapi.it/en).

## ✅ What it tests

Tests the API:
GET https://fakerapi.it/api/v1/companies?_quantity=<number>


It verifies that the number of returned companies matches the requested quantity:
- 20
- 5
- 1

---

## 🧰 Tools Used

- Java 17+
- [Maven](https://maven.apache.org/)
- [REST Assured](https://rest-assured.io/)
- JUnit 5
- IntelliJ IDEA (or any Java IDE)

---

## 🚀 How to Run

1. Clone this repo
2. import into IntelliJ
3. From IntelliJ, right-click the FakerApiTest.java file → Run

## Add the Dependencies into Pom.XML

  <!-- REST Assured -->
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>5.4.0</version>
            <scope>test</scope>
        </dependency>

        <!-- JUnit 5 -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.10.0</version>
            <scope>test</scope>
        </dependency>

        <!-- JSON Schema Validator -->
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>json-schema-validator</artifactId>
            <version>5.5.5</version>
        </dependency>
    </dependencies>
