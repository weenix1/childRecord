- Pfad / path
- Query Parameter
- Http Verb: GET, POST, PUT, DELETE (HEAD, OPTIONS, PATCH, TRACE)
- Request Body

REST: Resources
Users / Products
Customer
order

load all users from the Server:
GET /api/users

load user with a particular Tag
GET /api/users?tag={tag}&name={name}

create new user
POST /api/createUser

delete user
DELETE /api/users/{id}

load user with a particular ID
GET /api/users/{id}

Update user
PUT /api/products/{id}

add Tags to products/ user
PUT /api/users/{id}/tags













