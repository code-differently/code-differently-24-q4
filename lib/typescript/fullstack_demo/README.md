# Full-stack App Demo

## Purpose

This project demonstrates a fully working task management app built using NextJS and TypeScript. The app is deployed live on Vercel at https://code-differently-24-q4.vercel.app/

## Running the app

To run the app, copy the [.env.example](./.env.example) file as `.env` and setup the Clerk keys by setting up an account at https://clerk.dev. Once done, you can start up the local dev server with the following commands: 

```bash
npm install
npm run dev
```

## Architecture

The app is built using the React library running on the NextJS framework. The homepage is located at [src/app/page.tsx](./src/app/page.tsx) and contains the main `TodoApp` component.

The `TodoApp` component and sub-components uses `fetch` to get data from the backend API which is located at [src/app/api/todos/route.ts](./src/app/api/todos/route.ts).

The backend API gets a repository instance from [src/repositories/index.ts](./src/repositories/index.ts), using an environment variable to choose between a JSON repository implementation or a Redis version. For more on the repository pattern, [see this article on Medium](https://medium.com/@pererikbergman/repository-design-pattern-e28c0f3e4a30).

## Connecting to Redis

By default, the app is configured to store data on the web server in a JSON file (./src/repositories/db.json). You can connect it to a Redis database by creating one on Vercel (called Upstash KV). Then, set the `DB_TYPE` to `redis` in the `.env` file and configure the additional config keys listed in `.env.example.redis`.

## Deploying live

To deploy this app, sign up for an account on Vercel and create a project pointing to your fork of this repo. You'll need to configure the environment variables you setup in your local `.env` file using the Vercel UI.

## Tools

Here are a list of tools used to compile this demo. You can read the official documentation to learn how various aspects of the demo function.

* NextJS (https://nextjs.org)
* Vercel (https://vercel.com)
* Clerk (https://clerk.dev)
* React (https://react.dev)
* LowDB (https://github.com/typicode/lowdb)
* Upstash Redis (https://upstash.com/docs/redis/overall/getstarted)