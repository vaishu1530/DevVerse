# Use a Maven image to build the application
FROM maven:3.9.4-eclipse-temurin-21 as build

# Set the working directory inside the container
WORKDIR /app

# Copy everything to the container
COPY . .

# Build the application (skip tests to save time)
RUN mvn clean package -DskipTests

# ----
# Use a smaller JDK image to run the app
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy the built jar file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port Render uses
EXPOSE 10000

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
