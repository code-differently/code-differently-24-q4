# Full-stack App Demo

## Purpose

This project demonstrates a fully working task management app built using React, TypeScript, and Java. The app is deployed live on Fly.io at https://fullstack-demo-cold-breeze-8913.fly.dev/.

## Running the app

To run the app, you'll first need to configure the Java web server. Copy the [.env.development](./.env.development) file to `.env` and set up the Clerk keys by setting up an account at https://clerk.dev. Once done, you can start the server using the following command

```bash
./gradlew bootRun
```

You can access the site at https://localhost:8080.

If you want to test changes to the frontend client code, it would be easier to run the frontend react site separate. Navigate to [src/main/frontend](./src/main/frontend/) and run the React website as normal:

```bash
npm run dev
```

## Architecture

The app is built using the React library running on a Java web server. The homepage is located at [src/main/frontend/src/App.tsx](./src/main/frontend/src/App.tsx) and contains the main `TodoApp` component.

The `TodoApp` component and sub-components uses `fetch` to get data from the backend API which is located at [TodosController.java](./src/main/java/com/codedifferently/fullstack_demo/controller/TodosController.java).

The backend API gets a repository instance from a bean configured at [RepositoryConfiguration.java](./src/main/java/com/codedifferently/fullstack_demo/repository/RepositoryConfiguration.java), using an environment variable to choose between a JSON repository implementation or a Redis version. For more on the repository pattern, [see this article on Medium](https://medium.com/@pererikbergman/repository-design-pattern-e28c0f3e4a30).

## Connecting to Redis

By default, the app is configured to store data an in-memory which gets cleared out as soon as the web server is shut down or restarts. You can connect it to a Redis database by creating one at Upstash or on Vercel (called Upstash KV). Then, uncomment the commented out lines in [application.yml](./src/main/resources/application.yml) and update your `.env` file.

## Deploying live

To deploy this app, sign up for an account on Fly.io and create a project pointing to your fork of this repo. You can run the `./gradlew build` to build the app and then use `fly deploy` utility command to deploy the Java web server to production. Fly.io leverages the [Dockerfile](./Dockerfile) config to run the web server.

## Tools

Here are a list of tools used to compile this demo. You can read the official documentation to learn how various aspects of the demo function.

* React (https://react.dev)
* Java Spring Boot (https://spring.io/projects/spring-boot)
* Java Spring MVC (https://spring.io/guides/gs/serving-web-content)
* Upstash Redis (https://upstash.com/docs/redis/overall/getstarted)
* Fly.io (https://fly.io)
* Docker (https://docs.docker.com/build/concepts/dockerfile/)