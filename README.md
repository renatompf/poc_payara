# poc_payara

## Description:
POC made in JAVA to learn the basics of [JakartaEE](https://jakarta.ee/) and [Payara Servers](https://www.payara.fish/).

In this project you have 3 endpoints. One to get all the users, another to insert a user and the last one to delete a user.

Every single endpoint has the same path, `/users`, the one thing that changes between the requests are the methods, there is a `GET`, a `POST` and a `DELETE`.

## Run the Application:

To run the application, the easiest way it's to launch it through [Docker](https://www.docker.com/) by running the command in the root of the project:

```bash
docker compose up
```

Then you can access the endpoints by using the following path:

```bash
http://localhost:8080/poc_payara-1.0-SNAPSHOT/api/users
```
