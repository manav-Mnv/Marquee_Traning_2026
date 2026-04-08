// MERN STACK
// M - MongoDB
// E - Express
// R - React
// N - Node.js
// 1. MongoDB - NoSQL database
// 2. Express - Web application framework for Node.js
// 3. React - JavaScript library for building user interfaces
// 4. Node.js - JavaScript runtime environment

//framework - a collection of libraries and tools that provide a structure for building applications
//library - a collection of pre-written code that can be used to perform specific tasks

// MERN stack is a popular choice for building web applications because it allows developers to use JavaScript 
// for both the front-end and back-end development, making it easier to learn and work with. It also provides a 
// powerful and flexible set of tools for building scalable and efficient applications.

//graph of MERN stack
// Front-end (React) <--> Back-end (Express + Node.js) <--> Database (MongoDB)

//js ecosystem - a collection of libraries, frameworks, and tools that are built on top of 
// JavaScript and are used for web development.


//front-end - the part of a web application that users interact with directly,
// typically built using HTML, CSS, and JavaScript.
//back-end - the part of a web application that handles the logic and data processing,
// typically built using a server-side programming language like Node.js, Python, or Ruby.
//Database - a structured collection of data that can be accessed and manipulated by a web application,
// typically using a database management system like MongoDB, MySQL, or PostgreSQL.
//database servers - example: MongoDB, MySQL, PostgreSQL, rust, redis, cassandra, , google cloud, amazon web services, 
//azure, firebase, heroku, digital ocean, linode, vultr, scaleway, ovhcloud, cloudflare, 
//fastly, akamai, cloudflare workers, vercel, netlify, render, fly.io, railway, glitch, replit

//The road btweeen the forntend-database and frontend-backend and backend-database
//frontend-backend - HTTP requests and responses, RESTful APIs, GraphQL, WebSockets
//backend-database - database queries, ORMs (Object-Relational Mapping), ODMs (Object-Document Mapping),
//frontend-database - direct database access (not recommended), serverless functions, GraphQL, WebSockets
//forntend-backend-database - full-stack development, serverless architecture, microservices, cloud computing

//server side and client side 
//server side - the part of a web application that runs on the server, typically built using a server-side 
// programming language like Node.js, Python, or Ruby.
//client side - the part of a web application that runs on the user's device, typically built 
// using HTML, CSS, and JavaScript.

// tell me in depth about server side and client side in web development

// Server-side development involves writing code that runs on the server and handles tasks such as processing 
// requests, managing databases, and generating dynamic content. This can include building APIs, handling 
// authentication and authorization, and implementing business logic. Server-side code is typically written in 
// languages like Node.js, Python, Ruby, or PHP.
//cleint-side development involves writing code that runs on the user's device and handles tasks such as rendering
// the user interface, handling user interactions, and making API calls to the server. This can include building 
// responsive layouts, implementing client-side routing, and managing state. Client-side code is typically


//example:- when a user visits a website and click on a button of login telll me in deptha dnflowchart of 
// fonrtend and backedn and database and how they interact with each other
// 1. User clicks on the login button on the front-end (React).
// 2. The front-end sends an HTTP POST request to the back-end (Express + Node.js) with the user's login
//    credentials.
// 3. The back-end receives the request and processes it. It checks the credentials against the database (MongoDB).
// 4. If the credentials are valid, the back-end generates a JSON Web Token (JWT) and sends it back to the front-end.
// 5. The front-end receives the JWT and stores it (e.g., in localStorage or a cookie) for future authenticated requests.
// 6. The user is now logged in and can access protected routes or features on the front-end, which will include the 
// JWT in the headers of subsequent requests to the back-end for authentication and authorization.
// Flowchart:
// User (Front-end) --> Clicks Login Button --> Front-end (React) --> Sends HTTP POST Request --> Back-end (Express + Node.js) 
// --> Processes Request --> Checks Credentials --> Database (MongoDB) --> Validates Credentials --> Generates JWT 
// --> Sends JWT Back to Front-end --> Front-end Receives JWT --> Stores JWT --> User Logged In
//TELL ME DATABASE PART :
// 1. The back-end receives the login request and extracts the user's credentials (e.g., username and password).
// 2. The back-end queries the database (MongoDB) to find a user document that matches the provided username.
// 3. If a matching user document is found, the back-end compares the provided password with the stored password hash
//    using a hashing algorithm (e.g., bcrypt).
// 4. If the password is valid, the back-end generates a JSON Web Token (JWT) that contains the user's information and
//    sends it back to the front-end for authentication and authorization in future requests.
// 5. If the credentials are invalid, the back-end sends an error response back to the front-end, which can display an
//    appropriate error message to the user.


// tell me in depth about the flow of data and how the front-end and back-end interact with each other in a web application


























































